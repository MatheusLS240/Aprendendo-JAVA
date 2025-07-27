
import java.util.ArrayList;
import java.util.Scanner;

public class OrdemInversa {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList();
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você deseja inserir? ");
        int quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros.add(sc.nextInt());
        }

        System.out.println("\nArray original: " + numeros);
        System.out.println("Array inverso: " + numeros.reversed());
    }
}
