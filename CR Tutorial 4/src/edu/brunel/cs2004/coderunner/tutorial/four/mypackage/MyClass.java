package edu.brunel.cs2004.coderunner.tutorial.four.mypackage;

/**
 * @author Mann
 *
 */
public class MyClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		boolean a, b, c, d;
		a = !(3 > 2); // a is false
		System.out.println(a);
		
		b = !(2 > 3); // b is true
		System.out.println(b);
		
		c = a && b; // c is false
		System.out.println(c);
		
		d = b || a; // d is true
		System.out.println(d);
		
	}
	
}
