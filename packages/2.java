/*2. Create a Java program to access the java.util.Date class through qualified way and print the current date of the system.*/

class Main{
	public static void main(String ap[]){
		java.util.Date d1 = new java.util.Date();
		System.out.println(d1.getDate());
	}
}