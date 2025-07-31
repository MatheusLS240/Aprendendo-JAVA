
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Emprestimo implements Comparable<Emprestimo> {
    private int id_emprestimo;
    private String livro;
    private String usuario;
    private LocalDate data;
    
    public Emprestimo(int id_emprestimo, String livro, String usuario, String data) throws IllegalArgumentException {
        this.id_emprestimo = id_emprestimo;
        this.setLivro(livro);
        this.setUsuario(usuario);
        this.setData(data);
    }
    
    public int getId_emprestimo() {
        return id_emprestimo;
    }

    public void setId_emprestimo(int id_emprestimo) {
        this.id_emprestimo = id_emprestimo;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) throws IllegalArgumentException {
        if (livro == null || livro.trim().isEmpty()) {
            throw new IllegalArgumentException("Emprestimo não pode ser nulo ou vazio");
        }

        this.livro = livro;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) throws IllegalArgumentException {
        if(usuario == null || usuario.trim().isEmpty()) {
            throw new IllegalArgumentException("Campo vazio. Insira o nome");
        }
        
        if(usuario.length() > 100) {
            throw new IllegalArgumentException("Nome muito grande. Limite de 100 caracteres");
        }

        this.usuario = usuario;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(String data)  {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            LocalDate date = LocalDate.parse(data, parser);
            this.data = date;
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Data inválida: " + data, e);
        }
    }
    
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return String.format("Emprestimo '%d' / '%s' / Usuário '%s' / Data '%s'", id_emprestimo, livro, usuario, data.format(formatter));
    }

    @Override
    public int compareTo(Emprestimo o) {
        return this.livro.compareTo(o.getLivro());
    }

}
