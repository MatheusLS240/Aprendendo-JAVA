package Iniciando_com_JAVA.src;

import java.util.Scanner;

public class SeparandoPalavras1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira uma Frase: ");
        String frase = ler.next();  

        System.out.println("O número de palavras é" + separandoPalavras(frase));

        ler.close();
    }

    public static int separandoPalavras(String frase) {
        String[] stringWords = frase.split(" ");  
        return stringWords.length;  
    }
}
