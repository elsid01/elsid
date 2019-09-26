package com.adj0105Slide52.main;

import java.util.Scanner;

/*
 * Requirements:
 * Write a program that lets the user 
 * enter the monthly interest rate, number of years, 
 * and loan amount, and computes monthly payment 
 * and total payment; print the monthly payment
 * and print the total payment
 * 
 */

public class LoanPayment {

	public static void main(String[] args) {
	
	/* solution 1:
	 * 1. Declare variables
	 * 2. Input monthly interest rate
	 * 3. Input number of years
	 * 4. Input loan amount
	 * 5. Compute monthly payment
	 * 6. Compute total payment
	 * 7. Print monthly payment
	 * 8. Print total payment
	 *  
	 */
	
//		 solution 1:
//		  1. Declare variables
		 double monthlyInterestRate;
		 int numberOfYears;
		 double loanAmount;
		 double monthlyPayment;
		 double totalPayment;
		 
//		  2. Input interest rate
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter Monthly Interest Rate: ");
		  monthlyInterestRate = sc.nextDouble();
		  
//		  3. Input number of years
		  System.out.println("Enter Number Of Years: ");
		  numberOfYears = sc.nextInt();
		  
//		  4. Input loan amount
		  System.out.println("Enter Loan Amount: ");
		  loanAmount = sc.nextDouble();
		  
//		  5. Compute monthly payment
		  monthlyPayment = (loanAmount*monthlyInterestRate) / 
				  (1-1/Math.pow(1+monthlyInterestRate,numberOfYears*12));
		  
//		  6. Compute total payment
		  totalPayment =  (monthlyPayment * 12) * numberOfYears;
//		  7. Print monthly payment
		  System.out.printf("Monthly payment = %.2f \n", monthlyPayment );	  
//		  8. Print total payment
		  System.out.printf("Total payment = %.2f \n", totalPayment );
		
		  sc.close();
		
		
	}

}
