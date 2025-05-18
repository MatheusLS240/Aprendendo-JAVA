package Iniciando_com_REPETICAO.src;

import javax.swing.*;

public class QuinzeQuadrado {
    public static void main(String[] args) {
        int i = 0;

        while(i < 15) {
            String numString = JOptionPane.showInputDialog(null,"Insira um número", "Números elevados ao quadrado", JOptionPane.QUESTION_MESSAGE);
            double num = Double.parseDouble(numString);
            num = Math.pow(num, 2);
            JOptionPane.showMessageDialog(null, "O número inserído ao quadrado é " + num, "Números elevados ao quadrado", JOptionPane.INFORMATION_MESSAGE);
            i++;
        }
    }
}
