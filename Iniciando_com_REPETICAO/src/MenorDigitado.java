package Iniciando_com_REPETICAO.src;

import java.util.Scanner;

public class MenorDigitado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 2, res = 0;

        System.out.println("Digite quantos numero vc quer escrever");
        int qtd = sc.nextInt();

        System.out.print("Insira o 1 numero:");
        int num = sc.nextInt();
        res = num;

        do {
            System.out.print("Insira o " + i + " numero: ");
            num = sc.nextInt();

            if(res > num) {
                res = num;
            }
            i++;
        } while(i <= qtd);

        System.out.println("O menor num eh: " + res);
    }
}