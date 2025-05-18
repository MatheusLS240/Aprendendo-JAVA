package Iniciando_com_REPETICAO.src;

import javax.swing.JOptionPane;
import java.util.Random;

public class JogoMarciano {
    public static void main(String[] args) {
        Random rand = new Random();
        final int NUMEROMIN = 1;
        final int NUMEROMAX = 100;
        final int TENTATIVAPORJOGADOR = 10;
        int jogadorAtual = 1;
        int tentativa;
        int baixo = NUMEROMIN;
        int alto = NUMEROMAX;

        int arvoreMarciano = rand.nextInt(100) + 1;

        JOptionPane.showMessageDialog(null, "O jogo começa agora. O marciano está escondido em uma árvore entre 1 e 100.");

        for (int rodada = 1; rodada <= TENTATIVAPORJOGADOR; rodada++) {
            tentativa = Integer.parseInt(JOptionPane.showInputDialog("Rodada " + rodada + " de " + TENTATIVAPORJOGADOR + "\nJogador " + jogadorAtual + ", digite Account_01 árvore (entre " + baixo + " e " + alto + "):"));

            if (tentativa < baixo || tentativa > alto) {
                JOptionPane.showMessageDialog(null, "Digite um número dentro do intervalo entre " + baixo + " e " + alto + ".");
                rodada--;
                continue;
            }

            if (tentativa == arvoreMarciano) {
                JOptionPane.showMessageDialog(null, "Parabéns! O Jogador " + jogadorAtual + " acertou Account_01 árvore. O marciano foi capturado!");
                return;
            } else if (tentativa < arvoreMarciano) {
                JOptionPane.showMessageDialog(null, "O marciano está mais à direita.");
                baixo = tentativa + 1;
            } else {
                JOptionPane.showMessageDialog(null, "O marciano está mais à esquerda.");
                alto = tentativa - 1;
            }

            jogadorAtual = (jogadorAtual == 1) ? 2 : 1;
        }

        JOptionPane.showMessageDialog(null, "Ninguém conseguiu encontrar o marciano. O marciano estava na árvore " + arvoreMarciano + ".");
    }
}
