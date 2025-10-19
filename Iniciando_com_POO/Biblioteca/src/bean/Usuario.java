package bean;

import java.util.*;

public class Usuario {
    private String nome;
    private int id;
    private List<Livro> livrosEmprestimos;

    public Usuario(String nome, int id, List<Livro> livrosEmprestimos) {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestimos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Livro> getLivrosEmprestimos() {
        return livrosEmprestimos;
    }

    public void setLivrosEmprestimos(List<Livro> livrosEmprestimos) {
        this.livrosEmprestimos = livrosEmprestimos;
    }

    public void emprestarLivro(Livro livro) {
        livro.emprestar();
    }

    public void devolverLivro(Livro livro) {
        livro.devolver();
    }
}
