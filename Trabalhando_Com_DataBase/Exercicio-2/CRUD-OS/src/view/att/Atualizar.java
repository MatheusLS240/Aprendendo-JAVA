package view.att;

import dao.OrdemServicoDAO;
import util.Data;
import util.ValidarInfo;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class Atualizar {
    private JComboBox comboBoxCampo;
    private JLabel labelCampoAtt;
    private JTextField fieldCliente;
    private JTextField fieldEndereco;
    private JTextField fieldCpfCnpj;
    private JTextField fieldTelefone;
    private JTextField fieldPrazo;
    private JTextField fieldValorPago;
    private JTextArea fieldDiscriminacao;
    private JTextField fieldTotal;
    private JLabel labelCliente;
    private JLabel labelEndereco;
    private JLabel labelCpfCnpj;
    private JLabel labelTelefone;
    private JLabel labelPrazo;
    private JLabel labelDiscriminacao;
    private JLabel labelTotal;
    private JLabel labelValorPago;
    private JPanel Atualizar;
    private JPanel painelOperacional;
    private JButton submitCliente;
    private JTextField fieldIdCliente;
    private JLabel labelIdCliente;
    private JButton submitEndereco;
    private JButton submitCpfCnpj;
    private JButton submitTel;
    private JButton submitPrazo;
    private JButton submitDiscriminacao;
    private JButton submitTotal;
    private JButton submitValorPago;
    private JButton submitTodos;

    private void campoAtt() {
        fieldCliente.setEnabled(false);
        fieldEndereco.setEnabled(false);
        fieldCpfCnpj.setEnabled(false);
        fieldTelefone.setEnabled(false);
        fieldPrazo.setEnabled(false);
        fieldDiscriminacao.setEnabled(false);
        fieldTotal.setEnabled(false);
        fieldValorPago.setEnabled(false);

        labelCliente.setEnabled(false);
        labelEndereco.setEnabled(false);
        labelCpfCnpj.setEnabled(false);
        labelTelefone.setEnabled(false);
        labelPrazo.setEnabled(false);
        labelDiscriminacao.setEnabled(false);
        labelTotal.setEnabled(false);
        labelValorPago.setEnabled(false);

        submitCliente.setVisible(true);
        submitEndereco.setVisible(true);
        submitCpfCnpj.setVisible(true);
        submitTel.setVisible(true);
        submitPrazo.setVisible(true);
        submitDiscriminacao.setVisible(true);
        submitTotal.setVisible(true);
        submitValorPago.setVisible(true);

        submitTodos.setVisible(false);

        submitCliente.setEnabled(false);
        submitEndereco.setEnabled(false);
        submitCpfCnpj.setEnabled(false);
        submitTel.setEnabled(false);
        submitPrazo.setEnabled(false);
        submitDiscriminacao.setEnabled(false);
        submitTotal.setEnabled(false);
        submitValorPago.setEnabled(false);
        submitTodos.setEnabled(false);

        String escolha = (String) comboBoxCampo.getSelectedItem();

        switch (escolha) {
            case "Cliente" -> {
                fieldCliente.setEnabled(true);
                submitCliente.setEnabled(true);
                labelCliente.setEnabled(true);
            }
            case "Endereço" -> {
                fieldEndereco.setEnabled(true);
                submitEndereco.setEnabled(true);
                labelEndereco.setEnabled(true);
            }
            case "CPF/CNPJ" -> {
                fieldCpfCnpj.setEnabled(true);
                submitCpfCnpj.setEnabled(true);
                labelCpfCnpj.setEnabled(true);
            }
            case "Telefone" -> {
                fieldTelefone.setEnabled(true);
                submitTel.setEnabled(true);
                labelTelefone.setEnabled(true);
            }
            case "Data da Entrega" -> {
                fieldPrazo.setEnabled(true);
                submitPrazo.setEnabled(true);
                labelPrazo.setEnabled(true);
            }
            case "Discriminação" -> {
                fieldDiscriminacao.setEnabled(true);
                submitDiscriminacao.setEnabled(true);
                labelDiscriminacao.setEnabled(true);
            }
            case "Total" -> {
                fieldTotal.setEnabled(true);
                submitTotal.setEnabled(true);
                labelTotal.setEnabled(true);
            }
            case "Valor Pago" -> {
                fieldValorPago.setEnabled(true);
                submitValorPago.setEnabled(true);
                labelValorPago.setEnabled(true);
            }
            case "Todos" -> {
                fieldCliente.setEnabled(true);
                fieldEndereco.setEnabled(true);
                fieldCpfCnpj.setEnabled(true);
                fieldTelefone.setEnabled(true);
                fieldPrazo.setEnabled(true);
                fieldDiscriminacao.setEnabled(true);
                fieldTotal.setEnabled(true);
                fieldValorPago.setEnabled(true);

                labelCliente.setEnabled(true);
                labelEndereco.setEnabled(true);
                labelCpfCnpj.setEnabled(true);
                labelTelefone.setEnabled(true);
                labelPrazo.setEnabled(true);
                labelDiscriminacao.setEnabled(true);
                labelTotal.setEnabled(true);
                labelValorPago.setEnabled(true);

                submitTodos.setVisible(true);
                submitTodos.setEnabled(true);

                submitCliente.setVisible(false);
                submitEndereco.setVisible(false);
                submitCpfCnpj.setVisible(false);
                submitTel.setVisible(false);
                submitPrazo.setVisible(false);
                submitDiscriminacao.setVisible(false);
                submitTotal.setVisible(false);
                submitValorPago.setVisible(false);
            }
        }
    }

    public Atualizar() {
        submitCliente.addActionListener(e -> {
            try {
                String cliente = ValidarInfo.validarString(fieldCliente.getText());
                int id = Integer.parseInt(fieldIdCliente.getText());
                OrdemServicoDAO dao = new OrdemServicoDAO();
                dao.atualizarOrdem("cliente", cliente, id);
                fieldCliente.setText("");
                fieldIdCliente.setText("");
            } catch (Exception error) {
                JOptionPane.showMessageDialog(null, error.getMessage());
            }
        });

        submitEndereco.addActionListener(e -> {
            try {
                String endereco = ValidarInfo.validarString(fieldEndereco.getText());
                int id = Integer.parseInt(fieldIdCliente.getText());
                OrdemServicoDAO dao = new OrdemServicoDAO();
                dao.atualizarOrdem("endereco", endereco, id);
                fieldEndereco.setText("");
                fieldIdCliente.setText("");
            } catch (Exception error) {
                JOptionPane.showMessageDialog(null, error.getMessage());
            }
        });

        submitCpfCnpj.addActionListener(e -> {
            try {
                String cpfCnpj = ValidarInfo.validarString(fieldCpfCnpj.getText());
                int id = Integer.parseInt(fieldIdCliente.getText());
                OrdemServicoDAO dao = new OrdemServicoDAO();
                dao.atualizarOrdem("cpf_cnpj", cpfCnpj, id);
                fieldCpfCnpj.setText("");
                fieldIdCliente.setText("");
            } catch (Exception error) {
                JOptionPane.showMessageDialog(null, error.getMessage());
            }
        });

        submitTel.addActionListener(e -> {
            try {
                String telefone = ValidarInfo.validarString(fieldTelefone.getText());
                int id = Integer.parseInt(fieldIdCliente.getText());
                OrdemServicoDAO dao = new OrdemServicoDAO();
                dao.atualizarOrdem("telefone", telefone, id);
                fieldTelefone.setText("");
                fieldIdCliente.setText("");
            } catch (Exception error) {
                JOptionPane.showMessageDialog(null, error.getMessage());
            }
        });

        submitPrazo.addActionListener(e -> {
            try {
                LocalDate prazo = Data.adicionarDias(fieldCliente.getText());
                int id = Integer.parseInt(fieldIdCliente.getText());
                OrdemServicoDAO dao = new OrdemServicoDAO();
                dao.atualizarOrdem("prazo", String.valueOf(prazo), id);
                fieldPrazo.setText("");
                fieldIdCliente.setText("");
            } catch (Exception error) {
                JOptionPane.showMessageDialog(null, error.getMessage());
            }
        });

        submitDiscriminacao.addActionListener(e -> {
            try {
                String discriminacao = ValidarInfo.validarString(fieldDiscriminacao.getText());
                int id = Integer.parseInt(fieldIdCliente.getText());
                OrdemServicoDAO dao = new OrdemServicoDAO();
                dao.atualizarOrdem("discriminacao", discriminacao, id);
                fieldDiscriminacao.setText("");
                fieldIdCliente.setText("");
            } catch (Exception error) {
                JOptionPane.showMessageDialog(null, error.getMessage());
            }
        });

        submitTotal.addActionListener(e -> {
            try {
                double total = ValidarInfo.validarDouble(fieldTotal.getText());
                int id = Integer.parseInt(fieldIdCliente.getText());
                OrdemServicoDAO dao = new OrdemServicoDAO();
                dao.atualizarOrdem("total", String.valueOf(total), id);
                fieldTotal.setText("");
                fieldIdCliente.setText("");
            } catch (Exception error) {
                JOptionPane.showMessageDialog(null, error.getMessage());
            }
        });

        submitValorPago.addActionListener(e -> {
            try {
                double valorPago = ValidarInfo.validarDouble(fieldValorPago.getText());
                int id = Integer.parseInt(fieldIdCliente.getText());
                OrdemServicoDAO dao = new OrdemServicoDAO();
                dao.atualizarOrdem("valorPago", String.valueOf(valorPago), id);
                fieldValorPago.setText("");
                fieldIdCliente.setText("");
            } catch (Exception error) {
                JOptionPane.showMessageDialog(null, error.getMessage());
            }
        });

        submitTodos.addActionListener(e -> {
            try {
                String cliente = ValidarInfo.validarString(fieldCliente.getText());
                String endereco = ValidarInfo.validarString(fieldEndereco.getText());
                String cpfCnpj = ValidarInfo.validarString(fieldCpfCnpj.getText());
                String telefone = ValidarInfo.validarString(fieldTelefone.getText());
                String prazoS = ValidarInfo.validarString(fieldPrazo.getText());
                LocalDate prazo = Data.adicionarDias(prazoS);
                String discriminacao = ValidarInfo.validarString(fieldDiscriminacao.getText());
                double total = ValidarInfo.validarDouble(fieldTotal.getText());
                double valorPago = ValidarInfo.validarDouble(fieldValorPago.getText());
                int id = ValidarInfo.validarInt(fieldIdCliente.getText());

                OrdemServicoDAO dao = new OrdemServicoDAO();
                dao.atualizarOrdem(cliente, endereco, cpfCnpj, telefone, prazo, discriminacao, total, valorPago, id);

                fieldIdCliente.setText("");
                fieldCliente.setText("");
                fieldEndereco.setText("");
                fieldCpfCnpj.setText("");
                fieldTelefone.setText("");
                fieldPrazo.setText("");
                fieldDiscriminacao.setText("");
                fieldTotal.setText("");
                fieldValorPago.setText("");
            } catch (Exception error) {
                JOptionPane.showMessageDialog(null, error.getMessage());
            }
        });

        comboBoxCampo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                campoAtt();
            }
        });
    }


    public static void rodar() {
        JFrame frame = new JFrame("Atualizar");
        frame.setContentPane(new Atualizar().Atualizar);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
