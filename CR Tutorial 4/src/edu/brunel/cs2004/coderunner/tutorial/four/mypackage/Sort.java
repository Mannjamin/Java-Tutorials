package edu.brunel.cs2004.coderunner.tutorial.four.mypackage;

import java.util.ArrayList;

public class Sort {
	public static void main(String[] args) {
		// Unsorted ArrayList
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(20);
		arr.add(23);
		arr.add(67);
		arr.add(11);
		arr.add(6);
		arr.add(79);
		arr.add(1);
		arr.add(17);
		
//		arr = null;
		
		arr = sortArray(arr);
		
		System.out.println(arr);
	}
	
	public static ArrayList<Integer> sortArray(ArrayList<Integer> arr) {
		if (arr == null || arr.isEmpty()) {
			return null;
		} else {
			arr = quickSort(arr);
			return arr;
		}
	}

	public static ArrayList<Integer> quickSort (ArrayList<Integer> arr) {
		if (arr.isEmpty()) {
			return arr;
		}

		ArrayList<Integer> sorted;
		ArrayList<Integer> smaller = new ArrayList<Integer>();
		ArrayList<Integer> greater = new ArrayList<Integer>();

		Integer pivot = arr.get(0);
		int i;
		Integer j;

		for (i = 1; i < arr.size(); i++) {
			j = arr.get(i);
			if (j.compareTo(pivot) < 0) {
				smaller.add(j);
			} else {
				greater.add(j);
			}
		}

		smaller = quickSort(smaller);
		greater = quickSort(greater);
		smaller.add(pivot);
		smaller.addAll(greater);
		sorted = smaller;

		return sorted;
	}
}
