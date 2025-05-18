package Iniciando_com_JAVA.src;

import java.util.Scanner;
import java.text.DecimalFormat;

class CalculoIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.print("Insira sua altura: ");
        String alturaString = sc.nextLine();

        alturaString = alturaString.replace(",", ".");
        double altura = Double.parseDouble(alturaString);

        System.out.print("Insira seu peso: ");
        String pesoString = sc.nextLine();

        pesoString = pesoString.replace(",", ".");
        double peso = Double.parseDouble(pesoString);

        double imc = peso / Math.pow(altura, 2);

        if(imc < 18) {
            System.out.print("Seu IMC é " + df.format(imc) + " / Classificação é: Magreza");
        } else if (imc < 25) {
            System.out.print("Seu IMC é " + df.format(imc) + " / Classificação é: Peso normal");
        } else if (imc < 30) {
            System.out.print("Seu IMC é " + df.format(imc) + " / Classificação é: Sobrepeso");
        } else if (imc < 35) {
            System.out.print("Seu IMC é " + df.format(imc) + " / Classificação é: Obesidade 1");
        } else if (imc < 40) {
            System.out.print("Seu IMC é " + df.format(imc) + " / Classificação é: Obesidade 2");
        } else {
            System.out.print("Seu IMC é " + df.format(imc) + " / Classificação é: Obesidade 3");
        }
    }
}