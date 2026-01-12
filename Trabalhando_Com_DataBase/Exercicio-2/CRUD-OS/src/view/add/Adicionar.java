package view.add;

import bean.OrdemServicoBean;
import dao.OrdemServicoDAO;
import util.Data;
import util.ValidarInfo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class Adicionar extends JFrame {
    private JTextField fieldCliente;
    private JTextField fieldEndereco;
    private JPanel painelOperacional;
    private JLabel labelCliente;
    private JLabel labelEndereco;
    private JPanel Adicionar;
    private JLabel labelTitle;
    private JTextField fieldCpfCnpj;
    private JLabel labelCpfCnpj;
    private JTextField fieldPrazo;
    private JTextField fieldTel;
    private JTextField fieldValorTotal;
    private JTextField fieldValorPago;
    private JLabel labelTelefone;
    private JTextArea fieldDescriminacao;
    private JLabel labelDiscriminacao;
    private JLabel labelTotal;
    private JLabel labelValorPago;
    private JButton submit;
    private JLabel labelPrazo;

    public Adicionar() {
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String cliente = ValidarInfo.validarString(fieldCliente.getText());
                    String endereco = ValidarInfo.validarString(fieldEndereco.getText());
                    String cpfCnpj = ValidarInfo.validarString(fieldCpfCnpj.getText());
                    String telefone = ValidarInfo.validarString(fieldTel.getText());
                    String prazoS = ValidarInfo.validarString(fieldPrazo.getText());
                    LocalDate prazo = Data.adicionarDias(prazoS);
                    String discriminacao = ValidarInfo.validarString(fieldDescriminacao.getText());
                    double valorTotal =  ValidarInfo.validarDouble(fieldValorTotal.getText());
                    double valorPago = ValidarInfo.validarDouble(fieldValorPago.getText());

                    OrdemServicoBean temp = new OrdemServicoBean(cliente, endereco, cpfCnpj, telefone, prazo, discriminacao, valorTotal, valorPago);
                    OrdemServicoDAO dao = new OrdemServicoDAO();
                    dao.adicionarOrdem(temp);

                    fieldCliente.setText("");
                    fieldEndereco.setText("");
                    fieldCpfCnpj.setText("");
                    fieldTel.setText("");
                    fieldPrazo.setText("");
                    fieldDescriminacao.setText("");
                    fieldValorTotal.setText("");
                    fieldValorPago.setText("");
                } catch (Exception error) {
                    JOptionPane.showMessageDialog(null, error.getMessage());
                }
            }
        });
    }

    public static void rodar() {
        JFrame frame = new JFrame("Adicionar");
        frame.setContentPane(new Adicionar().Adicionar);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
