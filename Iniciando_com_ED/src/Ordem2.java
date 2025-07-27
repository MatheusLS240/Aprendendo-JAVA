import java.util.ArrayList;
import java.util.Scanner;

public class Ordem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros.add(sc.nextInt());
        }

        for(int i = 0; i < numeros.size(); i++) {
            for (int j = 0; j < numeros.size(); j++) {
                if (numeros.get(i) < numeros.get(j)) {
                    int temp = numeros.get(i);
                    numeros.set(i, numeros.get(j));
                    numeros.set(j, temp);
                }
            }
        }

        System.out.println("Números em ordem crescente:");
        System.out.println(numeros);
    }
}
