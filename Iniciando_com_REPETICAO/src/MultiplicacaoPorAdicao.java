package Iniciando_com_REPETICAO.src;

import java.util.Scanner;

public class MultiplicacaoPorAdicao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int aux = 0;
        System.out.println("Digite um num para ser multiplicado");
        int num = ler.nextInt();

        System.out.println("Digite o multiplicador");
        int mult = ler.nextInt();
        int i = 1;

        do {
            aux += num;
            i++;

        } while(i <= mult);

        System.out.println("O resultado eh: "+aux);

        ler.close();
    }
}