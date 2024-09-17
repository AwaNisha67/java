/*1. Create a Java program to access the java.util.Date class through import keyword and print the current date of the system.*/

import java.util.Date;
class getDate extends Date{
	public int getDate(){
		return super.getDate();
	}
}
class Main{
	public static void main(String ap[]){
		getDate d1 = new getDate();
		System.out.println(d1.getDate());
	}
}