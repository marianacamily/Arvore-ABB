public class ArvoreBinaria {
    private No raiz;

    public ArvoreBinaria() { 
        raiz = null;
    }

    public void inserir(int valor) {
        raiz = inserirRec(raiz, valor);
    }

    private No inserirRec(No raiz, int valor) {
        if (raiz == null) {
            raiz = new No(valor);
            return raiz;
        }

        if (valor < raiz.dado) {
            raiz.esquerda = inserirRec(raiz.esquerda, valor);
        } else if (valor > raiz.dado) {
            raiz.direita = inserirRec(raiz.direita, valor);
        }

        return raiz;
    }

    public boolean buscar(int valor) {
        return buscarRec(raiz, valor);
    }

    private boolean buscarRec(No raiz, int valor) {
        if (raiz == null) {
            return false;
        }

        if (raiz.dado == valor) {
            return true;
        }

        if (valor < raiz.dado) {
            return buscarRec(raiz.esquerda, valor);
        }

        return buscarRec(raiz.direita, valor);
    }

    public void remover(int valor) {
        raiz = removerRec(raiz, valor);
    }

    private No removerRec(No raiz, int valor) {
        if (raiz == null) {
            return raiz;
        }

        if (valor < raiz.dado) {
            raiz.esquerda = removerRec(raiz.esquerda, valor);
        } else if (valor > raiz.dado) {
            raiz.direita = removerRec(raiz.direita, valor);
        } else {
            if (raiz.esquerda == null) {
                return raiz.direita;
            } else if (raiz.direita == null) {
                return raiz.esquerda;
            }

            raiz.dado = valorMinimo(raiz.direita);

            raiz.direita = removerRec(raiz.direita, raiz.dado);
        }

        return raiz;
    }

    private int valorMinimo(No raiz) {
        int valorMinimo = raiz.dado;
        while (raiz.esquerda != null) {
            valorMinimo = raiz.esquerda.dado;
            raiz = raiz.esquerda;
        }
        return valorMinimo;
    }

public void printTree() {
        printTree(raiz, 0, "Raiz: ");
    }

    private void printTree(No raiz, int level, String prefix) {
        if (raiz!= null) {
            System.out.println(" ".repeat(level * 4) + prefix + raiz.dado);
            if (raiz.esquerda!= null || raiz.direita!= null) {
                printTree(raiz.esquerda, level + 1, "E--- ");
                printTree(raiz.direita, level + 1, "D--- ");
            }
        }
    }
}