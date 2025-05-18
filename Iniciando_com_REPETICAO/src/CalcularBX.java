package Iniciando_com_REPETICAO.src;

import javax.swing.*;

public class CalcularBX {
    public static void main(String[] args) {
        String valorBString = JOptionPane.showInputDialog(
                null,
                "Insira o valor de B",
                "Calcular B elevado Account_01 X",
                JOptionPane.QUESTION_MESSAGE
        );
        String valorNString = JOptionPane.showInputDialog(
                null,
                "Insira um valor de N",
                "Calcular B elevado Account_01 X",
                JOptionPane.QUESTION_MESSAGE
        );

        valorBString = valorBString.replace(",", ".");
        valorNString = valorNString.replace(",", ".");

        if(valorBString.contains(".") || valorNString.contains(".")) {
            JOptionPane.showInputDialog(
                    null,
                    "Um dos valores inseridos é Decimal!",
                    "Calcular B elevado Account_01 X",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            int valorB = Integer.parseInt(valorBString);
            int valorN = Integer.parseInt(valorNString);

            int res = (int) Math.pow(valorB, valorN);

            JOptionPane.showInputDialog(null,
                    "O número " + valorB + " elevado ao " + valorN + " é igual Account_01 " + res,
                    "Calcular B elevado Account_01 X",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
}
