package view.listar;

import dao.OrdemServicoDAO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Listar {
    private JTable lista;
    private JPanel painelOperacional;
    private JLabel labelTitle;
    private JPanel Listar;

    public Listar() {
        String[] colunas = {
                "ID",
                "Cliente",
                "Endereco",
                "CPF/CNPJ",
                "Telefone",
                "Data do pedido",
                "Data da entrega",
                "Discriminacao",
                "Valor total",
                "Valor pago",
                "Valor restando"
        };
        OrdemServicoDAO dao = new OrdemServicoDAO();
        dao.listarOrdem();

        DefaultTableModel model = new DefaultTableModel(dao.listarOrdem(), colunas) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };;
        lista.setModel(model);
    }

    public static void rodar() {
        JFrame frame = new JFrame("Listar");
        frame.setContentPane(new Listar().Listar);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
