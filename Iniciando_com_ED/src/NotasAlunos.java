import java.util.*;

public class NotasAlunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, List<Double>> alunos = new HashMap<>();
        int i = 1;

        while(true) {
            List<Double> notas = new ArrayList<>();
            System.out.print("Insira o nome do " + i + " aluno (digite 'sair' para parar de adicionar aluno): ");
            String nome = sc.nextLine();

            if(nome.equalsIgnoreCase("sair")) {
                break;
            } else {
                for(int j = 1; j <= 3; j++) {
                    System.out.print("Insira a " + j + " nota: ");
                    double nota = sc.nextDouble();
                    sc.nextLine();

                    notas.add(nota);
                }
                    alunos.put(nome, notas);
                    System.out.println("----------------------------");
                    i++;
            }
        }

        for (Map.Entry<String, List<Double>> entry : alunos.entrySet()) {
            String nome = entry.getKey();
            List<Double> notasDoAluno = entry.getValue();

            double media = notasDoAluno.stream()
                    .mapToDouble(Double::doubleValue)
                    .average()
                    .orElse(0.0);

            System.out.println("Aluno: " + nome + " | Média: " + media);
        }

        sc.close();
    }
}
