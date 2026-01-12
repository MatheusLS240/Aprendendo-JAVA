package dao;

import bean.OrdemServicoBean;
import util.ConectarBanco;
import util.Data;

import javax.swing.*;
import java.sql.*;
import java.time.LocalDate;
import java.time.temporal.TemporalAmount;

public class OrdemServicoDAO {
    private Connection conn = ConectarBanco.getConnection();

    public void adicionarOrdem(OrdemServicoBean os) {
        if (os == null) {
            System.out.println("A ordem de serviço não pode ser nula!");
            return;
        }
        String sql = "INSERT INTO ordem_servico_pendente(cliente, endereco, cpf_cnpj, telefone, dataEntrega, discriminacao, total, valorPago) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?);";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, os.getCliente());
            ps.setString(2, os.getEndereco());
            ps.setString(3, os.getCpf());
            ps.setString(4, os.getTelefone());
            ps.setDate(5, Date.valueOf(os.getDataEntrega()));
            ps.setString(6, os.getDescriminacao());
            ps.setDouble(7, os.getTotal());
            ps.setDouble(8, os.getValorPago());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Adicionado a ordem de serviço com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar ao banco! " + e);
        }
    }

    public void removerOrdem(int id) {
        String sql = "DELETE FROM ordem_servico_pendente WHERE id_ordemServico = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            int linhasAfetadas = ps.executeUpdate();
            if (linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(null, "Ordem de serviço removida com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "ID inexistente");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir do banco! " + e.getMessage());
        }
    }

    public void atualizarOrdem(String coluna, Object valor, int id) {
        String sql = "UPDATE ordem_servico_pendente SET " + coluna + " = ? WHERE id_ordemServico = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            if (valor instanceof Integer i) {
                ps.setInt(1, i);
            } else if (valor instanceof Double d) {
                ps.setDouble(1, d);
            } else {
                ps.setString(1, valor.toString());
            }

            ps.setInt(2, id);

            int linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(null, "Atualizado com sucesso o ID " + id);
            } else {
                JOptionPane.showMessageDialog(null, "ID inexistente");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void atualizarOrdem(String cliente, String endereco, String cpf_cnpj, String telefone, LocalDate dataEntrega, String discriminacao, double total, double valorPago, int id) {
        String sql = "UPDATE ordem_servico_pendente SET cliente = ?, endereco = ?, cpf_cnpj = ?, telefone = ?, " +
                "dataEntrega = ?, discriminacao = ?, total = ?, valorPago = ? WHERE id_ordemServico = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, cliente);
            ps.setString(2, endereco);
            ps.setString(3, cpf_cnpj);
            ps.setString(4, telefone);
            ps.setDate(5, Date.valueOf(dataEntrega));
            ps.setString(6, discriminacao);
            ps.setDouble(7, total);
            ps.setDouble(8, valorPago);
            ps.setInt(9, id);

            int linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(null, "Atualizado com sucesso o ID " + id);
            } else {
                JOptionPane.showMessageDialog(null, "ID inexistente");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void atualizarOrdem(String att, int id) {
        String sql = "UPDATE ordem_servico_pendente SET dataEntrega = ? WHERE id_ordemServico = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, String.valueOf(Data.adicionarDias(att)));
            ps.setInt(2, id);

            int linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(null, "Atualizado com sucesso o ID " + id);
            } else {
                JOptionPane.showMessageDialog(null, "ID inexistente");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String[][] listarOrdem() {
        String sql = "SELECT * FROM ordem_servico_pendente";

        int contar = 0;

        String[][] result = null;

        try (Statement stmt = conn.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE,  ResultSet.CONCUR_READ_ONLY )) {
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                contar++;
            }

            result = new String[contar][11];

            rs.beforeFirst();

            int i = 0;
            while (rs.next()) {
                result[i][0] = String.valueOf(rs.getInt(1));
                result[i][1] =rs.getString(2);
                result[i][2] = rs.getString(3);
                result[i][3] = rs.getString(4);
                result[i][4] = rs.getString(5);
                result[i][5] = String.valueOf(rs.getDate(6));
                result[i][6] = String.valueOf(rs.getDate(7));
                result[i][7] = rs.getString(8);
                result[i][8] = String.valueOf(rs.getDouble(9));
                result[i][9] = String.valueOf(rs.getDouble(10));
                result[i][10] = String.valueOf(rs.getDouble(11));

                i++;
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao listar ordens de serviço", e);
        }

        return result;
    }


}