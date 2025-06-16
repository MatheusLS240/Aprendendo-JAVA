package Iniciando_com_REPETICAO.src;

import java.util.Scanner;

public class EntrarNEImprimirH {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Escreva n");
        double n = ler.nextDouble();
        double aux = 0, i = 1;

        do {
            aux  += (1 / i);
            i++;

        } while(i <= n);


        aux = aux + 1;
        System.out.println("Seu resultado eh: "+aux);
    }
}