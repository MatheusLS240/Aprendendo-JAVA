import java.util.*;

class ListaConvidados implements Comparable<ListaConvidados> {
    private String nome = null;

    public ListaConvidados(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(ListaConvidados o) {
        return this.nome.compareToIgnoreCase(o.nome);
    }

    @Override
    public String toString() {
        return nome;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<ListaConvidados> lista = new TreeSet<>();

        System.out.println("-- Cadastro de Convidados --");
        for (int i = 0; ; i++) {
            System.out.print("Insira o " + (i + 1) + " convidado (digite 'fim' para encerrar): ");
            String nome = sc.nextLine();

            if(nome.equals("fim")) {
                break;
            }

            lista.add(new ListaConvidados(nome));
        }
        System.out.println("\n-- Lista de Convidados --");
        for (ListaConvidados convidado : lista) {
            System.out.println(convidado);
        }

    }
}
