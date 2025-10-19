package bean;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponivel;

    public Livro(String titulo, String autor, String isbn, boolean disponivel) {
        validarTitulo(titulo);
        validarAutor(autor);
        validarIsbn(isbn);
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        validarTitulo(titulo);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    private final void validarTitulo(String titulo) {
        if(titulo == null || titulo.length() <= 0 || titulo.trim().isEmpty()) {
            throw new RuntimeException("Titulo inválido!");
        }
        this.titulo = titulo;
    }

    private final void validarAutor(String autor) {
        if(autor == null || autor.length() <= 0 || autor.trim().isEmpty()) {
            throw new RuntimeException("Autor inválido!");
        }
        this.autor = autor;
    }

    private final void validarIsbn(String isbn) {
        if(isbn == null) {
            throw new RuntimeException("ISBN inválido!");
        }
        for(char letraTemp : isbn.toCharArray()) {
            if (Character.isLetter(letraTemp)) {
                throw new RuntimeException("ISBN não pode conter letras!");
            }
        }
        this.isbn = isbn;
    }

    public void emprestar() {
        if(this.disponivel) {
            System.out.println("Livro emprestado!");
            this.disponivel = false;
            return;
        }
        System.out.println("Livro indiponível!");
    }

    public void devolver() {
        if(!this.disponivel) {
            System.out.println("Livro devolvido!");
            this.disponivel = true;
            return;
        }
        System.out.println("Livro não foi emprestado!");
    }

    @Override
    public String toString() {
        return "Livro {" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", disponivel=" + disponivel +
                '}';


    }
}
