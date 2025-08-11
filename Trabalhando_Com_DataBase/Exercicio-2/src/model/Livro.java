package model;

public class Livro {
    private int id_livro;
    private String titulo;
    private String autor;
    private int quantidade_estoque;

    public Livro(int id_livro, String titulo, String autor, int quantidade_estoque) {
        this.id_livro = id_livro;
        this.titulo = titulo;
        this.autor = autor;
        this.quantidade_estoque = quantidade_estoque;
    }

    public int getId_livro() {
        return id_livro;
    }

    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQuantidade_estoque() {
        return quantidade_estoque;
    }

    public void setQuantidade_estoque(int quantidade_estoque) {
        this.quantidade_estoque = quantidade_estoque;
    }
}
