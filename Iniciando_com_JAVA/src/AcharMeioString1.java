package Iniciando_com_JAVA.src;

import java.util.Scanner;

public class AcharMeioString1 {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Insira um número: ");
            String palavra = ler.next();
            
            System.out.println(meio(palavra));
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static String meio(String palavra) {
        int meio = palavra.length() / 2;
    
        if (palavra.length() % 2 == 0) {
            return palavra.substring(meio - 1, meio + 1);
        } else { 
            return palavra.substring(meio, meio + 1);
        }
    }
}
