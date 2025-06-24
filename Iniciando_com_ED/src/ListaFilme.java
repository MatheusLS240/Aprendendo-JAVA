import java.util.*;

class Filme implements Comparable<Filme> {
    private String nome;
    private String diretor;
    private int anoLancamento;

    public Filme(String nome, String diretor, int anoLancamento) {
        this.nome = nome;
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public int compareTo(Filme outroFilme) {
        return Integer.compare(this.anoLancamento, outroFilme.anoLancamento);
    }
}

public class ListaFilme {
    public static void main(String[] args) {
        List<Filme> listaDeFilmes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String opcao = "null";

        while(!opcao.equalsIgnoreCase("nao")) {
            System.out.print("Insira o nome do filme: ");
            String nomeFilme = sc.nextLine();
            System.out.print("Insira o nome do diretor: ");
            String diretorFilme = sc.nextLine();
            System.out.print("Insira o ano de lançamento: ");
            int anoFilme = sc.nextInt();
            sc.nextLine();

            listaDeFilmes.add(new Filme(nomeFilme, diretorFilme, anoFilme));

            System.out.print("Deseja continuar cadastrando? (sim ou não): ");
            opcao = sc.nextLine();

            System.out.println("------------------------------");
        }

        Collections.sort(listaDeFilmes);

        System.out.println("\n--- Lista de Filmes Ordenada por Ano de Lançamento (crescente) ---\n");
        for(Filme filme : listaDeFilmes) {
            System.out.printf("Nome: %s | Diretor: %s | Ano de Lançamento: %d\n", filme.getNome(), filme.getDiretor(), filme.getAnoLancamento());
        }
    }
}
