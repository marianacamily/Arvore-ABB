![image](https://github.com/marianacamily/Arvore-ABB/assets/108103273/d32f0626-ed54-4120-a615-da4e108bee4c)# Árvore-ABB
Trabalho da disciplina de Estrutura de Dados, feito por Beatriz Petry, Julia Engels e Mariana Camily, cursando o 4° período de Engenharia de Software na PUCPR. O trabalho é baseado em uma implementação de uma árvore de busca binária, seguindo os princípios de Programação Orientada a Objetos, ou seja, modulada em classes Main, ArvoreBuscaBinaria e Nó.

# Alguns Conceitos Abordados
Arvore- ABB
Essa é a classe da árvore binária de busca, nela possui os algoritmos de inserção, busca, impressão e remoção. Ela possui um atributo privado na raiz que é o primeiro elemento da árvore.

### Nó 
Essa clase é importante para a criação de uma árvore, nela contém uns atributos que armazenam o número do nó, nó esquerdo e direito que direciona para a direta e esquerda na árvore. Nela se mantém uma referência ao valor de cada nó, permitindo que a estrutura encadeada simples da classe árvore.

### Inserção
Possui 2 métodos o primeiro insersao(int valor) que chama o outro método privado insercaoRecursiva que vai realizar a inserção de forma recursiva, seguindo as própriedades da árvore binária assim criando um novo nó quando necessário e ajustando os pontos para esquerda ou direita.

### Busca
Nesse algoritmo temos o método busca(int valor) que busca um valor na árvore e retorna verdadeiro se o valor for encontrado, caso contrário retorna falso. Ele chama o método privado buscaRercusiva que realiza a busca de forma recursiva, comparando o valor atual com o valor desejado e navegando para esquerda ou direita. 

### Impressão
Método de impressão da árvore em um formato de dependência usando o printTree.

### Remoção
O método remoção (int valor) remove um valor da árvore. Ele chama o método privado remocaoRecursiva para realizar a remoção de forma recursiva, considerando os casos de remoção de nós com nenhum, um ou dois filhos. Além de ter o método privado encontrarMenorValor que ajuda a encontrar o menor valor da subárvore a partir de um nó dado.

### Como Utilizar
1. Na classe **Main**, crie uma instância da classe **ArvoreBuscaBinaria**
2. ![image](https://github.com/marianacamily/Arvore-ABB/assets/108103273/9bfceb0f-e998-4e3f-b04f-18af79fe6b4f)
3. Insira os elementos utilizando o método **Inserção** 
![image](https://github.com/marianacamily/Arvore-ABB/assets/108103273/abf27941-d810-4b70-9f39-db08a60f9f12)
4. Chama-se o método **Impressão** para ver a árvore
![image](https://github.com/marianacamily/Arvore-ABB/assets/108103273/58da931d-9172-4c89-b8ce-1ad5dbbfcb54)
5.  Remova elementos da árvore usando o método **Remoção**
 [image](https://github.com/marianacamily/Arvore-ABB/assets/108103273/e8cfafac-f502-4b5e-a7f0-a917f8edd561)
6. Busque elementos na árvore usando o método **Busca**
- Busca que dá certo:
  ![image](https://github.com/marianacamily/Arvore-ABB/assets/108103273/df58cdc9-2745-4da8-8171-af2b85a98d24)

- Busca que não dá certo:
  ![image](https://github.com/marianacamily/Arvore-ABB/assets/108103273/bc09e453-57f0-464c-9d4f-67dc7bc4a061)



