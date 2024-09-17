/*7. Write a Java program to create a method that takes a string as input and throws an exception if the string does not contain vowels.*/

class myException extends Throwable{
	public String getMessage(){
		return "This string doesnot contain a single vowel";
	}
}

class Main{
	public static void main(String ap[]){
	String st = "Hlll";
	
	try{
		if(vowelChecker(st) == -1){
			throw new myException();
		}
	}
        catch(myException e){
		System.out.println(e.getMessage());
	}
	}
	static int vowelChecker(String st){
		int i;
		int x;
		for(i=0;i<st.length();i++){
			char ch = st.charAt(i);
			if(ch == 'a' || ch == 'e' ||ch == 'i' || ch == 'o' || ch == 'u'){
				return 1;
			}
		}
		return -1;
	}
}