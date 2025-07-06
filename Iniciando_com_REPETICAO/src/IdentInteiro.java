package Iniciando_com_REPETICAO.src;

import javax.swing.*;

public class IdentInteiro {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog(null, "Insira um valor", "Descobrir inteiro", JOptionPane.QUESTION_MESSAGE);

        valor = valor.replace(",", ".");

        if(valor.contains(".")) {
            double valor2 = Double.parseDouble(valor);
            JOptionPane.showMessageDialog(null, "O valor inserido: " + valor2 + ", é um número Decimal.", "Descobrir inteiro", JOptionPane.INFORMATION_MESSAGE);
        } else {
            double valor2 = Integer.parseInt(valor);
            JOptionPane.showMessageDialog(null, "O valor inserido: " + valor2 + ", é um número Inteíro.", "Descobrir inteiro", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
