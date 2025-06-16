package Iniciando_com_REPETICAO.src;

import java.util.Scanner;

public class ContadorMaior30 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira 10 notas: ");
        int nums = 0, cont = 0, i = 1;

        do {

            nums = ler.nextInt();
            if(nums > 30){
                cont++;
            }

            i++;

        } while(i <= 15);

        System.out.println("A sua qtd de nums maiores q 30 sao: "+cont);
    }
}