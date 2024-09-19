/*1. Write a Java program to create an interface Shape with the getArea() method. Create three classes Rectangle, Circle, and Triangle that implement the Shape interface. Implement the getArea() method for each of the three classes.*/

interface Shape{
	void getArea();
}

class Rectangle implements Shape{
	public void getArea(){
		System.out.println("Shape is Rectangle");
	}
}
class Cricle{
	public void getArea(){
		System.out.println("Shape is Circle");
	}
}
class Triangle{
	public void getArea(){
		System.out.println("Shape is Triangle");
	}
}

class Main{
	public static void main(String ap[]){
		Rectangle rec1 = new Rectangle();
Cricle c1 = new Cricle();
Triangle tri1 = new Triangle();

		rec1.getArea();
		c1.getArea();
		tri1.getArea();
	}

}