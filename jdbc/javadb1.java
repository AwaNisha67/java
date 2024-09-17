import java.sql.*;

class Main{

	public static void main(String ap[]) throws java.lang.ClassNotFoundException,java.sql.SQLException{
	//loading the driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("Drivers has been loaded");
	//DriverManager d1 = new DriverManager();
	
	//establishing connections 
	String url = "jdbc:mysql://localhost:3306/javadb";
	String userName = "root";
	String password = "9780314063";
	Connection c1 = DriverManager.getConnection(url,userName,password);
	System.out.println("Connection has been established");
	
	//query Statement, preparedStament
	/*Statement st1 = c1.createStatement();
	int rows = st1.executeUpdate("insert into student(rollno,name) values (4265,'irfaan'),(4267,'avnisha')");
	System.out.println(rows);
	*/
	PreparedStatement pst1 = c1.prepareStatement("delete from student where rollno = 4266");
	int rows = pst1.executeUpdate();
	System.out.println(rows);
	
	c1.close();
	System.out.println("Connection has been closed");
	
	}
}