public class ArvoreBinaria {
    private Nó raiz;

    public ArvoreBinaria() { 
        raiz = null;
    }

    public void inserir(int valor) {
        raiz = inserirNó(raiz, valor);
    }

    private Nó inserirNó(Nó raiz, int valor) {
        if (raiz == null) {
            raiz = new Nó(valor);
            return raiz;
        }

        if (valor < raiz.dado) {
            raiz.esquerda = inserirNó(raiz.esquerda, valor);
        } else if (valor > raiz.dado) {
            raiz.direita = inserirNó(raiz.direita, valor);
        }

        return raiz;
    }

    public boolean buscar(int valor) {
        return buscarNó(raiz, valor);
    }

    private boolean buscarNó(Nó raiz, int valor) {
        if (raiz == null) {
            return false;
        }

        if (raiz.dado == valor) {
            return true;
        }

        if (valor < raiz.dado) {
            return buscarNó(raiz.esquerda, valor);
        }

        return buscarNó(raiz.direita, valor);
    }

    public void remover(int valor) {
        raiz = removerNó(raiz, valor);
    }

    private Nó removerNó(Nó raiz, int valor) {
        if (raiz == null) {
            return raiz;
        }

        if (valor < raiz.dado) {
            raiz.esquerda = removerNó(raiz.esquerda, valor);
        } else if (valor > raiz.dado) {
            raiz.direita = removerNó(raiz.direita, valor);
        } else {
            if (raiz.esquerda == null) {
                return raiz.direita;
            } else if (raiz.direita == null) {
                return raiz.esquerda;
            }

            raiz.dado = valorMinimo(raiz.direita);

            raiz.direita = removerNó(raiz.direita, raiz.dado);
        }

        return raiz;
    }

    private int valorMinimo(Nó raiz) {
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

    private void printTree(Nó raiz, int level, String prefix) {
        if (raiz!= null) {
            System.out.println(" ".repeat(level * 4) + prefix + raiz.dado);
            if (raiz.esquerda!= null || raiz.direita!= null) {
                printTree(raiz.esquerda, level + 1, "E--- ");
                printTree(raiz.direita, level + 1, "D--- ");
            }
        }
    }
}