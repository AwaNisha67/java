/*6. Write a Java program that reads a list of integers from the user and throws an exception if any numbers are duplicates*/

class myException extends Throwable{
	public String getMessage(){
		return "dublicate";
	}
}

class Main{
	public static void main(String ap[]){
		int arr[] = {10,10,30,40,50};
		int i,j;
		try{
		for(i=0;i<arr.length;i++){
			for(j=i+1;j<arr.length;j++){
				if(arr[i] == arr[j]){
					throw new myException();
				}else{
					continue;
				}
			}	
		}
		}
		catch(myException e){
			System.out.println(e.getMessage());
		}
			
	}
}