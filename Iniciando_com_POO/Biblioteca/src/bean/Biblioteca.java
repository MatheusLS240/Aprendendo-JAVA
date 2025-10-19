package bean;

import java.util.*;

public class Biblioteca {
    private String nome;
    private String endereco;
    private List<Livro> livros;

    public Biblioteca(String nome, String endereco, List<Livro> livros) {
        this.nome = nome;
        this.endereco = endereco;
        this.livros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        validarNome(nome);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        validarEndereco(endereco);
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    private final void validarNome(String nome) {
        if(nome == null || nome.length() <= 0 || nome.trim().isEmpty()) {
            throw new RuntimeException("Nome inválido!");
        }
        this.nome = nome;
    }

    private final void validarEndereco(String endereco) {
        if(endereco == null || endereco.length() <= 0 || endereco.trim().isEmpty()) {
            throw new RuntimeException("Endereco inválido!");
        }
        this.endereco = endereco;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public Livro buscarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public void listarLivros() {
        for(Livro livro : livros) {
            System.out.println(livro.toString());
        }
    }
}
