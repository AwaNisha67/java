import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main{
    public static void main(String[] args) {
      
        String jdbcDriver = "com.mysql.cj.jdbc.Driver"; 
        String url = "jdbc:mysql://localhost:3306/javadb"; 
        String user = "root"; 
        String password = "your_password";
        Connection connection = null;
        try {
            Class.forName(jdbcDriver);
            System.out.println("Driver loaded successfully.");
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection to the database was successful!");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database: " + e.getMessage());
          
        }
    }
}
