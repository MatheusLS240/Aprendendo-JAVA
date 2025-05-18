package Iniciando_com_JAVA.src;

import java.util.Scanner;

public class ContaAleatoria1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero = ler.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = ler.nextInt();
        System.out.print("Digite o terceiro número: ");
        int numero3 = ler.nextInt();
        System.out.print("Digite o quarto número: ");
        int numero4 = ler.nextInt();
        System.out.print("Digite o quinto número: ");
        int numero5 = ler.nextInt();
        System.out.print("Digite o sexto número: ");
        int numero6 = ler.nextInt();

        System.out.println("Resultado da soma dos 4 primeiros números, multiplicado pelo 5 e divido pelo 6: " + variasContas(numero, numero2, numero3, numero4, numero5, numero6 ));

        ler.close();
    }

    public static int variasContas(int a, int b, int c, int d, int e, int f) {
        a += b;
        c += d;
        a += c;
        int res = a * e;
        int res2 = res / f;
        return res2;
    }
}
