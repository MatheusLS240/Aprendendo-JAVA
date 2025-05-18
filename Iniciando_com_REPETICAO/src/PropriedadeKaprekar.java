package Iniciando_com_REPETICAO.src;

import javax.swing.JOptionPane;

public class PropriedadeKaprekar {
    public static void main(String[] args) {
        for (;;) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 4 algarismos (ou um valor menor que 1000 ou maior que 9999 para terminar):"));

            if (numero < 1000 || numero > 9999) {
                break;
            }

            int parte1 = numero / 100;
            int parte2 = numero % 100;

            int soma = parte1 + parte2;

            if (soma * soma == numero) {
                JOptionPane.showMessageDialog(null, numero + " tem Account_01 característica de Kaprekar!");
            } else {
                JOptionPane.showMessageDialog(null, numero + " não tem Account_01 característica de Kaprekar.");
            }
        }
    }
}
