import java.util.*;
import java.util.stream.Collectors;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> notas = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Insira a " + i + " nota: ");
            notas.add(sc.nextDouble());
        }

        double media = notas.stream()
                .mapToDouble(x -> x.doubleValue())
                .average()
                .orElse(0.0);

        System.out.printf("Média: %.2f%n", media);

        List<Double> acimaMedia = notas.stream()
                .filter(x -> x > media)
                .toList();

        System.out.println("Notas acima da média: " + acimaMedia);

        sc.close();
    }
}
