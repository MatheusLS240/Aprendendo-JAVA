package Iniciando_com_JAVA.src;

import java.util.Scanner;

public class Divisao1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero = ler.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = ler.nextInt();

        System.out.println("O resultado da divisão é: " + dividir(numero, numero2));

        ler.close();
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
