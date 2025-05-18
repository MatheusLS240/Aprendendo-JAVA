package Iniciando_com_REPETICAO.src;

import javax.swing.*;

public class MetadeInserido {
    public static void main(String[] args) {
        int i = 0;

        while(i < 10) {
            String numString = JOptionPane.showInputDialog(null, "Insira um valor", "Divisor de números", JOptionPane.QUESTION_MESSAGE);
            double num = Double.parseDouble(numString);
            num /= 2;
            JOptionPane.showMessageDialog(null, "A metade do valor inserido é: " + num, "Divisor de números", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
