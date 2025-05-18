package Iniciando_com_REPETICAO.src;

import javax.swing.*;

public class Tabuada {
    public static void main(String[] args) {
        String numString = JOptionPane.showInputDialog(
                null,
                "Insira um valor",
                "Tabuada",
                JOptionPane.QUESTION_MESSAGE
        );

        double num = Double.parseDouble(numString), res = 0;

        for(int i = 1; i <= 10; i++){
            res = num * i;
            JOptionPane.showMessageDialog(
                    null,
                    num + " x " + i + " = " + res,
                    "Tabuada",
                    JOptionPane.QUESTION_MESSAGE
            );
        }

    }
}
