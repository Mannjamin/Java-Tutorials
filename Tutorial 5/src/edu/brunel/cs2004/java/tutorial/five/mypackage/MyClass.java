package edu.brunel.cs2004.java.tutorial.five.mypackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MyClass {
	public static void main(String[] args) {
		initialiseArray();
		differentArrays();
		accessingElements();
		arrayDimensions();
		arraylistIntroduction();
		sortingArrayList();
		arraylistDimensions();
	}

	private static void initialiseArray() {
		// One way of initializing an array. Note that, we didn't specify a size,
		// because we already initialize our elements.
		int[] exampleOne = new int[] { 10, 20, 30, 40, 50, 60, 71, 80, 90, 91 };
		System.out.println("Example One Length: " + exampleOne.length); // .length() is a very useful command for seeing
																		// the size of an array.
		System.out.println("Example One: " + exampleOne); // Will not print array.
		System.out.println("Example One: " + Arrays.toString(exampleOne)); // Will print array.

		// Another way of initializing an array. Note that, we specify a size, because
		// we don't initialize with any elements.
		int[] exampleTwo = new int[5];
		exampleTwo[0] = 10;
		exampleTwo[1] = 20;
		exampleTwo[2] = 30;
		exampleTwo[3] = 40;
		exampleTwo[4] = 50;
		System.out.println("Example Two Length: " + exampleTwo.length); // .length() is a very useful command for seeing
																		// the size of an array.
		System.out.println("Example Two: " + exampleTwo); // Will not print array.
		System.out.println("Example Two: " + Arrays.toString(exampleTwo)); // Will print array.
	}
	

	private static void differentArrays() {
		// Primitive Data Types
		byte[] byteArray = new byte[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		System.out.println("Byte Array: " + Arrays.toString(byteArray));

		short[] shortArray = new short[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		System.out.println("Short Array: " + Arrays.toString(shortArray));

		int[] intArray = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		System.out.println("Int Array: " + Arrays.toString(intArray));

		long[] longArray = new long[] { 10l, 20l, 30l, 40l, 50l, 60l, 70l, 80l, 90l, 100l };
		System.out.println("Long Array: " + Arrays.toString(longArray));

		float[] floatArray = new float[] { 10f, 20f, 30f, 40f, 50f, 60f, 70f, 80f, 90f, 100f };
		System.out.println("Float Array: " + Arrays.toString(floatArray));

		double[] doubleArray = new double[] { 10.0, 20.0, 30.0, 40.0, 50.0, 60.0, 70.0, 80.0, 90.0, 100.0 };
		System.out.println("Double Array: " + Arrays.toString(doubleArray));

		boolean[] boolArray = new boolean[] { true, false, true, false, true, false, true, false, true, false };
		System.out.println("Boolean Array: " + Arrays.toString(boolArray));

		char[] charArray = new char[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		System.out.println("Char Array: " + Arrays.toString(charArray));

		// Non-Primitive Data Types
		String[] stringArray = new String[] { "This", "is", "a", "String", "Array!" };
		System.out.println("String Array: " + Arrays.toString(stringArray));
	}
	

	private static void accessingElements() {
		int[] intArray = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		System.out.println("Int Array: " + Arrays.toString(intArray));
		System.out.println("Get the 5th element! " + intArray[5]);
		System.out.println("Get the 5th element using a method? " + returnElement(intArray, 5));

		// Print array to console using a For Loop
		System.out.println("Get every element of an array using a For Loop!");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println("Index: " + i + " Value: " + intArray[i]);
		}
		
		// Change a Value
		System.out.println("Change 50 (Index 4) to 500!");
		intArray[4] = 500;
		System.out.println("Index 4: " + intArray[4]);
		
		// Get the length of an Array!
		System.out.println(intArray.length);
	}
	

	private static int returnElement(int[] array, int index) {
		return array[index];
	}

	private static void arrayDimensions() {
		System.out.println("One Dimensional Array:");
		int[] oneDimension = new int[] { 1, 0, 1, 0, 1, 0, 1, 0 };
		System.out.println("1D Array: " + Arrays.toString(oneDimension));

		System.out.println("Two Dimensional Array: ");
		int[][] twoDimensions = new int[][] { { 1, 0, 1, 0, 1, 0, 1, 0 }, { 0, 1, 0, 1, 0, 1, 0, 1 },
				{ 1, 0, 1, 0, 1, 0, 1, 0 }, { 0, 1, 0, 1, 0, 1, 0, 1 }, { 1, 0, 1, 0, 1, 0, 1, 0 },
				{ 0, 1, 0, 1, 0, 1, 0, 1 }, { 1, 0, 1, 0, 1, 0, 1, 0 }, { 0, 1, 0, 1, 0, 1, 0, 1 } };
		System.out.println("2D Array: " + Arrays.deepToString(twoDimensions)); // toString() does not work with more
																				// than 1 dimension, so use
																				// deepToString().

		System.out.println("Three Dimensional Array: ");
		int[][][] threeDimensions = new int[][][] { { { 1, 0 }, { 1, 0 }, { 1, 0 }, { 1, 0 } },
				{ { 0, 1 }, { 0, 1 }, { 0, 1 }, { 0, 1 } }, { { 1, 0 }, { 1, 0 }, { 1, 0 }, { 1, 0 } },
				{ { 0, 1 }, { 0, 1 }, { 0, 1 }, { 0, 1 } }, { { 1, 0 }, { 1, 0 }, { 1, 0 }, { 1, 0 } },
				{ { 0, 1 }, { 0, 1 }, { 0, 1 }, { 0, 1 } }, { { 1, 0 }, { 1, 0 }, { 1, 0 }, { 1, 0 } },
				{ { 0, 1 }, { 0, 1 }, { 0, 1 }, { 0, 1 } } };
		System.out.println("3D Array: " + Arrays.deepToString(threeDimensions)); // toString() does not work with more
																					// than 1 dimension, so use
																					// deepToString().
	}
	

	private static void arraylistIntroduction() {
		ArrayList<Integer> newArrayList = new ArrayList<Integer>();
		System.out.println("Add Elements to ArrayList");
		newArrayList.add(10);
		newArrayList.add(20);
		newArrayList.add(30);
		newArrayList.add(40);
		newArrayList.add(990);
		newArrayList.add(293474);

		System.out.println("ArrayList: " + newArrayList); // Note how you don't need to use a method like .toString()
															// with ArrayLists.

		System.out.println("Remove Element 5 from ArrayList");
		newArrayList.remove(5);
		System.out.println("ArrayList: " + newArrayList); // Note how you don't need to use a method like .toString()
															// with ArrayLists.

		System.out.println("Get Element 4: " + newArrayList.get(4)); // Remember that Arrays and ArrayLists start their
																		// index at 0.

		newArrayList.set(4, 50); // First value is the index, second value is the value you want to set the index
									// to.
		System.out.println("Set Element 4 to '50': " + newArrayList.get(4));

		System.out.println("ArrayList: " + newArrayList); // Note how you don't need to use a method like .toString()
															// with ArrayLists.
		System.out.println("The size of the ArrayList is? " + newArrayList.size());

		newArrayList.clear(); // Clear ArrayList
		System.out.println("Clear ArrayList: " + newArrayList);
		System.out.println("The size of the ArrayList is? " + newArrayList.size());
	}
	

	private static void sortingArrayList() {
		ArrayList<Integer> randomArray = new ArrayList<Integer>(10);
		for (int i = 0; i < 10; i++) {
			Integer r = (int) (Math.random() * (250 - 10 + 1) + 10);
			randomArray.add(r);
		}
		System.out.println("Random Array: " + randomArray);
		Collections.sort(randomArray);
		System.out.println("Sorted Array: " + randomArray);
	}

	private static void arraylistDimensions() {
		ArrayList<ArrayList<Integer>> twoDimensions = new ArrayList<ArrayList<Integer>>();
		System.out.println(twoDimensions);
		
		ArrayList<ArrayList<ArrayList<Integer>>> threeDimensions = new ArrayList<ArrayList<ArrayList<Integer>>>();
		System.out.println(threeDimensions);
		
		// Two Dimensional Random Int ArrayList
		for (int i = 0; i < 10; i++) {
			ArrayList<Integer> randomArrayList = new ArrayList<Integer>();
			for (int j = 0; j < 10; j++) {
				Integer r = (int) (Math.random() * (250 - 10 + 1) + 10);
				randomArrayList.add(r);
			}
			twoDimensions.add(randomArrayList);
		}

		// Print Two Dimensional ArrayList
		for (int x = 0; x < twoDimensions.size(); x++) {
			System.out.print("{ ");
			for (int y = 0; y < twoDimensions.get(x).size(); y++) {
				System.out.print(twoDimensions.get(x).get(y) + ", ");
			}
			System.out.print("}\n");
		}
	}

}
