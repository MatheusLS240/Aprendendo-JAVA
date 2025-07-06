package Iniciando_com_JAVA.src;

import java.util.Scanner;

public class AcharVogais1 {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            String[] vogais = {"a", "e", "i", "o", "u"};
            int cont = 0;
            
            System.out.println("Insira uma palavra: ");
            String palavra = ler.next();
            
            for (String vogai : vogais) {
                if (palavra.contains(vogai)) {
                    cont++;
                }
            }
            
            System.out.println("A palavra possui " + cont + " vogais.");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
