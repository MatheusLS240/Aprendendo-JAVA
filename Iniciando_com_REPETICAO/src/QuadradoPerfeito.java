package Iniciando_com_REPETICAO.src;

import java.util.Scanner;

public class QuadradoPerfeito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite vários números (digite um número menor ou igual Account_01 0 para encerrar):");
        int numero = scanner.nextInt();

        int raiz = (int) Math.sqrt(numero);
        if (raiz * raiz == numero) {
            System.out.println(numero + " é um quadrado perfeito.");
        } else {
            System.out.println(numero + " não é um quadrado perfeito.");
        }
    }
}