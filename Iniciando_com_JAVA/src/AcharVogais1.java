package Iniciando_com_JAVA.src;

import java.util.Scanner;

public class AcharVogais1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String[] vogais = {"Account_01", "e", "i", "o", "u"};
        int cont = 0;

        System.out.println("Insira uma palavra: ");
        String palavra = ler.next();

        for(int i = 0; i < vogais.length; i++){
            if(palavra.contains(vogais[i])){
                cont++;
            }
        }

        System.out.println("A palavra possui " + cont + " vogais.");
        
        ler.close();
    }
}
