import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        Biblioteca biblioteca = new Biblioteca();
        do {
            System.out.print("1 - Adicionar livro\n" +
                    "2 - Listar livros\n" +
                    "3 - Buscar livro\n" +
                    "4 - Remover livro\n" +
                    "5 - Sair\n" +
                    "Escolha uma opção:");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao){

                case 1:
                    System.out.print("Titulo: ");
                    String titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    System.out.print("Total de paginas: ");
                    int totPaginas = sc.nextInt();
                    sc.nextLine();
                    biblioteca.adicionarLivro(new Livro(titulo,autor,totPaginas));
                    System.out.println("Livro adicionado!");
                    break;

                case 2:
                    biblioteca.listarLivros();
                    break;

                case 3:
                    System.out.print("Digite o livro que deseja buscar: ");
                    String busca = sc.nextLine();
                    biblioteca.buscarLivro(busca);
                    break;

                case 4:
                    System.out.print("Digite o livro que deseja remover: ");
                    String removeLivro = sc.nextLine();
                    biblioteca.removerLivro(removeLivro);
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção invalida!");
            }

        }while (opcao !=5);
    sc.close();
    }
}