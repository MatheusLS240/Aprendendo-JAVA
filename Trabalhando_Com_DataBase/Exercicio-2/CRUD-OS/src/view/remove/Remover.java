package view.remove;

import dao.OrdemServicoDAO;
import util.ValidarInfo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Remover {
    private JLabel labelTitle;
    private JTextField fieldId;
    private JLabel labelIdCliente;
    private JPanel painelOperacional;
    private JPanel Remover;
    private JButton excluirButton;

    public Remover() {
        excluirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if(fieldId.getText().isEmpty()) {
                        throw new Exception("CAMPO ID VAZIO!");
                    }

                    int id = ValidarInfo.validarInt(fieldId.getText());
                    OrdemServicoDAO dao = new OrdemServicoDAO();
                    dao.removerOrdem(id);
                    fieldId.setText("");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                    return;
                }
            }
        });
    }

    public static void rodar() {
        JFrame frame = new JFrame("Remover");
        frame.setContentPane(new Remover().Remover);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
