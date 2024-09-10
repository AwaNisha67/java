/*7. Enter the short integer from user using Scanner class*/
import java.util.Scanner;
class Main{
	public static void main(String ap[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a short integer:");
		Short x = input.nextShort();
		System.out.println("You have entered:" + x);
	}

}
