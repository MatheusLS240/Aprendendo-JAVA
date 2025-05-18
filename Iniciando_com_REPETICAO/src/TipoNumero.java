package Iniciando_com_REPETICAO.src;

import javax.swing.*;

public class TipoNumero {
    public static void main(String[] args) {
        String tamanhoString = JOptionPane.showInputDialog(
                null,
                "Insira quantos valores deseja inserir",
                "Validar tipo de número",
                JOptionPane.QUESTION_MESSAGE
        );

        int tamanhoNum = Integer.parseInt(tamanhoString);
        int[] num = new int[tamanhoNum];

        for (int i = 0; i < tamanhoNum; i++) {
            String numString = JOptionPane.showInputDialog(
                    null,
                    "Insira o " + (i + 1) + "º valor:",
                    "Validar tipo de número",
                    JOptionPane.QUESTION_MESSAGE
            );
            num[i] = Integer.parseInt(numString);
        }

        for (int i = 0; i < tamanhoNum; i++) {
            int somaDivisores = 0;

            for (int j = 1; j < num[i]; j++) {
                if (num[i] % j == 0) {
                    somaDivisores += j;
                }
            }

            if (somaDivisores > num[i]) {
                System.out.println("O número " + num[i] + " é abundante");
            } else if (somaDivisores == num[i]) {
                System.out.println("O número " + num[i] + " é perfeito");
            } else {
                System.out.println("O número " + num[i] + " é deficiente");
            }
        }
    }
}
