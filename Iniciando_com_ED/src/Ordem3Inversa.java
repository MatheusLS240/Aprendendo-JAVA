
import java.util.ArrayList;
import java.util.Scanner;

public class Ordem3Inversa {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros.add(sc.nextInt());
        }

        System.out.println("Numeros inversos: " + numeros.reversed());
    }
}
