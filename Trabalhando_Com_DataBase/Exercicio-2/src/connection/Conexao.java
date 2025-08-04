package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String url = "jdbc:mysql://localhost:3306:biblioteca";
    private static final String user = "root";
    private static final String password = "admin";

    static Connection conn = null;

    public static Connection getConnection() {
        try {
            if(conn == null) {
                conn = DriverManager.getConnection(url, user, password);
                return conn;
            }
            return conn;
        } catch(SQLException e) {
            System.err.println("Impossivel conectar ao banco de dados, renicie o app (" + e + ")");
            return null;
        }
    }
}
