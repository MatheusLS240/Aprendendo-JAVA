package view;

import bean.Biblioteca;
import bean.Livro;
import bean.Usuario;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Livro> livros = new ArrayList<>();
        Livro l = new Livro("Teste 0", "Matheus", "12345", true);
        Biblioteca b = new Biblioteca("Tatuape", "Av. Celso Garcia", livros);
        Usuario u = new Usuario("Matheus", 1, livros);
        Usuario u2 = new Usuario("Ciclano", 2, livros);

        livros.add(l);
        u.emprestarLivro(l);
        u2.emprestarLivro(l);
    }
}
