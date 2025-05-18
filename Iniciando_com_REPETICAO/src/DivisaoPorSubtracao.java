package Iniciando_com_REPETICAO.src;

import javax.swing.JOptionPane;

public class DivisaoPorSubtracao {
    public static void main(String[] args) {
        int dividendo = Integer.parseInt(JOptionPane.showInputDialog("Digite o dividendo:"));
        int divisor = Integer.parseInt(JOptionPane.showInputDialog("Digite o divisor:"));

        if (divisor == 0) {
            JOptionPane.showMessageDialog(null, "O divisor não pode ser zero!");
            return;
        }

        int quociente = 0;
        int resto = dividendo;

        for (; resto >= divisor; quociente++) {
            resto -= divisor;
        }

        JOptionPane.showMessageDialog(null, "Quociente: " + quociente + "\nResto: " + resto);
    }
}
