package Iniciando_com_JAVA.src;

import java.util.Scanner;

public class Soma1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Insira o primeiro valor: ");
		int valor1 = ler.nextInt();
		System.out.print("Insira o segundo valor:");
		int valor2 = ler.nextInt();

		System.out.println("A soma dos valores é " + (valor1 + valor2));

		ler.close();
	}
}
