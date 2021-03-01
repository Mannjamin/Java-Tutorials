package edu.brunel.cs2004.java.tutorial.seven.mypackage;

import java.util.Arrays;
import java.util.Random;

public class MyClass {
	public static void main(String[] args) {
		charAtExample("Hello", 4);
		codePointAtExample("Hello", 0);
		codePointBeforeExample("Hello", 1);
		codePointCountExample("Hello", 0, 5);
		compareToExample("Hello", "Hello");
		compareToIgnoreCaseExample("Hello", "Hello");
		equalsExample("Hello", "Hello");
		concatExample("Hello", "World");
		containsExample("Hello", "H");
		contentEqualsExample("Hello", "H");
		char[] charArr = { 'H', 'e', 'l', 'l', 'o' };
		copyValueOfExample(charArr, 0, 5);
		endsWithExample("Hello", "llo");
		formatExamples();
		getBytesExample("Hello World");
		getCharsExample("Hello World");
		hashCodeExample("Hello World");
		indexOfExample("Hello World", "World");
		internExample("Hello World");
		isEmptyExample("Hello World");
		lastIndexOfExample("Hello World, what a wonderful World", "World");
		lengthExample("Hello World");
		matchesExample("HelloWorld", "Hello(.*)");
		offsetByCodePointsExample("Hello", 0, 4);
		regionMatchesExample("Hello, How are you", "How", false, 7, 0, 3);
		replaceExample("Hello", 'H', 'J');
		replaceFirstExample("Hello", "l", "m");
		replaceAllExample("Hello World", "l", "c");
		splitExample("Hello World", " ");
		startsWithExample("Hello World", "He");
		subSequenceExample("Hello World, How are you today?", 6, 20);
		substringExample("Hello World, How are you today?", 6, 20);
		toCharArrayExample("Hello World");
		toLowerCaseExample("HELLO WORLD");
		toUpperCaseExample("hello world");
		toStringExample("Hello World");
		trimExample("                                                        Hello World                                                   ");
		valueOfExample(827464903);
	}

	public static void charAtExample(String inputString, int index) {
		// Return result if String is not Empty
		// and index is smaller than the length of input String
		// Arrays start at 0, so if Hello is a length of 5
		// The final value's index is 4
		if (!inputString.isEmpty() && index < inputString.length()) {
			char result = inputString.charAt(index);
			System.out.println(result);
		}
	}

	public static void codePointAtExample(String inputString, int index) {
		if (!inputString.isEmpty() && index < inputString.length()) {
			int result = inputString.codePointAt(index);
			System.out.println(result);
		}
	}

	public static void codePointBeforeExample(String inputString, int index) {
		// Added 'index > 0' to ensure index is greater than 0
		if (!inputString.isEmpty() && index > 0 && index < inputString.length()) {
			int result = inputString.codePointBefore(index);
			System.out.println(result);
		}
	}

	public static void codePointCountExample(String inputString, int startIndex, int endIndex) {
		// Ensure string is not empty, start is greater or equal to 0, end is less than
		// or equal to lenght of input string
		if (!inputString.isEmpty() && startIndex >= 0 && endIndex <= inputString.length()) {
			int result = inputString.codePointCount(startIndex, endIndex);
			System.out.println(result);
		}
	}

	public static void compareToExample(String inputA, String inputB) {
		if (!inputA.isEmpty() && !inputB.isEmpty()) {
			System.out.println(inputA.compareTo(inputB));
		}
	}

	public static void compareToIgnoreCaseExample(String inputA, String inputB) {
		if (!inputA.isEmpty() && !inputB.isEmpty()) {
			System.out.println(inputA.compareToIgnoreCase(inputB));
		}
	}

	public static void equalsExample(String inputA, String inputB) {
		if (!inputA.isEmpty() && !inputB.isEmpty()) {
			System.out.println(inputA.equals(inputB));
		}
	}

	public static void concatExample(String inputA, String inputB) {
		if (!inputA.isEmpty() && !inputB.isEmpty()) {
			System.out.println(inputA.concat(inputB));
		}
	}

