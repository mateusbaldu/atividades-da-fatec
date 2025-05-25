package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
        public static final String url = "jdbc:mysql://localhost:3306/biblioteca";
        public static final String user = "root";
        public static final String password = "***************";

        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(url, user, password);
        }
}
