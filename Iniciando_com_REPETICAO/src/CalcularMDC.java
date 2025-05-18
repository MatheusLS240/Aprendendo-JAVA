package Iniciando_com_REPETICAO.src;

import javax.swing.*;

public class CalcularMDC {
    public static void main(String[] args) {
        double num1, num2;

        while (true) {
            String num1String = JOptionPane.showInputDialog(
                    null,
                    "Insira o valor do primeiro número",
                    "Calculadora de MMC",
                    JOptionPane.QUESTION_MESSAGE
            );

            String num2String = JOptionPane.showInputDialog(
                    null,
                    "Insira o valor do segundo número",
                    "Calculadora de MMC",
                    JOptionPane.QUESTION_MESSAGE
            );

            num1 = Double.parseDouble(num1String);
            num2 = Double.parseDouble(num2String);

            if (num1 != num2) {
                break;
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "Os números são iguais. Por favor, insira valores diferentes.",
                        "Erro",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }

        int i = 1, mdc = 0;
        while (i <= num1) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.println(i);
                mdc = i;
            }
            i++;
        }

        double mmc = (num1 * num2) / mdc;
        JOptionPane.showMessageDialog(null, "O Menor Multiplo Comum é " + mmc, "Calculadora de MMC", JOptionPane.INFORMATION_MESSAGE);
    }
}
