package Iniciando_com_REPETICAO.src;

import java.util.Scanner;

public class MaiorDigitado {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite quantos numero vc quer escrever");
        int qtd = ler.nextInt();
        int i = 0, aux = 0, num = 0;

        do {
            System.out.println("Digite o num");
            num = ler.nextInt();
            i++;

            if(num > aux){
                aux = num;
            }

        } while(i < qtd);

        System.out.println("O maior num eh: "+aux);

        ler.close();
    }
}