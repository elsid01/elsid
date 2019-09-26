 package com.adj0105Slide52.main;

import java.util.Scanner;

/*
 * Requirements:
 * Write a program that lets the user enter the amount 
 * in decimal representing dollars and cents and output a 
 * report listing the monetary equivalent in single dollars, 
 * quarters, dimes, nickels, and pennies. 
 * Your program should report maximum number of dollars, 
 * then the maximum number of quarters, and so on, in this order. 
 * 
 * OUTPUT:
 * report listing the monetary equivalent in single dollars, 
 * quarters, dimes, nickels, and pennies.
 * 
 * INPUT:
 * the amount in decimal representing dollars and cents
 * 
 * PROCESS:
 * Compute the monetary equivalent in single dollars, 
 * quarters, dimes, nickels, and pennies
 * based on the inputed amount 
 * 
 */

public class MonetaryUnits {

	public static void main(String[] args) {
//	solution 1:
//		1. input amount
//		2. compute singles
	//  3. Compute quaters
//		4. Compute dimes
//		5. Compute nickels
//		6. Compute pennies
//		7. Print singles
	//  8. Print quaters
//		9. Print dimes
//		10. Print nickels
//		11. Print pennies
		
		Scanner sc = new Scanner(System.in);
		double amount;
		System.out.println("Enter dollar amount = ");
		amount = sc.nextDouble();
		int singles;
		singles = (int) amount;
		double cents;
		cents = amount - singles;
		System.out.println("after singles, Cents = " + cents);
		int quaters;
		quaters = (int) (cents / 0.25);
		cents = cents - (quaters * 0.25);
		System.out.println("after quaters, Cents = " + cents);

		int dimes;
		dimes = (int) (cents / 0.10);
		cents = cents - (dimes * 0.10);
		System.out.println("after dimes, Cents = " + cents);

		int nickels;
		nickels = (int) (cents / 0.05);
		cents = cents - (nickels * 0.05);
		System.out.println("after nickels, Cents = " + cents);
		
		double pennies;
//		pennies = (int)(cents*100);
		pennies = Math.round(cents*100);
		
		System.out.printf("Singles %d \n", singles);
		System.out.printf("Quaters %d \n", quaters);		
		System.out.printf("dimes %d \n", dimes);		
		System.out.printf("nickels %d \n", nickels);		
		System.out.printf("pennies %f \n", pennies);		
		
	    sc.close();	
	}

}
