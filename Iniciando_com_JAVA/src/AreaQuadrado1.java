package Iniciando_com_JAVA.src;

import java.util.Scanner;

public class AreaQuadrado1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite lado do quadrado: ");
        int numero = ler.nextInt();

        System.out.println("A média é: " + areaQuadrado(numero));

        ler.close();
    }

    public static int areaQuadrado(int a) { return a * a; }
}
