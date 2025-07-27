
import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int numero = 999;
        for (int i = 0; numero != 0; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: (digite 0 para encerrar) ");
            numero = sc.nextInt();
            numeros.add(numero);
        }

        System.out.println("\nQual número vc deseja buscar?");
        int busca = sc.nextInt();

        
        boolean encontrado = false;
        for(int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) == busca) {
                System.out.println("O número " + busca + " foi encontrado na posição: " + i);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("O número " + busca + " não foi encontrado no Array");
        }
    }
}
