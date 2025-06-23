import java.util.*;

public class PalavrasUnicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = sc.nextLine();

        String[] palavras = texto.split("\\s+");
        Set<String> unicas = new HashSet<>(Arrays.asList(palavras));

        System.out.println("Palavras únicas:");
        for (String palavra : unicas) {
            System.out.println("- " + palavra);
        }

        sc.close();
    }
}
