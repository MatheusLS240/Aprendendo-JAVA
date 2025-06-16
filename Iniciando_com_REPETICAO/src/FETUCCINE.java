package Iniciando_com_REPETICAO.src;

import java.util.Scanner;

public class FETUCCINE {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i = 1;

        System.out.println("Insira n1");
        int n1 = ler.nextInt();

        System.out.println("Insira n2");
        int n2 = ler.nextInt();
        System.out.println("\n");

        do {
            if(i % 2 != 0){
                n1 = n1 + n2;
            } else {
                n2 = n1 - n2;
            }

            System.out.println(n1);
            System.out.println(n2);

            i++;
        } while(i <= 20);


    }
}