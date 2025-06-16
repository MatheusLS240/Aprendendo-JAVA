package Iniciando_com_REPETICAO.src;

import java.util.Scanner;

public class ContadorParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadeNumeros;
        int pares = 0;
        int impares = 0;

        System.out.print("Quantos números você quer digitar? ");
        quantidadeNumeros = sc.nextInt();

        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("\nTotal de números pares: " + pares);
        System.out.println("Total de números ímpares: " + impares);

        sc.close();
    }
}