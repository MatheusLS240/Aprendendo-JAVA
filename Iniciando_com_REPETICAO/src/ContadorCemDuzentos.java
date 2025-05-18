package Iniciando_com_REPETICAO.src;

import javax.swing.JOptionPane;

public class ContadorCemDuzentos {
    public static void main(String[] args) {
        int cont = 0;

        for(int i = 0; i < 10; i++) {
            String numString = JOptionPane.showInputDialog(
                    null,
                    "Insira o primeiro valor",
                    "Triplo de 3 valores",
                    JOptionPane.QUESTION_MESSAGE
            );
            double num = Double.parseDouble(numString);

            if(num > 100 && num < 200) {
                cont++;
            }
        }

        JOptionPane.showMessageDialog(null, "Entre 10 numeros inseridos, " + cont + " deles são maior que 100 e menor que 200");

    }
}