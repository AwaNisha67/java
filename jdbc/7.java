/*7. Create a Scrollable Readonly Resultset and ask the row number from the user and display that row on the screen.*/

import java.sql.*;

class Main{
	public static void main(String ap[]) throws ClassNotFoundException, java.sql.SQLException{
	String path = "jdbc:mysql://localhost:3306/javadb";
	String user = "root";
	String pass = "9780314063";

	//load the drivers
	Class.forName("com.mysql.cj.jdbc.Driver");

	//establish a connection
	Connection c1 = DriverManager.getConnection(path,user,pass);
	
	Statement stmt = c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
	ResultSet rs = stmt.executeQuery("select * from student");
	
	System.out.println(rs.next());//true
	System.out.println(rs.getInt(1));
	System.out.println(rs.getString(2));
	}

}
