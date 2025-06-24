import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

class Livro implements Comparable<Livro> {
    private String titulo;
    private String autor;
    private String data;

    public Livro(String titulo, String autor, String data) {
        this.titulo = titulo;
        this.autor = autor;
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public int compareTo(Livro outroLivro) {
        return this.titulo.compareTo(outroLivro.getTitulo());
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}

public class ListaLivro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Livro> listaDeLivros = new LinkedList<>();
        String opcao = "null";

        while (!opcao.equalsIgnoreCase("sim")) {
            System.out.print("Insira o nome do livro: ");
            String nomeLivro = sc.nextLine().toUpperCase();
            System.out.print("Insira o nome do autor: ");
            String autorLivro = sc.nextLine().toUpperCase();
            System.out.print("Insira a data de publicação: ");
            String publicacaoLivro  = sc.nextLine();

            publicacaoLivro = converterData(publicacaoLivro);

            listaDeLivros.add(new Livro(nomeLivro, autorLivro, publicacaoLivro ));

            System.out.println("\nAdicionado com sucesso!\n");

            System.out.print("Deseja encerrar o cadastro de livros? (sim ou não): ");
            opcao = sc.nextLine();

            System.out.println("===============================================");
        }

        Collections.sort(listaDeLivros);

        for (Livro livro : listaDeLivros) {
            System.out.printf("Título: %s | Autor: %s | Data: %s%n",
                    livro.getTitulo(), livro.getAutor(), livro.getData());
        }
    }

    public static String converterData(String data) {
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate publicacaoLivro = LocalDate.parse(data, formatDate);
        return String.valueOf(publicacaoLivro);
    }
}
