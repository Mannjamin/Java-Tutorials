/**
 * package goes at the top of the file
 */
package edu.brunel.cs2004.java.tutorial.three.mypackage;

public class MyClass {
	static int Static = assignValue(); 	// Example of a Static Variable
	int nonStatic;						// Example of an Instance Variable
	
	public MyClass(int parameter) {		// Example of a Parameter
		this.nonStatic = parameter;
	}
	
	static int assignValue() {
		return 30;
	}
	
	public static void main(String[] args) {
		methodOne();		
		methodTwo();
	}
	
	public static void methodOne() {
		MyClass objectOne = new MyClass(10);
		MyClass objectTwo = new MyClass(20);
		System.out.println("Object One: \tStatic: " + objectOne.Static + "\tNon Static: " + objectOne.nonStatic);
		System.out.println("Object Two: \tStatic: " + objectTwo.Static + "\tNon Static: " + objectTwo.nonStatic);
	}
	
	public static void methodTwo() {		
		int localVariable = 42;			// Example of a Local Variable
		System.out.println("Local Variable: " + localVariable);
	}
}