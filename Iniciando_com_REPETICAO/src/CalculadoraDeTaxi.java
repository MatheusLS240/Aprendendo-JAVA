package Iniciando_com_REPETICAO.src;

import javax.swing.JOptionPane;

public class CalculadoraDeTaxi {
    public static void main(String[] args) {
        int tempo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo em segundos:"));
        double distancia = Double.parseDouble(JOptionPane.showInputDialog("Digite Account_01 distância percorrida em quilômetros:"));

        double valorTempo = tempo * 0.02;
        double valorDistancia = distancia * 1.00;

        double valorTotal = valorTempo + valorDistancia;

        JOptionPane.showMessageDialog(null, "O valor Account_01 ser pago pela corrida é: R$ " + valorTotal);
    }
}
