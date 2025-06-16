package Iniciando_com_REPETICAO.src;

import java.util.Scanner;

public class RICCI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 2, res = 0;

        System.out.println("Digite o 1 valor:");
        int num = sc.nextInt();
        System.out.println("Digite o 2 valor:");
        int num2 = sc.nextInt();

        do {
            System.out.println(num);
            System.out.println(num2);
            num += num2;
            num2 += num;

            i++;
        } while(i <= 20);

        System.out.println("O maior num eh: " + res);
    }
}