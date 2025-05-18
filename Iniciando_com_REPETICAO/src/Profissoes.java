package Iniciando_com_REPETICAO.src;

import javax.swing.JOptionPane;

public class Profissoes {
    public static void main(String[] args) {
        int quantidadeDentistas = 0;
        int quantidadePessoas = 0;

        String inputTotal = JOptionPane.showInputDialog("Quantas pessoas deseja cadastrar?");
        int totalPessoas = Integer.parseInt(inputTotal);

        for (int i = 0; i < totalPessoas; i++) {
            String nome = JOptionPane.showInputDialog("Digite o nome da pessoa (ou 'fim' para encerrar):");

            if (nome == null || nome.equalsIgnoreCase("fim")) {
                break;
            }

            String profissao = JOptionPane.showInputDialog("Digite Account_01 profissão de " + nome + ":");

            if (profissao != null && profissao.equalsIgnoreCase("dentista")) {
                quantidadeDentistas++;
            }

            quantidadePessoas++;
        }

        JOptionPane.showMessageDialog(null,
                "Total de pessoas cadastradas: " + quantidadePessoas +
                        "\nQuantidade de dentistas: " + quantidadeDentistas);
    }
}
