package Iniciando_com_JAVA.src;

import java.util.Scanner;

public class Emprestimo1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira o valor do emprestimo: ");
        double num = ler.nextDouble();
        System.out.println("Insira em quanto tempo deseja pagar (2% AO MÊS): ");
        int tempo = ler.nextInt();
        
        double res = num * Math.pow(1 + 0.02, tempo);
        
        System.out.printf("O valor final será de %.2f", res);

        ler.close();
    }
}