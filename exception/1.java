/*Write a Java program that throws an exception and catch it using a try-catch block.*/

class Main{
	public static void main(String ap[]){
		try{
		int arr[] = null;
		System.out.println(arr[1]);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}