/**
 * package goes at the top of the file
 */
package edu.brunel.cs2004.java.tutorial.four.mypackage;

public class MyClass {

	public static void main(String[] args) {
		methodOne();
		methodTwo();
		methodThree();
		methodFour();
	}

	private static void methodOne() {
//		// Example of an If/Then Statement
//		boolean skyBlue = true;
//		if (skyBlue) {
//			System.out.println("The sky is blue!");
//		}
//
//		// Example of an If/Then/Else Statement
//		if (skyBlue) {
//			System.out.println("The sky is blue!");
//		} else {
//			System.out.println("The sky is not blue...");
//		}
//
//		// Example of a Switch Statement
//		int year = 2;
//		switch (year) {
//		case 1:
//			System.out.println("You are a 1st yr student");
//		case 2:
//			System.out.println("You are a 2nd yr student");
//		case 3:
//			System.out.println("You are a 3rd yr student");
//		default:
//			System.out.println("You are an Alumni or Lecturer");
//			break;
//		}
	}

	private static void methodTwo() {
//		// Example of Ternary Operators
//		String question = "AM I NOT SHOUTING?!";
//		String answer = question.equals("AM I SHOUTING?!") ? "Yes" : "No"; // Always TRUE then FALSE
//		System.out.println(question + " " + answer);
//
//		// Example of Ternary Operators
//		String bool = "true";
//		String result = bool.equals("true") ? "true" : "false"; // Always TRUE then FALSE
//		System.out.println("if bool = " + bool + " return " + result);
//
//		// Another example of Ternary Operators
//		int val1 = 10;
//		int val2 = 20;
//		int max = val1 >= val2 ? val1 : val2;
//		System.out.println("The max number is: " + max);
//
//		String input = null;
//		int value = input == null ? 0 : input.equals("") ? 0 : Integer.parseInt(input);
//		System.out.println(value);
	}

	private static void methodThree() {
//		// Example of a For Loop
//		System.out.print("For: ");
//		int forCount = 0;
//		for (forCount = 0; forCount < 10; forCount++) {	// Start at 0, until i is greater than 10, increase i by 1 every loop
//			System.out.print(forCount + ", ");
//		}
//		
//		// Example of Enhanced Loop
//		System.out.print("\nEnhanced Loop: ");
//		String[] synths = {"Korg", "Roland", "Moog", "Yamaha", "Novation",};
//		for (String synth : synths) {
//			System.out.print(synth + ", ");
//		}
//
//		// Example of a While Loop
//		System.out.print("\nWhile: ");
//		int whileCount = 9;
//		while (true) {
//			if (whileCount == 0) {
//				break;
//			}
//			System.out.print(whileCount + ", ");
//			whileCount--;
//		}
//
//		// Example of a Do Loop
//		System.out.print("\nDo: ");
//		int doCount = 0;
//		do {
//			System.out.print(doCount + ", ");
//			doCount++;
//		} while (doCount < 10);



//		nestedLoops();
	}

	private static void nestedLoops() {
		// Example of Nested Loop
		System.out.println();
		int[][] matrix = new int[10][10];
		for (int x = 0; x < 10; x++) {
			for (int y = 0; y < 10; y++) {
				if (x == y) {
					matrix[x][y] = 1;
					matrix[y][x] = 1;
				} 
				else if (x==0 || x == 9 || y==0 || y==9) {
					matrix[x][y] = 2;
					matrix[y][x] = 2;
				}
			}
		}

		// Example of Nested Loop
		for (int x = 0; x < matrix.length; x++) {
			for (int y = 0; y < matrix[0].length; y++) {
				System.out.print(matrix[x][y] + ", ");
			}
			System.out.println();
		}

	}

	private static void methodFour() {
		// Example of Breaking
//		for (int i = 0; i < 10; i++) {
//			if (i == 3) {
//				System.out.println("Breaking the for loop.");
//				break; // Example of a Branching Statement
//			}
//			System.out.println("i: " + i);
//		}

		// Example of Continue
//		for (int i = 0; i < 10; i++) {
//			if (i == 3) {
//				System.out.println("You Reached 3!!!");
//				continue;	// Example of a Branching Statement
//			} else {
//				System.out.println("i: " + i);
//			}
//		}

		// Example of return
//		System.out.println("Returned Value: " + returnValue());

		// Example of label
		labelExample();
	}

//	private static int returnValue() {
//		int i;
//		for (i = 0; i < 10; i++) {
//			if (i == 3) {
//				System.out.println("You Reached 3!!!");
//				return i;	// Example of a Branching Statement
//			}
//			System.out.println("i: " + i);
//		}
//		return i;	// Example of a Branching Statement
//	}

	private static void labelExample() {
		int[][] nums = { { 1, 3, 7, 5 }, { 5, 8, 4, 6 }, { 7, 4, 2, 9 } };
		int search = 6;
		int i, j = 0;
		START:	// Example of a label
		for (i = 0; i < nums.length; i++) {
			for (j = 0; j < nums[i].length; j++) {
				if (nums[i][j] == search) {
					System.out.println("Found " + search + " at position " + i + "," + j);
					break START; // Return to start!
				}
			}
		}
		System.out.println("Loop Ended at " + i + ", " + j);
	}

}