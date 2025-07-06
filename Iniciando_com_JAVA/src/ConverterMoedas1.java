import java.util.Scanner;

public class ConverterMoedas1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Insira o valor em REAL: ");
        int real = ler.nextInt();
        System.out.println("Escolha Account_01 moeda para conversão:");
        System.out.println("1 - Dólar");
        System.out.println("2 - Euro");
        System.out.println("3 - Libra Esterlina");
        System.out.println("4 - Peso Argentino");
        System.out.println("5 - Iene Japonês");
        System.out.print("Opção: ");
        int opcao = ler.nextInt();

        switch (opcao) {
            case 1:
                System.out.printf("O valor em Dólar é: %.2f\n", real / 5.68);
                break;
            case 2:
                System.out.printf("O valor em Euro é: %.2f\n", real / 5.94);
                break;
            case 3:
                System.out.printf("O valor em Libra Esterlina é: %.2f\n", real / 7.17);	
                break;
            case 4:
                System.out.printf("O valor em Peso Argentino é: %.2f\n", real / 0.01);
                break;
            case 5:
                System.out.printf("O valor em Iene Japonês é: %.2f\n", real / 0.04);
                break;
            default:
                System.out.println("Opção inválida!");
                break;

    }
    ler.close();
}}