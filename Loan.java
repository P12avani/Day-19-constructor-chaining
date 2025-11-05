package com.codegnan.oopexamples;
import java.util.Scanner;
public class Loan {

	    int loanId;
	    String customerName;
	    double loanAmount;
	    String loanType;

	    // Default constructor
	    public Loan() {
	        this(0, "Unknown", 0.0, "Unknown");
	    }

	    // Parameterized constructor with constructor chaining
	    public Loan(int loanId, String customerName, double loanAmount, String loanType) {
	        this.loanId = loanId;
	        this.customerName = customerName;
	        this.loanAmount = loanAmount;
	        this.loanType = loanType;
	    }

	    // Method to calculate total payable amount
	    public double calculateTotalPayable() {
	        double interestRate;

	        if (this.loanType.equalsIgnoreCase("Home")) {
	            interestRate = 8.0;
	        } else if (this.loanType.equalsIgnoreCase("Car")) {
	            interestRate = 9.0;
	        } else if (this.loanType.equalsIgnoreCase("Personal")) {
	            interestRate = 11.0;
	        } else {
	            interestRate = 0.0; // Default case if invalid loan type
	        }

	        return this.loanAmount + (this.loanAmount * interestRate / 100);
	    }

	    // Method to display loan details
	    public void displayDetails() {
	        double totalPayable = this.calculateTotalPayable();

	        System.out.println("Loan Details:");
	        System.out.println("Loan ID: " + this.loanId);
	        System.out.println("Customer Name: " + this.customerName);
	        System.out.println("Loan Amount: " + this.loanAmount);
	        System.out.println("Loan Type: " + this.loanType);
	        System.out.println("Total Payable: " + totalPayable);
	    }

	    // Main method
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int loanId = sc.nextInt();
	        String customerName = sc.next();
	        double loanAmount = sc.nextDouble();
	        String loanType = sc.next();

	        Loan loan = new Loan(loanId, customerName, loanAmount, loanType);
	        loan.displayDetails();
	    }
	}



