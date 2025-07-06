import java.util.*;

public class ContagemPalavras {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Map<String, Integer> frasesComQuantidade = new HashMap<>();
            String fraseDigitada = "null";

            while(!fraseDigitada.equalsIgnoreCase("sair")) {
                System.out.print("Insira a frase (digite 'sair' para encerrar): ");
                fraseDigitada = sc.nextLine();

                String[] palavrasDaFrase = fraseDigitada.split(" ");

                frasesComQuantidade.put(fraseDigitada, palavrasDaFrase.length);
            }

            System.out.println("---------------------------------");

            frasesComQuantidade.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .forEach(entry -> {
                        String frase = entry.getKey();
                        int quantidadePalavras = entry.getValue();

                        System.out.println("A frase: \"" + frase + "\" tem " + quantidadePalavras + " palavras.");
                    });
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
