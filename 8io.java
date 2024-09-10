/*8. Enter the long integer from user using Scanner class*/
import java.util.Scanner;
class Main{
	public static void main(String ap[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a long integer:");
		Long x = input.nextLong();
		System.out.println("You have entered:" + x);
	}

}
