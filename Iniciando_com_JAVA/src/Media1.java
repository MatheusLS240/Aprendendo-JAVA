package Iniciando_com_JAVA.src;

import java.util.Scanner;

public class Media1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero = ler.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = ler.nextInt();
        System.out.print("Digite o terceiro número: ");
        int numero3 = ler.nextInt();
        System.out.print("Digite o quarto número: ");
        int numero4 = ler.nextInt();

        System.out.println("A média é: " + media(numero, numero2, numero3, numero4));

        ler.close();
    }

    public static int media(int a, int b, int c, int d) {
        a += b;
        c += d;
        a += c;
        
        return a / 4;
    }
}
