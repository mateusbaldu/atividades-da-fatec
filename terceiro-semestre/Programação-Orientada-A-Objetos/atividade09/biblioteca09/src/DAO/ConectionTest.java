package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionTest {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/biblioteca";
        String user = "root";
        String password = "Mateus123#$@";

        try {
            Connection conexao = DriverManager.getConnection(url, user, password);
            System.out.println("Conectado");
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
