/*2. Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.*/

import java.util.Scanner;
class myException extends Throwable{
	public String getMessage(){
		return "You have entered an odd number";
	}
}

class Main{
	public static void main(String ap[]){
		Scanner sc = new Scanner(System.in);		
		int x = sc.nextInt();
		try{
		if(x%2 != 0){
			throw new myException();	
		}else{
			System.out.println(x);
		}
		}
		catch(myException e){
			System.out.println(e.getMessage());
		}
			
	}	

}