	public static void containsExample(String inputString, String characterSequence) {
		if (!inputString.isEmpty() && !characterSequence.isEmpty()) {
			System.out.println(inputString.contains(characterSequence));
		}
	}

	public static void contentEqualsExample(String inputString, String characterSequence) {
		if (!inputString.isEmpty() && !characterSequence.isEmpty()) {
			System.out.println(inputString.contentEquals(characterSequence));
		}
	}

	public static void copyValueOfExample(char[] charArr, int startIndex, int endIndex) {
		if (charArr != null && charArr.length != 0 && startIndex >= 0 && endIndex <= charArr.length) {
			String result = String.copyValueOf(charArr, startIndex, endIndex);
			System.out.println(result);
		}
	}

	public static void endsWithExample(String inputA, String inputB) {
		if (!inputA.isEmpty() && !inputB.isEmpty()) {
			System.out.println(inputA.endsWith(inputB));
		}
	}

	public static void formatExamples() {
		String str1 = String.format("%d", 101); // Integer value
		System.out.println(str1);

		String str2 = String.format("%s", "Hello World"); // String value
		System.out.println(str2);
		
		String str3 = String.format("%f", 101.00); // Float value
		System.out.println(str3);
		
		String str4 = String.format("%x", 101); // Hexadecimal value
		System.out.println(str4);
		
		String str5 = String.format("%c", 'c'); // Char value
		System.out.println(str5);
		
		// Here is a convenient table of the different format specifiers supported by the Java String Class
		/**
		 * Format Specifier 	Data Type 														Output
			%a 					floating point (except BigDecimal) 								Returns Hex output of floating point number.
			%b 					Any type 														"true" if non-null, "false" if null
			%c 					character 														Unicode character
			%d 					integer (incl. byte, short, int, long, bigint) 					Decimal Integer
			%e 					floating point 													decimal number in scientific notation
			%f 					floating point 													decimal number
			%g 					floating point 													decimal number, possibly in scientific notation
			 																						depending on the precision and value.
			%h 					any type 														Hex String of value from hashCode() method.
			%n 					none 															Platform-specific line separator.
			%o 					integer (incl. byte, short, int, long, bigint) 					Octal number
			%s 					any type 														String value
			%t 					Date/Time (incl. long, Calendar, Date and TemporalAccessor) 	%t is the prefix for Date/Time conversions. 
																									More formatting flags are needed after this. 
																									See Date/Time conversion below.
			%x 					integer (incl. byte, short, int, long, bigint) 					Hex string.
		 */
	}
	
	public static void getBytesExample(String input) {
		if (!input.isEmpty()) {
			System.out.println(Arrays.toString(input.getBytes()));
		}
	}
	
	public static void getCharsExample(String input) {
		if (!input.isEmpty()) {
			char[] array = new char[input.length()];
			input.getChars(0, input.length(), array, 0);
			System.out.println(Arrays.toString(array));
		}
	}
	
	
	/**
	 * THIS IS THE HASH CODE METHOD: 
	   	public int hashCode() {
       		int h = hash;
       		if (h == 0) {
           		int off = offset;
           		char val[] = value;
           		int len = count;
           		for (int i = 0; i < len; i++) {
               		h = 31*h + val[off++];
           		}
           		hash = h;
       		}
       		return h;
   		}
	 */
	// s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
	public static void hashCodeExample(String input) {
		if (!input.isEmpty()) {
			System.out.println(input.hashCode());
		}
	}
	
	public static void indexOfExample(String inputA, String inputB) {
		if (!inputA.isEmpty() && !inputB.isEmpty()) {
			System.out.println(inputA.indexOf(inputB));
		}
	}
	
	public static void internExample(String inputA) {
		if (!inputA.isEmpty()) {
			String exampleA = inputA;
			String exampleB = new String(inputA);
			String exampleC = exampleB.intern(); // Gets interned string object
			
			System.out.println(exampleA == exampleB);
			System.out.println(exampleA == exampleC);
		}
	}
	
