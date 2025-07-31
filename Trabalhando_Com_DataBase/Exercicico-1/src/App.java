import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Emprestimo> listaEmprestimo = new LinkedList<>(); 
        Set<String> titulosLivros = new TreeSet<>();
        Map<String, Integer> quantidadeEmprestada = new HashMap<>();

        do {
            LivrosDAO.sincronizarListas(listaEmprestimo, titulosLivros, quantidadeEmprestada);
            System.out.println("\n-- Cadastro de emprestimo --");
            System.out.println("0 - Encerrar");
            System.out.println("1 - Cadastrar emprestimo");
            System.out.println("2 - Remover emprestimo");
            System.out.println("3 - Listar emprestimos");
            System.out.println("4 - Listar livros emprestados");
            System.out.println("5 - Listar quantidade de livro emprestada");
            System.out.print("Digite a opção selecionada: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 0 -> {
                    System.out.println("Encerrando...");
                    LivrosDAO.conn.close();
                    sc.close();
                    System.exit(0);
                }
                case 1 -> {
                    LivrosDAO.adicionarEmprestimo(sc);
                }
                case 2 -> {
                    LivrosDAO.removerEmprestimo(sc);
                }
                case 3 -> {
                    LivrosDAO.listarEmprestimos(listaEmprestimo);
                }
                case 4 ->  {
                    LivrosDAO.livrosEmprestados(titulosLivros);
                }
                case 5 -> {
                    LivrosDAO.quantidadeEmprestimos(quantidadeEmprestada);                    
                }
                default -> {
                   System.out.println("Opção inválida!"); 
                }
            }
        } while(true);
    }
}
