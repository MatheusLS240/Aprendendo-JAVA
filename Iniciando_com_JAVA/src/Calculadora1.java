package Iniciando_com_JAVA.src;

import java.util.Scanner;

public class Calculadora1 {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            System.out.print("Insira o primeiro valor: ");
            int valor1 = ler.nextInt();
            System.out.print("Insira o segundo valor: ");
            int valor2 = ler.nextInt();
            System.out.print("Insira o que deseja fazer com o valor (+, -, *, /): ");
            String operacao = ler.next();
            
            switch (operacao) {
                case "+" -> valor1 += valor2;
                case "-" -> valor1 -= valor2;
                case "*" -> valor1 *= valor2;
                case "/" -> valor1 /= valor2;
                default -> System.out.println("Operação inválida");
            }
            System.out.println("O resultado é: " + valor1);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}   
