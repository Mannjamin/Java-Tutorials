package edu.brunel.cs2004.java.tutorial.six.mypackage;

public class Overload {
	public static void main(String[] args) {
		String name = "John";
		int age = 30;
		String job = "Accountant";
		
		person(name);
		person(name, age);
		person(name, age, job);
	}
	
	private static void person(String name) {
		System.out.println("This is " + name + ".\n");
	}
	
	private static void person(String name, int age) {
		System.out.println("This is " + name + ".");
		System.out.println(name + " is " + age + ".\n");
	}
	
	private static void person(String name, int age, String job) {
		System.out.println("This is " + name + ".");
		System.out.println(name + " is " + age + ".");
		System.out.println(name + ", " + age + ", works as an " + job + "\n");
	}
}
