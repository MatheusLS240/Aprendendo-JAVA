import java.util.ArrayList;
import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        int numero = 999;
        for (int i = 0; numero != 0; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: (digite 0 para encerrar) ");
            numero = sc.nextInt();
            numeros.add(numero);
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

        System.out.println("\nNúmeros em ordem crescente:");
        System.out.println(numeros);
    }
}
