/*4. Enter the float from user using Scanner class*/
import java.util.Scanner;
class Main{
	public static void main(String ap[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a float number:");
		Float x = input.nextFloat();
		System.out.println("You have entered:" + x);
	}

}

//output
Enter a float number:
23.09
You have entered:23.09
