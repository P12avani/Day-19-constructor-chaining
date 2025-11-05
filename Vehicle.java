package com.codegnan.oopexamples;
import java.util.Scanner;
public class Vehicle {

	    String vehicleNo;
	    String brand;
	    double fuelConsumed;
	    double distanceTravelled;

	    // Default constructor
	    public Vehicle() {
	        this("Unknown", "Unknown", 0.0, 0.0);
	    }

	    // Parameterized constructor using constructor chaining
	    public Vehicle(String vehicleNo, String brand, double fuelConsumed, double distanceTravelled) {
	        this.vehicleNo = vehicleNo;
	        this.brand = brand;
	        this.fuelConsumed = fuelConsumed;
	        this.distanceTravelled = distanceTravelled;
	    }

	    // Method to calculate mileage
	    public double calculateMileage() {
	        if (this.fuelConsumed == 0) {
	            return 0.0; // Avoid division by zero
	        }
	        return this.distanceTravelled / this.fuelConsumed;
	    }

	    // Method to display vehicle details
	    public void displayDetails() {
	        double mileage = this.calculateMileage();
	        System.out.println("Vehicle Details:");
	        System.out.println("Vehicle No: " + this.vehicleNo);
	        System.out.println("Brand: " + this.brand);
	        System.out.println("Fuel Consumed: " + this.fuelConsumed);
	        System.out.println("Distance Travelled: " + this.distanceTravelled);
	        System.out.println("Mileage: " + mileage + " km/l");
	    }

	    // Main method
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        String vehicleNo = sc.next();
	        String brand = sc.next();
	        double fuelConsumed = sc.nextDouble();
	        double distanceTravelled = sc.nextDouble();

	        Vehicle v = new Vehicle(vehicleNo, brand, fuelConsumed, distanceTravelled);
	        v.displayDetails();
	    }
	}



