package Iniciando_com_REPETICAO.src;

import javax.swing.*;

public class NumeroPrimo1 {
    public static void main (String[] args) {
        String numString = JOptionPane.showInputDialog(null, "Insira um número", "Calculadora de PRIMO", JOptionPane.QUESTION_MESSAGE);

        int num = Integer.parseInt(numString), i = 2;
        boolean primo = true;

        while(i < num) {
            if(num % i == 0) {
                primo = false;
                break;
            }
            i++;
        }

        if(primo) {
            JOptionPane.showMessageDialog(null,"O número " + num + " é primo!");
        } else {
            JOptionPane.showMessageDialog(null,"O número " + num + " não é primo!");
        }
    }
}
