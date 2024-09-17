/*1. Enter the character from user using InputStreamReader*/

class Main{
	public static void main(String ap[]) throws java.io.IOException{
		java.io.InputStreamReader rder = new java.io.InputStreamReader(System.in);
		int x = rder.read();
		System.out.println(x);
	}
}