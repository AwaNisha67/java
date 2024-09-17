/*11. Write a Java program to show an example of throws Keyword.*/

class myException extends Throwable{
	public String getMessage(){
		return "negative number entered";
	}
}

class Main{
	public static void main(String ap[]){
		try{
		display(ap[0]);	
		}
		catch(myException e){
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}
	}
	static void display(String s) throws myException{
		if(Integer.parseInt(s)<0){
			throw new myException();
		}
		System.out.println(s);
	}
}