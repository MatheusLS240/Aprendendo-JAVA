import java.util.*;

class Pessoa /* implements  Comparable<Pessoa> */ {
    private String nome;
    private int idade;
    private char genero;

    public Pessoa(String nome, int idade, char genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public Pessoa(int idade) {
        this.idade = idade;
        this.genero = 'I';
    }

    public Pessoa(String nome) {
        this.nome = nome;
        this.genero = 'I';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

//    @Override
//    public int compareTo(Pessoa outra) {
//        return this.idade - outra.getIdade();
//    }
//    @Override
//    public int compareTo(Pessoa outra) {
//        return this.nome.compareTo(outra.getNome());
//    }
}

class PessoaComparatorPorIdade implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return p1.getIdade() - p2.getIdade();
    }
}

class PessoaComparatorPorNome implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return p1.getNome().compareTo(p2.getNome());
    }
}

public class ComparableComparator2 {
    public static void main(String[] args) {
        List<Pessoa> lista = new ArrayList<>();

        lista.add(new Pessoa("Alana", 27, 'F'));
        lista.add(new Pessoa("Welington", 78, 'M'));
        lista.add(new Pessoa("Matheus", 100, 'M'));

        lista.sort(new PessoaComparatorPorIdade().reversed());

        for (Pessoa p : lista) {
            System.out.println(p.getNome() + " = " + p.getIdade());
        }
    }
}
