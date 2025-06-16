package Iniciando_com_REPETICAO.src;

import java.util.Scanner;

public class QuadradoMenor255 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, res = 0;

        do {
            System.out.println("Digite o " + i +" valor:");
            int num = sc.nextInt();

            if(Math.pow(num, 2) < 255) {
                System.out.println("Quadrado menor que 255");
            } else {
                System.out.println("Quadrado maior que 255");
            }
            i++;

        } while(i <= 20);
    }
}