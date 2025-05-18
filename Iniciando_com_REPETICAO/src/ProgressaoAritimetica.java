package Iniciando_com_REPETICAO.src;

import javax.swing.*;

public class ProgressaoAritimetica {
    public static void main(String[] args) {
        String razaoString = JOptionPane.showInputDialog(null, "Insira Account_01 razão:", "Progressão Aritmética ", JOptionPane.QUESTION_MESSAGE);
        String limiteString = JOptionPane.showInputDialog(null, "Insira o limite", "Pregressão Aritmética", JOptionPane.QUESTION_MESSAGE);

        double razao = Double.parseDouble(razaoString);
        double razao2 = razao;
        double limite = Double.parseDouble(limiteString);

        while(razao <= limite) {
            JOptionPane.showMessageDialog(null, razao, "Pregressão Aritmética", JOptionPane.QUESTION_MESSAGE);
            razao += razao2;
        }
    }
}
