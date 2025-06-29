// Representa um cliente do banco
public class Cliente {
    private String nome = null;
    private String cpf = null;
    private String email = null;
    private long telefone = 0;
    private String genero = null;

    public Cliente(String nome, String genero, String cpf, String email, long telefone) {
        this.nome = nome;
        this.genero = genero;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
