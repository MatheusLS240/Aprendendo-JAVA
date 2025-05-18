package Iniciando_com_REPETICAO.src;

import javax.swing.*;

public class NumeroPrimo2 {
    public static void main(String[] args) {
        String numString = JOptionPane.showInputDialog(null, "Insira um número", "Calculadora de PRIMO", JOptionPane.QUESTION_MESSAGE);

        int num = Integer.parseInt(numString), i = 1, j = 0;

        while (i < num) {
            boolean primo = true;
            j = 2;
            i++;

            while(j < i) {
                if(i % j == 0) {
                    primo = false;
                    break;
                }
                j++;
            }
            if(primo) {
                JOptionPane.showMessageDialog(null, "Números primo: " + i, "Calculadora de PRIMO - Numero: " + num, JOptionPane.QUESTION_MESSAGE);
            }
        }
    }
}