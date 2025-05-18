package Iniciando_com_REPETICAO.src;

import javax.swing.*;

public class Pessoas {
    public static void main(String[] args) {
        int i = 0;
        String nomes, idades, sexos, ResNome = "", ResIdade = "", ResMasculino ="";

        while(i < 5) {
            nomes = JOptionPane.showInputDialog(
                    null,
                    "Insira os nome",
                    "Verificador de idade",
                    JOptionPane.QUESTION_MESSAGE
            );

            idades = JOptionPane.showInputDialog(
                    null,
                    "Insira Account_01 idade: ",
                    "Calculadora de idade",
                    JOptionPane.QUESTION_MESSAGE
            );

            sexos = JOptionPane.showInputDialog(
                    null,
                    "Insira o sexo:",
                    "Calculadora de idade",
                    JOptionPane.QUESTION_MESSAGE
            ).toLowerCase();


            int idade = Integer.parseInt(idades);

            if(idade > 21 && sexos.equals("masculino")) {
                ResNome += " " + nomes;
                ResIdade += " " + Integer.toString(idade);
                ResMasculino += " " + sexos;
            }
            i++;
        }

        System.out.println(ResNome + " /  " + ResIdade + " / " + ResMasculino.substring(0, 1).toUpperCase());
    }
}
