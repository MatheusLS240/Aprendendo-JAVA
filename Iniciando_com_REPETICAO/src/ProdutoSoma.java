package Iniciando_com_REPETICAO.src;

import javax.swing.JOptionPane;

public class ProdutoSoma {
    public static void main(String[] args) {
        int somaPares = 0;
        int produtoImpares = 1;
        boolean encontrouImpar = false;

        for (;;) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número (ou 0 para terminar):"));

            if (numero == 0) {
                break;
            }

            if (numero % 2 == 0) {
                somaPares += numero;
            } else {
                produtoImpares *= numero;
                encontrouImpar = true;
            }
        }

        if (encontrouImpar) {
            JOptionPane.showMessageDialog(null, "Produto dos números ímpares: " + produtoImpares);
        } else {
            JOptionPane.showMessageDialog(null, "Não foram inseridos números ímpares.");
        }
        JOptionPane.showMessageDialog(null, "Soma dos números pares: " + somaPares);
    }
}
