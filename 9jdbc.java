/*9. Create a Java Program to show, insert, update, delete of the table in Java API through PreparedStatement*/

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
		PreparedStatement psmt1 = c1.prepareStatement("INSERT INTO tb1 VALUES(?,?)");
		psmt1.setInt(1,4265);
		psmt1.setString(2,"irfaan");
		int rowsAffected = psmt1.executeUpdate();
		
		PreparedStatement psmt2 = c1.prepareStatement("DELETE FROM tb1 WHERE name = ?");
		psmt2.setString(1,"irfaan");
		int rowsDeleted = psmt2.executeUpdate();
		}catch(ClassNotFoundException e){
			System.out.println("Class not found");
		}
		catch(SQLException e){
			System.out.println("unfortunate error");
		}
	}
}
