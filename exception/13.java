/*13. Write a Java program to show an example of nested try block.*/

class Main{
    public static void main(String ap[]) {
        try {
            System.out.println("Outer try block");

             int[] numbers = new int[5];
            
            try {
                numbers[10] = 100; 
                
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
		
		int result = 10 / 0;

        } catch (ArithmeticException e) {

            System.out.println(e.getMessage());
        }
        System.out.println("Program continued ");
    }
}
