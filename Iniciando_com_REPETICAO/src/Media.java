package Iniciando_com_REPETICAO.src;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira 10 notas: ");
        double notas = 0, aux = 0, i = 1;

        do {

            notas = ler.nextDouble();
            aux += notas;

            i++;

        } while(i <= 10);

        aux = aux / 10;
        System.out.println("A sua media eh: "+aux);
    }
}