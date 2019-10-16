 package com.adj01MiniProjectCoffeeMachine.stages;

import java.util.Scanner;

public class CoffeeMachineStageOne {

	public static void main(String[] args) {
		
		// COFFEE MACHINE MENU
		// 1 Buy
		// 2 Fill
		// 3 Take
		// 4 Remaining
		// 5 Exit
		// ENTER YOUR CHOICE [1-5]: 
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		do {
			System.out.println( "COFFEE MACHINE MENU  ");
			System.out.println( "1 Buy ");
			System.out.println( "2 Fill ");
			System.out.println( "3 Take ");
			System.out.println( "4 Remaining ");
			System.out.println( "5 Exit ");
			do {
				System.out.println( "ENTER YOUR CHOICE [1-5]: "); 
				choice = sc.nextInt();
				System.out.println((choice<1 || choice >5) ? "Invalid entry": "Valid Entry");
					
			} while (choice < 1 || choice > 5);
			
			switch (choice) {
				case 1:
					System.out.println("******BUY");
					break;
				case 2:
					System.out.println("******FILL");
					break;
				case 3:
					System.out.println("******TAKE");
					break;
				case 4:
					System.out.println("******REAMINING");
					break;
				case 5:
					System.out.println("******EXIT");
					break;
				default: 
						System.out.println("*******************INVALID ENTRY******************* BE CAREFUL :(((");
			}
		} while (choice != 5);
		
	}

}

//
//
//System.out.println("BUY");
//break;
//case 2:
//System.out.println("FILL");
//break;
//case 3:
//System.out.println("TAKE");
//break;
//case 4:
//System.out.println("REAMINING");
//break;
//case 5:
//System.out.println("EXIT");
//break;
