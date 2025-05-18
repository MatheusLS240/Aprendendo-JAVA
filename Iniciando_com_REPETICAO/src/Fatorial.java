package Iniciando_com_REPETICAO.src;

import javax.swing.*;

public class Fatorial {
    public static void main(String[] args) {
        String numString = JOptionPane.showInputDialog(null, "Insira um número para calcular o fátorial", "Calculadora de Fatorial", JOptionPane.QUESTION_MESSAGE);
        double num = Double.parseDouble(numString);
        int fatorial = 1;
        double i = num;

        if(num == 0){
            System.out.println("1");
        } else {
            while (i >= 1) {
                fatorial *= i;
                i--;
            }
        }

        JOptionPane.showMessageDialog(null, "Fatorial de " + num + " é " + fatorial);
    }
}