	public static void isEmptyExample(String input) {
		System.out.println(input.isEmpty());
	}
	
	public static void lastIndexOfExample(String inputA, String inputB) {
		if (!inputA.isEmpty() && !inputB.isEmpty()) {
			System.out.println(inputA.indexOf(inputB));
		}
	}
	
	public static void lengthExample(String input) {
		if (!input.isEmpty()) {
			System.out.println(input.length());
		}
	}
	
	public static void matchesExample(String inputA, String inputB) {
		if (!inputA.isEmpty() && !inputB.isEmpty()) {
		    System.out.println(inputA.matches(inputB));
		}
	}
	
	public static void offsetByCodePointsExample(String inputString, int index, int codePointOffset) {	
		if (!inputString.isEmpty()) {	
				int offsetIndex = inputString.offsetByCodePoints(index, codePointOffset);
				System.out.println(offsetIndex);
		}
	}
	
	public static void regionMatchesExample(String inputA, String inputB, boolean ignoreCase, int inputAOffset, int inputBOffset, int compareLength ) {
		if (!inputA.isEmpty() && !inputB.isEmpty()) {   
			System.out.println(inputA.regionMatches(ignoreCase, inputAOffset, inputB, inputBOffset, compareLength));
		}
	}
	
	public static void replaceExample(String stringInput, char charA, char charB) {
		if (!stringInput.isEmpty()) {
			System.out.println(stringInput.replace(charA, charB));
		}
	}
	
	public static void replaceFirstExample(String stringA, String stringB, String stringC) {
		if (!stringA.isEmpty() && !stringB.isEmpty() && !stringC.isEmpty()) {
			System.out.println(stringA.replaceFirst(stringB, stringC));
		}
	}
	
	public static void replaceAllExample(String inputA, String inputB, String inputC) {
		if (!inputA.isEmpty()) {
			System.out.println(inputA.replaceAll(inputB, inputC));
		}
	}
	
	public static void splitExample(String inputA, String inputB) {
		if (!inputA.isEmpty() && !inputB.isEmpty()) {
			String[] array = inputA.split(inputB);
			System.out.println(Arrays.toString(array));
		}
	}
	
	public static void startsWithExample(String inputA, String inputB) {
		if (!inputA.isEmpty() && !inputB.isEmpty()) {
			System.out.println(inputA.startsWith(inputB));
		}
	}
	
	public static void subSequenceExample(String inputString, int startIndex, int endIndex) {
		if (!inputString.isEmpty() && startIndex >=0 && endIndex <= inputString.length()) {
			System.out.println(inputString.subSequence(startIndex, endIndex)); 
		}
	}
	
	public static void substringExample(String inputString, int startIndex, int endIndex) {
		if (!inputString.isEmpty() && startIndex >=0 && endIndex <= inputString.length()) {
			System.out.println(inputString.subSequence(startIndex, endIndex)); 
		}
	}
	
	public static void toCharArrayExample(String inputString) {
		if (!inputString.isEmpty()) {
			char[] charArray = inputString.toCharArray();
			System.out.println(Arrays.toString(charArray));
		}
	}
	
	public static void toLowerCaseExample(String inputString) {
		if (!inputString.isEmpty()) {
			System.out.println(inputString.toLowerCase());
		}
	}
	
	public static void toUpperCaseExample(String inputString) {
		if (!inputString.isEmpty()) {
			System.out.println(inputString.toUpperCase());
		}
	}
	
	public static void trimExample(String inputString) {
		if (!inputString.isEmpty()) {
			System.out.println(inputString.trim());
		}
	}
	
	public static void toStringExample(String inputString) {
		if (!inputString.isEmpty()) {
			String newString = new String(inputString);
			System.out.println(newString.toString());
		}
	}
	
	public static void valueOfExample(int input) {
		String intExample = String.valueOf(input);
		System.out.println(intExample);
	}
}