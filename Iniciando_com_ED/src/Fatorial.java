import java.util.ArrayList;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        numeros.add(1);

        System.out.print("Digite um valor: ");
        int valor = sc.nextInt();

        for(int i = 1; i < valor; i++) {
            numeros.add(numeros.get(i - 1) * i);
        }

        System.out.println(numeros);
    }
}
