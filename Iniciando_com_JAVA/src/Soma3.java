package Iniciando_com_JAVA.src;

import java.util.Scanner;

public class Soma3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero = ler.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = ler.nextInt();
        System.out.print("Digite o terceiro número: ");
        int numero3 = ler.nextInt();

        System.out.println("A soma é: " + somar(numero, numero2, numero3));

        ler.close();
    }

    public static int somar(int a, int b, int c) {
        return a + b + c;
    }
}
