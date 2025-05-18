package Iniciando_com_REPETICAO.src;

import javax.swing.JOptionPane;

public class NumeroTriangular {
    public static void main(String[] args) {

        String numString = JOptionPane.showInputDialog("Digite um número (<= 0 para sair):");

        int num = Integer.parseInt(numString);

        int soma = 0;
        for (int i = 1; soma < num; i++) {
            soma += i;
            if (soma == num) {
                JOptionPane.showMessageDialog(null, num + " é triangular!");
                break;
            }
        }

        if (soma != num) {
            JOptionPane.showMessageDialog(null, num + " não é triangular.");
        }
    }
}
