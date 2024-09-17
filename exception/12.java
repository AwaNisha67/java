/*12. Write a Java program to show an example of multiple catch*/

class Main{
	public static void main(String ap[]){
		try{
			System.out.println(Integer.parseInt(ap[0]));
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e){
			System.out.println(e.getMessage());
		}
	}
}