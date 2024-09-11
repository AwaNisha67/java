/*2. Create the table in the database from Java API.*/
import java.sql.*;

class Main{
	public static void main(String ap[]){
		String path = "jdbc:mysql://localhost:3306/javadb";
		Connection c1 = null;
		try{
		//load drivers
		Class.forName("com.mysql.cj.jdbc.Driver");
		//connection
		c1 = DriverManager.getConnection(path,"root","9780314063");
		//query Create
		Statement st1 = c1.createStatement();
		//query execute
		int rows = st1.executeUpdate("CREATE TABLE tb1 (rollno int, name varchar(20))");
		System.out.println(rows);
		}catch(java.lang.ClassNotFoundException e){
			System.out.println("Class not found");
		}catch(SQLException s){
			System.out.println("Some error has accured");
		}
		finally{
		//closing the connection
		try{
		c1.close();
		}catch(SQLException s){
			System.out.println("Some error has accured");
		}
		}

	}
}
