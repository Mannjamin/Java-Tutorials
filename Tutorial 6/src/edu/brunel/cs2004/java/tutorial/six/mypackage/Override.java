package edu.brunel.cs2004.java.tutorial.six.mypackage;

class Vehicle {
	// Method Overridden
	String getSpeed() {
		return "20 mph";
	}
}

class Bike extends Vehicle {
	// Method Overrides
	String getSpeed() {
		return "60 mph";
	}
}

class Car extends Vehicle {
	// Method Overrides
	String getSpeed() {
		return "40 mph";
	}
}

public class Override {
	public static void main(String[] args) {
		// Method name of sub class and parent class must be the same
		Vehicle vehicle = new Vehicle();
		System.out.println("vehicle is going " + vehicle.getSpeed());
		
		// The argument must be the same in parent and child class
		Vehicle bike = new Bike();
		System.out.println("vehicle is going " + bike.getSpeed());
		
		Vehicle car = new Car();
		System.out.println("vehicle is going " + car.getSpeed());
	}
}

