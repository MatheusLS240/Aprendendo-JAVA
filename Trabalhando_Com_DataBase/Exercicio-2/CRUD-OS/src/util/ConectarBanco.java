package util;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConectarBanco {
    private static final String url = "jdbc:mysql://localhost:3306/ordem_servico";
    private static final String user = "root";
    private static final String senha = "";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(url, user, senha);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Impossivel conectar ao banco! " + e);
            return null;
        }
    }
}
