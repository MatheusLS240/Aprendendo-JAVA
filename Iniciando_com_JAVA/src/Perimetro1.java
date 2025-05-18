package Iniciando_com_JAVA.src;

import java.util.Scanner;

public class Perimetro1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite qual opção você quer (Quadrado ou Triângulo): ");
        String opcao = ler.next().toLowerCase();

        System.out.println("O perímetro do " + opcao + " é: " + perimetro(opcao, ler));

        ler.close();
    }

    public static int perimetro(String a, Scanner scanner) {
        switch(a) {
            case "quadrado":
                System.out.print("Opção QUADRADO selecionada, insira o lado: ");
                int lado = scanner.nextInt();
                return 4 * lado;

            case "triangulo":
                System.out.print("Opção TRIÂNGULO selecionada, insira os três lados separados por espaço: ");
                int lado1 = scanner.nextInt();
                int lado2 = scanner.nextInt();
                int lado3 = scanner.nextInt();
                return lado1 + lado2 + lado3;

            default:
                System.out.println("Opção inválida!");
                return 0;
        }
    }
}
