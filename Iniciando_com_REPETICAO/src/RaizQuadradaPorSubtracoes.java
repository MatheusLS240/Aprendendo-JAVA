package Iniciando_com_REPETICAO.src;

import javax.swing.JOptionPane;

public class RaizQuadradaPorSubtracoes {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para calcular sua raiz quadrada (número inteiro):"));

        if (numero < 0) {
            JOptionPane.showMessageDialog(null, "O número deve ser positivo.");
            return;
        }

        int contador = 0;
        int subtraindo = 1;
        int resultado = numero;

        for (; resultado > 0; subtraindo += 2, contador++) {
            resultado -= subtraindo;
        }

        if (resultado == 0) {
            JOptionPane.showMessageDialog(null, "A raiz quadrada exata de " + numero + " é " + contador);
        } else {
            JOptionPane.showMessageDialog(null, "A raiz quadrada aproximada de " + numero + " é " + contador);
        }
    }
}
