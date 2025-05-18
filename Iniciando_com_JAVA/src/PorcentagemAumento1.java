package Iniciando_com_JAVA.src;

import java.util.Scanner;

public class PorcentagemAumento1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Insira o nome do produto: ");
		String nome = ler.nextLine();
		System.out.printf("Insira o valor do produto: ");
		double num = ler.nextDouble();
		
		num += num * 0.35;
		
		System.out.printf("O valor da %s com aumento de 35%% foi de %.2f", nome, num);
		
		ler.close();
	}
}