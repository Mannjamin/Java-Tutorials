/**
 * package goes at the top of the file
 */
package edu.brunel.cs2004.java.tutorial.two.mypackage;

/**
 * @author Mann
 *
 */
public class MyClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		myMethod();
	}
	
	public static void myMethod() {
		Car myCar = new Car();
		
		myCar.setBrand("Subaru");
		myCar.setModel("Impreza");
		myCar.setColor("Black");
		
		myCar.getDetails();
		
		Car anotherCar = new Car("Ford", "Mustang", "Red");
		anotherCar.getDetails();
		anotherCar.setColor("Green");
		anotherCar.getDetails();

	}

}
