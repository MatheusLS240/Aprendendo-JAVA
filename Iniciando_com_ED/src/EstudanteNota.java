import java.util.*;

class Estudante {
    private String nome;
    private float notaFinal;

    public Estudante(String nome, float notaFinal) {
        this.nome = nome;
        this.notaFinal = notaFinal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
    }
}

class OrdenarPorNota implements Comparator<Estudante> {
    @Override
    public int compare(Estudante estudante1, Estudante estudante2) {
        int res = Double.compare(estudante1.getNotaFinal(), estudante2.getNotaFinal());

        if(res == 0) {
            return estudante1.getNome().compareTo(estudante2.getNome());
        }

        return res;
    }
}

class OrdenarPorNome implements Comparator<Estudante> {
    @Override
    public int compare(Estudante estudante1, Estudante estudante2) {
        int res = estudante1.getNome().compareTo(estudante2.getNome());

        if(res == 0) {
            return Double.compare(estudante1.getNotaFinal(), estudante2.getNotaFinal());
        }

        return res;
    }
}

public class EstudanteNota {
    public static void main(String[] args) {
        List<Estudante> listaDeEstudante = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String opcao = "null";

        while (!opcao.equalsIgnoreCase("sim")) {
            System.out.print("Insira o nome do estudante: ");
            String nomeEstudante = sc.nextLine();
            System.out.print("Insira a nota final: ");
            float notaFinalEstudante = sc.nextFloat();
            sc.nextLine();

            listaDeEstudante.add(new Estudante(nomeEstudante, notaFinalEstudante));

            System.out.println("\nAdicionado com sucesso!\n");


            System.out.print("Deseja encerrar o cadastro? (sim ou não): ");
            opcao = sc.nextLine();

            System.out.println("===============================================");
        }

        while (true) {
            System.out.println("Como deseja ordenar os estudantes? (NOME ou NOTA FINAL):");
            opcao = sc.nextLine().toUpperCase();
            switch (opcao) {
                case "NOME" -> {
                    listaDeEstudante.sort(new OrdenarPorNome());

                    for(Estudante estudante : listaDeEstudante) {
                        System.out.printf("Nome: %s | Nota final: %.2f\n", estudante.getNome(), estudante.getNotaFinal());
                    }

                    System.exit(0);
                }
                case "NOTA FINAL" -> {
                    listaDeEstudante.sort(new OrdenarPorNota().reversed());

                    for(Estudante estudante : listaDeEstudante) {
                        System.out.printf("Nome: %s | Nota final: %.2f\n", estudante.getNome(), estudante.getNotaFinal());
                    }

                    System.exit(0);
                }
                default -> System.out.println("Opção inválida. Tente novamente digitando 'NOME' ou 'NOTA FINAL'.");
            }
        }
    }
}
