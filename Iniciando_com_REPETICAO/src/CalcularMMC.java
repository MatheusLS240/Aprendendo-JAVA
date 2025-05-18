package Iniciando_com_REPETICAO.src;

import javax.swing.*;

public class CalcularMMC {
    public static void main(String[] args) {
        double num1, num2;

        while (true) {
            String num1String = JOptionPane.showInputDialog(
                    null,
                    "Insira o valor do primeiro número",
                    "Calculadora de MDC",
                    JOptionPane.QUESTION_MESSAGE
            );

            String num2String = JOptionPane.showInputDialog(
                    null,
                    "Insira o valor do segundo número",
                    "Calculadora de MDC",
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
        JOptionPane.showMessageDialog(null, "O Maior Divisor Comum é " + mdc, "Calculadora de MDC", JOptionPane.INFORMATION_MESSAGE);
    }
}
