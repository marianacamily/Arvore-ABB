import java.util.ArrayList;
import java.util.List;

// Código utilizado: https://stackoverflow.com/questions/4965335/how-to-print-binary-tree-diagram-in-java

class TreeFormatter {
    int padding = 2; // minimum number of horizontal spaces between two no data

    private int indent(List<String> lines, int margin) {
        // If negative, prefix all lines with spaces and return 0
        if (margin >= 0) return margin;
        String spaces = " ".repeat(-margin);
        int i = 0;
        for (String line : lines) {
            lines.set(i++, spaces + line);
        }
        return 0;
    }
    
    private List<String> merge(List<String> esquerda, List<String> direita) {
        // Merge two arrays, where the direita strings are indented so there is no overlap
        int valorMinimo = Math.min(esquerda.size(), direita.size());
        int offset = 0;
        for (int i = 0; i < valorMinimo; i++) {
            offset = Math.max(offset, esquerda.get(i).length() + padding - direita.get(i).replaceAll("\\S.*", "").length());
        }
        indent(direita, -indent(esquerda, offset));
        for (int i = 0; i < valorMinimo; i++) {
            esquerda.set(i, esquerda.get(i) + direita.get(i).substring(esquerda.get(i).length()));
        }
        if (direita.size() > valorMinimo) {
            esquerda.addAll(direita.subList(valorMinimo, direita.size()));
        }
        return esquerda;
    }

    private List<String> buildLines(Nó no) {
        if (no == null) return new ArrayList<>();
        List<String> lines = merge(buildLines(no.esquerda), buildLines(no.direita));
        int half = String.valueOf(no.dado).length() / 2;
        int i = half;
        if (lines.size() > 0) {
            String line;
            i = lines.get(0).indexOf("*"); // Find index of first subtree
            if (no.direita == null) {
                line = " ".repeat(i) + "┌─┘";
                i += 2;
            } else if (no.esquerda == null) {
                line = " ".repeat(i = indent(lines, i - 2)) + "└─┐";
            } else {
                int dist = lines.get(0).length() - 1 - i; // Find distance between subtree raizs
                line = String.format("%s┌%s┴%s┐", " ".repeat(i), "─".repeat(dist / 2 - 1), "─".repeat((dist - 1) / 2));
                i += dist / 2;
            }
            lines.set(0, line);
        }
        lines.add(0, " ".repeat(indent(lines, i - half)) + no.dado);
        lines.add(0, " ".repeat(i + Math.max(0, half - i)) + "*"); // Add a marker for caller
        return lines;
    }
    
    public String topDown(Nó raiz) {
        List<String> lines = buildLines(raiz);
        return String.join("\n", lines.subList(1, lines.size()));
    }
}