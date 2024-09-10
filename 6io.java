/*6. Enter the boolean from user using Scanner class*/
import java.util.Scanner;
class Main{
	public static void main(String ap[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a boolean value:");
		Boolean x = input.nextBoolean();
		System.out.println("You have entered:" + x);
	}

}
