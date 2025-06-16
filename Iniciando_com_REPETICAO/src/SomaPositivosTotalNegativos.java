package Iniciando_com_REPETICAO.src;

import java.util.Scanner;

public class SomaPositivosTotalNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, res = 0, positivo = 0, negativo = 0;

        do {
            System.out.print("Insira o " + i + " valor: ");
            int num = sc.nextInt();

            if(num > 0) {
                positivo += num;
            } else {
                negativo++;
            }
            i++;
        } while(i <= 20);

        System.out.print("\nSoma dos positivos " + positivo);
        System.out.print("\nQuantidade de numeros negativos " + negativo);
    }
}
