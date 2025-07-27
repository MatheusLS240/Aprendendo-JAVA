
import java.util.Scanner;

public class SomaListas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores1 = new int[10];
        int[] valores2 = new int[10];
        int[] resultado = new int[10];

        System.out.println("-- Lista 1 --");
        for(int i = 0; i < 10; i++) {
            System.out.print((i + 1) + " - ");
            valores1[i] = sc.nextInt();
        }

        System.out.println("\n-- Lista 2 --");
        for(int i = 0; i < 10; i++) {
            System.out.print((i + 1) + " - ");
            valores2[i] = sc.nextInt();
        }

        System.out.print("\nValores lista 1: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(valores1[i] + " ");
        }

        System.out.print("\nValores lista 2: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(valores1[i] + " ");
        }

        System.out.println("\n\n-- Soma de ambas as Listas --");
        for(int i = 0; i < 10; i++) {
            resultado[i] = valores1[i] + valores2[i];
            System.out.println((i + 1) + " - " + resultado[i]);
        }
    }
}
