import java.sql.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        // Connection parameters
        String url = "jdbc:mysql://localhost:3306/javadb";
        String user = "root";
        String password = "9780314063";

        Connection c1 = null;
        PreparedStatement psmpt = null;

        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            c1 = DriverManager.getConnection(url, user, password);
            System.out.println("Connection has been established");

            // Taking input from user
            InputStreamReader rder = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(rder);

            System.out.println("Enter your roll number:");
            String rollno = br.readLine();
            System.out.println("Enter your name:");
            String name = br.readLine();

            // Prepare and execute the SQL statement
            psmpt = c1.prepareStatement("INSERT INTO tb1 VALUES (?, ?)");
            psmpt.setString(1, rollno);
            psmpt.setString(2, name);
            int rows = psmpt.executeUpdate();
            System.out.println("Rows affected: " + rows);

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQL error: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IO error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (psmpt != null) psmpt.close();
                if (c1 != null) c1.close();
            } catch (SQLException e) {
                System.out.println("Error closing resources: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
