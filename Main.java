import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BinarySearchTree tree = new BinarySearchTree();
        RedBlackTree RBtree = new RedBlackTree();
        int op, value, opt;

        do {
            System.out.println("1 | ÁRVORE BINÁRIA DE PESQUISA");
            System.out.println("2 | ÁRVORE RUBRO-NEGRA (RED-BLACK TREE)");
            System.out.println("---------------------------------------");
            System.out.println("Escolha a Árvore desejada: ");
            opt = scan.nextInt();
            switch (opt) {
                case 1:
                    do {
                        System.out.println("\nÁRVORE BINÁRIA DE PESQUISA");
                        System.out.println("---------------------------------------");
                        System.out.println("1 | Adicionar nodo");
                        System.out.println("2 | Remover nodo");
                        System.out.println("3 | Pesquisar nodo");
                        System.out.println("4 | Exibir a árvore");
                        System.out.println("5 | Mostrar informações");
                        System.out.println("6 | Mostrar caminhamentos");
                        System.out.println("7 | Soma de valores entre nodos");
                        System.out.println("8 | Esvaziar árvore");
                        System.out.println("0 | Sair do programa");
                        System.out.println("---------------------------------------");
                        System.out.println("Digite a opção desejada: ");

                        op = scan.nextInt();

                        switch (op) {
                            case 1 -> {
                                System.out.println("Informe um valor inteiro:");
                                value = scan.nextInt();
                                tree.add(value);
                            }
                            case 2 -> {
                                System.out.println("Informe um valor inteiro:");
                                value = scan.nextInt();
                                if (!tree.remove(value))
                                    System.out.println("Valor não encontrado!");
                            }
                            case 3 -> {
                                System.out.println("Informe um valor inteiro:");
                                value = scan.nextInt();
                                if (tree.contains(value) != null)
                                    System.out.print("Valor encontrado!");
                                else
                                    System.out.println("Valor não encontrado!");
                            }
                            case 4 -> {
                                tree.printTree();
                            }
                            case 5 -> {
                                tree.treeInfo();
                            }
                            case 6 -> {
                                tree.caminhamentos();
                            }
                            case 7 -> {
                                System.out.println("Informe o valor inicial: ");
                                int x = scan.nextInt();

                                System.out.println("Informe o valor final: ");
                                int y = scan.nextInt();

                                System.out.print("Soma total entre " + x + " e " + y + " = " + tree.sumBetween(x, y));
                            }
                            case 8 -> {
                                tree.clearTree();
                            }

                        }
                    } while (op != 0);

                case 2:
                    //DEMONSTRACAO ARVORE RUBRO-NEGRA

                    //incluindo números 1 a 9
                    for (int i = 1; i <= 9; i++) {
                        RBtree.add(i);
                    }

                    //visualização da árvore
                    System.out.println("Visualização da Árvore:");
                    System.out.println(RBtree.visualizeTree());

                    //altura da árvore
                    System.out.println("\nAltura da Árvore: " + RBtree.height());

                    // Limpando o conteúdo
                    RBtree.clear();

                    // Incluindo os números 9 a 1 (ao contrario)
                    for (int i = 9; i >= 1; i--) {
                        RBtree.add(i);
                    }

                    //caminho central
                    System.out.println("\nConteúdo da Árvore (Caminhamento Central - inOrder):");
                    System.out.println(RBtree.inOrder());

            }

        } while (opt != 0);
        scan.close();
    }
}