package view;

import view.add.Adicionar;
import view.att.Atualizar;
import view.listar.Listar;
import view.remove.Remover;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PainelPrincipal {
    private JPanel Iniciar;
    private JPanel painelOperacional;
    private JButton adicionarButton;
    private JButton removerButton;
    private JButton atualizarButton;
    private JButton listarButton;
    private JLabel labelTitle;

    public PainelPrincipal() {
        adicionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Adicionar.rodar();
            }
        });
        removerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Remover.rodar();
            }
        });
        atualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Atualizar.rodar();
            }
        });
        listarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Listar.rodar();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu");
        frame.setContentPane(new PainelPrincipal().Iniciar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
