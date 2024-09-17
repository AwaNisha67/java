/*2. Enter the string from user using BufferedStreamReader*/

class Main{
	public static void main(String ap[]) throws java.io.IOException{
		java.io.InputStreamReader rder = new java.io.InputStreamReader(System.in);
		java.io.BufferedReader br = new java.io.BufferedReader(rder);
		
		System.out.println(br.readLine());
	}
}