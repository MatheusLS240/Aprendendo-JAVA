package Iniciando_com_REPETICAO.src;

import javax.swing.JOptionPane;

public class MultiplosDePosicao {
    public static void main(String[] args) {
        for (int posicao = 1; ; posicao++) {
            String input = JOptionPane.showInputDialog("Digite um número (digite 0 para terminar):");

            if (input == null || input.equals("0")) {
                break;
            }

            int numero = Integer.parseInt(input);

            if (numero % posicao == 0) {
                JOptionPane.showMessageDialog(null, "O número " + numero + " é múltiplo de sua posição (" + posicao + ")");
            }
        }
    }
}
