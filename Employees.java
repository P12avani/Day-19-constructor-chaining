package com.codegnan.oopexamples;
import java.util.Scanner;
public class Employees {
	    int empId;
	    String name;
	    double salary;
	    int experience;

	    // Default constructor
	    public Employees() {
	        this(0, "Unknown", 0.0, 0);
	    }

	    // Parameterized constructor with chaining
	    public Employees(int empId, String name, double salary, int experience) {
	        this.empId = empId;
	        this.name = name;
	        this.salary = salary;
	        this.experience = experience;
	    }

	    // Method to calculate bonus
	    public double calculateBonus() {
	        if (this.experience < 3) {
	            return this.salary * 0.05;
	        } else if (this.experience >= 3 && this.experience <= 7) {
	            return this.salary * 0.10;
	        } else {
	            return this.salary * 0.15;
	        }
	    }

	    // Method to display employee details
	    public void displayDetails() {
	        double bonus = this.calculateBonus();
	        System.out.println("Employee Details:");
	        System.out.println("ID: " + this.empId);
	        System.out.println("Name: " + this.name);
	        System.out.println("Salary: " + this.salary);
	        System.out.println("Experience: " + this.experience);
	        System.out.println("Bonus: " + bonus);
	    }

	    // Main method
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int empId = scanner.nextInt();
	        String name = scanner.next();
	        double salary = scanner.nextDouble();
	        int experience = scanner.nextInt();

	        Employees emp = new Employees(empId, name, salary, experience);
	        emp.displayDetails();
	    }
	}



