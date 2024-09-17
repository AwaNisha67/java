/*7. Create a Scrollable Readonly Resultset and ask the row number from the user and display that row on the screen.*/

import java.sql.*;

class Main{
	public static void main(String ap[]) throws ClassNotFoundException,java.sql.SQLException{
		//load the drivers
		Class.forName("com.mysql.cj.jdbc.Driver");
		//connection 
		Connection c1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","9780314063");
		System.out.println("Connection has been established");
		
		Statement s1 = c1.createStatement();
		ResultSet rs = s1.executeQuery("select * from student");
		while(rs.next()){

		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		}
	}
}