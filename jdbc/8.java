/*8. Create a Scrollable Updateable Resultset and insert a new row, update an existing row and delete the row from Resultset and also the changes should be made to the database also. The values should be inserted, updated and deleted by the user only.*/

import java.sql.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String path = "jdbc:mysql://localhost:3306/javadb";
        String user = "root";
        String password = "9780314063";
        Scanner sc = new Scanner(System.in);

        // Load the JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Establish a connection
        Connection c1 = DriverManager.getConnection(path, user, password);

        // Create a scrollable and updatable ResultSet
        Statement stmt = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery("SELECT * FROM student");

        while (true) {
            System.out.println("Press 1: Insert a row");
            System.out.println("Press 2: Update an existing row");
            System.out.println("Press 3: Delete a row");
            System.out.println("Press 4: Quit");
            System.out.print("Enter your choice: ");
            int input = sc.nextInt();
            sc.nextLine();
            switch (input) {
                case 1: // Insert
                    System.out.print("Enter roll number: ");
                    int srollno = sc.nextInt();
                    sc.nextLine();

                    // Insert into ResultSet
                    rs.moveToInsertRow();	
                    rs.updateInt("rollno", srollno);
                   
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    rs.updateString("name", name);
                    rs.insertRow();
                    System.out.println("Row inserted successfully.");
                    break;

                case 2: // Update
                    System.out.print("Enter roll number to update: ");
                    int sprevRoll = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new roll number: ");
                    int currRoll = sc.nextInt();
                    sc.nextLine(); 

                    boolean exist = false;
                    while (rs.next()) {
                        if (sprevRoll == rs.getInt("rollno")) {
                            rs.updateInt("rollno", currRoll);
                            rs.updateRow();
                            System.out.println("Roll number updated successfully.");
                            exist= true;
                            break; // Exit loop after updating
                        }
                    }
                    if (!exist) {
                        System.out.println("Roll number " + sprevRoll + " not found.");
                    }
                    break;

                case 3: // Delete
                    System.out.print("Enter roll number to delete: ");
                    int rollToDelete = sc.nextInt();
                    sc.nextLine();

                    exist = false; 
                    while (rs.next()) {
                        if (rollToDelete == rs.getInt("rollno")) {
                            rs.deleteRow();
                            System.out.println("Row deleted successfully.");
                            exist= true;
                            break; // Exit loop after deleting
                        }
                    }
                    if (!exist) {
                        System.out.println("Roll number " + rollToDelete + " not found.");
                    }
                    break;

                case 4: // Quit
                    System.out.println("Exiting...");
                    rs.close();
                    stmt.close();
                    c1.close();
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

		
