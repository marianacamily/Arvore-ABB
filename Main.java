import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        System.out.print("===== PJBL2 - Estrutura de Dados - Árvore Binária de Busca =====");
        System.out.println();
        System.out.print("Beatriz Petry, Julia Engels e Mariana Camily");
        System.out.println();
        int var = 1;
        ArvoreBinaria arvore = new ArvoreBinaria();
        while (var != 0){
            Scanner inicio = new Scanner(System.in);
            System.out.print("Deseja Realizar [1] Inserção, [2] Busca, [3] Remoção ou [4] Impressão? (Digite qualquer outro n° para sair): ");
            int resposta = inicio.nextInt();
            if (resposta == 1) {
                System.out.print("===== Opção Selecionada: Inserção =====");
                System.out.println();
                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite o novo valor que será inserido: ");
                int valorInserir = scanner.nextInt();
                arvore.inserir(valorInserir);
                arvore.printTree();
            }
            else if (resposta == 2){
                System.out.print("===== Opção Selecionada: Busca =====");
                System.out.println();
                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite o valor que deseja buscar: ");
                int valorBuscar = scanner.nextInt();
                System.out.println("\nBusca por " + valorBuscar + ": " + arvore.buscar(valorBuscar));
                arvore.printTree();
            }
            else if (resposta == 3){
                System.out.print("===== Opção Selecionada: Remoção =====");
                System.out.println();
                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite o valor que deseja remover: ");
                int valorRemover = scanner.nextInt();
                arvore.remover(valorRemover);
                System.out.print("Árvore Impressa: ");
                System.out.println();
                arvore.printTree();
            }
            else if (resposta == 4){
                System.out.print("===== Opção Selecionada: Impressão =====");
                System.out.println();
                System.out.print("Árvore Impressa: ");
                System.out.println();
                arvore.printTree();
            }
            else {
                break;
            }
        }
    }
}