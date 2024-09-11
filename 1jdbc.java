/*1. Create the connection with MySQL Database and manage the driver.*/
import java.sql.*;

class Main{
	public static void main(String ap[]){
		//load Drivers 
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		//connection
		String path = "jdbc:mysql://localhost:3306/javadb";
		String user = "root";
		String pass = "9780314063";

		Connection c1 = DriverManager.getConnection(path,user,pass);
		}catch(java.lang.ClassNotFoundException e){
			System.out.println("ClassNotFoundException");
		}catch(SQLException e){
			System.out.println("SQLException");	
		}
		System.out.println("Connection has been established");
	}
}
