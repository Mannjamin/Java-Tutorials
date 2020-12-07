package edu.brunel.cs2004.java.tutorial.two.mypackage;

public class Car {

    public String brand = null;
    public String model = null;
    public String color = null;

    public Car() {
    }
    
    public Car(String theBrand, String theModel, String theColor) {
        this.brand = theBrand;
        this.model = theModel;
        this.color = theColor;
    }
    
    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }
    
    public String getBrand() {
    	return this.brand;
    }
    
    public void setModel(String newModel) {
        this.model = newModel;
    }
    
    public String getModel() {
    	return this.model;
    }
    
    public void setColor(String newColor) {
        this.color = newColor;
    }
    
    public String getColor() {
    	return this.color;
    }
    
    public void getDetails() {
    	System.out.println("This car is a " + this.brand + " " + this.model + " with a " + this.color + " paint job!");
    }

}