import java.sql.*;

class Main{
	public static void main(String ap[]){	
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","9780314063");
		System.out.println("Connection has been eestablished");

		//taking input from user
		java.io.InputStreamReader rder = new java.io.InputStreamReader(System.in);
		java.io.BufferedReader br = new java.io.BufferedReader(rder);
		
		System.out.println("Enter your rollnumber");
		String rollno = br.readLine();
		System.out.println("Enter your name:");
		String name = br.readLine();
		
		PreparedStatement psmpt = c1.prepareStatement("insert into tb1 values (?,?)");
		psmpt.setString(1,rollno);
		psmpt.setString(2,name);
		int rows = psmpt.executeUpdate();
		System.out.println("Rows affected:-" + rows);

		}
		catch(ClassNotFoundException e){
			System.out.println("Class has not been found"+ e.getMessage());	
		}
		catch(java.sql.SQLException e){
			System.out.println("Some error has been occurred");
		}catch(java.io.IOException e){
			System.out.println("Input output exception");
		}
	}
}