package Iniciando_com_REPETICAO.src;

import javax.swing.*;

public class TriploNumInserido {
    public static void main(String[] args) {
        String num1String = JOptionPane.showInputDialog(
                null,
                "Insira o primeiro valor",
                "Triplo de 3 valores",
                JOptionPane.QUESTION_MESSAGE
        );
        double num1 = Double.parseDouble(num1String);

        String num2String = JOptionPane.showInputDialog(
                null,
                "Insira o segundo valor",
                "Triplo de 3 valores",
                JOptionPane.QUESTION_MESSAGE
        );
        double num2 = Double.parseDouble(num2String);

        String num3String = JOptionPane.showInputDialog(
                null,
                "Insira o terceiro valor",
                "Triplo de 3 valores",
                JOptionPane.QUESTION_MESSAGE
        );
        double num3 = Double.parseDouble(num3String);

        System.out.println("-- Multiplos de " + num1 + " --");
        for(;num1 < 900; num1 *= 3) {
            System.out.println(num1);
        }

        System.out.println("-- Multiplos de " + num2 + " --");
        for(;num2 < 900; num2 *= 3) {
            System.out.println(num2);
        }

        System.out.println("-- Multiplos de " + num3 + " --");
        for(;num3 < 900; num3 *= 3) {
            System.out.println(num3);
        }

    }
}
