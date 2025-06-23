import java.util.*;

public class RemovendoDuplicatas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();
        String nome = "null";
        int i = 1;

        System.out.println("Insira os nomes (digite \"sair\" para encerrar):");
        while (true) {
            System.out.print(i + " - ");
            nome = sc.nextLine().trim();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            } else if (!nome.isEmpty()) {
                nomes.add(nome);
                i++;
            } else {
                System.out.println("Nome vazio ignorado.");
            }
        }

        Set<String> nomesUnicos = new HashSet<>(nomes);

        System.out.println("\nNomes sem duplicatas:");
        for (String n : nomesUnicos) {
            System.out.println("- " + n);
        }

        sc.close();
    }
}
