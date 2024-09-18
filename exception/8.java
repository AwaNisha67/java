import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/javadb"; 
        String user = "root"; 
        String password = "your_password"; 
        Connection c1 = null;
        try {
            c1 = DriverManager.getConnection(url, user, password);
            System.out.println("Connection to the database was successful!");
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database: " + e.getMessage());
        } 
    }
}
