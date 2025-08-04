import java.sql.*;
import java.util.*;

public class LivrosDAO {
    public static Connection conn = Conexao.getConnection();

    public static void sincronizarListas(List<Emprestimo> listaEmprestimos, Set<String> titulosLivros, Map<String, Integer> quantidadeEmprestada) {
        listaEmprestimos.clear();
        String consultaDataBase = "SELECT * FROM emprestimos;";
        String contarEmprestimos = "SELECT livro, COUNT(livro) AS quantidadeEmprestimo FROM emprestimos GROUP BY livro;";

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(consultaDataBase); 
            Statement stmt2 = conn.createStatement();
            ResultSet rs2 = stmt2.executeQuery(contarEmprestimos);
            
            while(rs.next()) {
                int id = rs.getInt(1);
                String livro = rs.getString(2);
                String usuario = rs.getString(3);
                String data_emprestimo = rs.getDate(4).toString();

                listaEmprestimos.add(new Emprestimo(id, livro, usuario, data_emprestimo));
                titulosLivros.add(livro);
            }

            while(rs2.next()) {
                String livro = rs2.getString(1);
                int numsEmprestimos = rs2.getInt(2);

                quantidadeEmprestada.put(livro, numsEmprestimos);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao sincronizar lista, por favor, renicie o aplicativo (" + e + ")");
        }
    }

    public static void adicionarEmprestimo(Scanner sc) {
        Emprestimo emprestimo = null;
        System.out.println("\n-- Adicionando Emprestimo --");
        
        System.out.print("Digite o nome do Livro: ");
        String livro = sc.nextLine();
        System.out.print("Insira o nome do Usuario: ");
        String usuario = sc.nextLine();
        System.out.print("Insira a data do Empréstimo: ");
        String data = sc.nextLine();

        try {
            emprestimo = new Emprestimo(0, livro, usuario, data);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e);
            return;
        }

        String inserirLivros = "INSERT INTO emprestimos(livro, usuario, data_emprestimo) VALUES (?, ?, ?)";

        try(PreparedStatement ps = conn.prepareStatement(inserirLivros, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, emprestimo.getLivro());
            ps.setString(2, emprestimo.getUsuario());
            ps.setDate(3, java.sql.Date.valueOf(emprestimo.getData()));
            ps.executeUpdate();          
        } catch(SQLException e) {
            System.err.println("Error ao salvar no banco de dados, por favor, tente mais tarde.(" + e + ")");
            return;
        }
        System.out.println("-- Cadastro Concluido --");
    }

    public static void removerEmprestimo(Scanner sc) {
        System.out.println("\n-- Remover Emprestimo --");
        System.out.print("Insira o número do emprestimo: ");
        int index = sc.nextInt();

        String deletarLivros = "DELETE FROM emprestimos WHERE id_emprestimos = ?";

        try (PreparedStatement ps = conn.prepareStatement(deletarLivros)) {
            ps.setInt(1, index);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error ao deletar do banco de dados, por favor, tente mais tarde. (" + e + ")");
            return;
        }
        System.err.println("-- Deletado com sucesso --");
    }

    public static void listarEmprestimos(List<Emprestimo> listaEmprestimos) {
        System.out.println("\n-- Lista de Emprestimos --");
        for(Emprestimo emprestimo : listaEmprestimos) {
            System.out.println(emprestimo.toString());
        }
        System.out.println("-- Fim da Lista --");
    }

    public static void livrosEmprestados(Set<String> titulosLivros) {
        System.out.println("\n-- Lista de Livros Emprestados --");
        for(String livros : titulosLivros) {
            System.out.println(livros);
        }
        System.out.println("-- Fim da Lista --");
    }

    public static void quantidadeEmprestimos(Map<String, Integer> quantidadeEmprestada)  {
        System.out.println("\n-- Lista de Quantidade de Livros Emprestados --");
        for(Map.Entry<String, Integer> a : quantidadeEmprestada.entrySet()) {
            System.out.println("Livro: " + a.getKey() + " - Quantidade: " + a.getValue());   
        }
        System.out.println("-- Fim da Lista --");
    }
}
