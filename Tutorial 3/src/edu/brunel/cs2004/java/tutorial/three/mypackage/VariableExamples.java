package edu.brunel.cs2004.java.tutorial.three.mypackage;

public class VariableExamples {
	public static void main(String[] args) {
//		integralVariables();
//		floatingPointVariables();
//		characterVariables();
//		castingVariables();
		modifyingVariables();
		conditionalVariables();
	}

	private static void integralVariables() {
		System.out.println("Integral Variables:\n");
		
		byte bite = 8;					
		System.out.println(bite);
		
		short shorts = 12;
		System.out.println(shorts);
		
		int integer = 420;
		System.out.println(integer);
		
		// If I forgot to mention it, the 'L' is needed to tell the compiler it's a LONG otherwise it thinks it's an integer.
		long longman = 2147483649L;		
		System.out.println(longman);
		
		newSection();
	}

	private static void floatingPointVariables() {
		System.out.println("Floating Point Variables:\n");
		
		// we use 'f' to tell the compiler this is a float.
		final float pi = 3.141592f; 	
		System.out.println(pi);
		
		double trouble = 68.9;
		System.out.println(trouble);
		
		newSection();
	}

	private static void characterVariables() {
		System.out.println("Character Variables:\n");
		
		// Strings use "" (Double Quotes), Characters use '' (Single Quotes)
		String stringA = "Hello ";
		String stringB = "World!";
		String stringC = stringA + stringB;		// Strings A and B are concatenated to form String C
		System.out.println(stringC);
		
		char aChar = 'a';
		System.out.println(aChar);
		
		// Fun Experiment - Run this code, and see what happens
		System.out.println("H"+"A"); 
		System.out.println('H'+'a'); 
		
		newSection();
	}

	private static void castingVariables() {
		System.out.println("Casting Variables:\n");
		
		// This is an example of Widening Casting
		int suspiciousDouble = 30;							// Smaller Value
		double notSoSuspiciousDouble = suspiciousDouble;	// Larger Value (Automatic Casting of integer to double)
		System.out.println(notSoSuspiciousDouble);			// No suspicion what so ever...
		
		// This is an example of Narrowing Casting
		double suspiciousInteger = 28.4;						// Larger Value
		int notSoSuspiciousInteger = (int) suspiciousInteger;	// Smaller Value (Manual Casting of double to integer)
		System.out.println(notSoSuspiciousInteger);				// No suspicion what so ever...
		
		newSection();
	}

	private static void modifyingVariables() {
		System.out.println("Modifying Variables:\n");
		
		final int intA = 5;
		final int intB = 8;
		
		int addition = intA + intB;
		System.out.println(addition);
		
		int subtraction = intB - intA;
		System.out.println(subtraction);
		
		int multiplication = intA * intB;
		System.out.println(multiplication);
		
		int division = intB / intA;
		System.out.println(division);
		
		int modulo = intB % 2;
		if (modulo == 0) {
			System.out.println(modulo + " means " + intB + " is divisable by 2 with 0 remainder");
		}
	
		newSection();
	}

	private static void conditionalVariables() {
		System.out.println("Conditional Variables:\n");
		int intA = 5;
		int intB = 4;
		
		System.out.println(intA < intB);	// Less Than
		System.out.println(intA > intB);	// Greater Than
		System.out.println(intA == intB);	// Equal To
		System.out.println(intA <= intB);	// Less Than OR Equal To
		System.out.println(intA >= intB);   // Greater Than OR Equal To
		System.out.println(intA != intB);	// NOT Equal To
		
		newSection();
	}
	
	private static void newSection() {
		System.out.println("________________________________________________________");
	}
}
