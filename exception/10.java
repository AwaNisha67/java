import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/javadb";
        String user = "root";
        String password = "9780314063";

        Connection connection = null;
        Statement statement = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();

            String insertQuery = "INSERT INTO student (rollno, name) VALUES (1, 'avisha')";
            statement.executeUpdate(insertQuery);

            String updateQuery = "UPDATE student SET name = 'Awanisha' WHERE rollno = 1";
            statement.executeUpdate(updateQuery);

            String deleteQuery = "DELETE FROM student WHERE rollno = 1";
            statement.executeUpdate(deleteQuery);

        } catch (SQLException e) {
            System.out.println("SQL error: " + e.getMessage());
        } 
    }
}
