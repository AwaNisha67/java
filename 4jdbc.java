/*4. Update the row in the table in the database from Java API.*/

import java.sql.*;

class Main{
	public static void main(String ap[]){
		String path = "jdbc:mysql://localhost:3306/javadb";
		Connection c1 = null;
			//load the drivers
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
			//connection establish 
		c1 = DriverManager.getConnection(path,"root","9780314063");
			//query create
		Statement st1 = c1.createStatement();
			//query execute
		int rows = st1.executeUpdate("UPDATE tb1 SET name = 'avni' WHERE rollno = 4267");
		System.out.println("Rows updated:" + rows);
		}catch(ClassNotFoundException e){
			System.out.println("Class not found");
		}
		catch(SQLException e){
			System.out.println("unfortunate error");
		}
	}
}
