package com.adj01MiniProjectCoffeeMachine.stages;

import java.util.Scanner;

public class MenuWithMethods {
	static Scanner sc;
	static int choice = 0;
	
	public static void main(String[] args) {
	    sc = new Scanner(System.in);
		mainMenu();
		sc.close();
		
   	} // main

	private static void secondMenu() {
		choice = 0;
		do {
			printSecondMenu();
			do {
				System.out.println( "ENTER YOUR CHOICE [1-3]: "); 
				choice = sc.nextInt();
				System.out.println((choice<1 || choice >3) ? "Invalid entry": "Valid Entry");
				// ask for choice input
			} while (choice < 1 || choice > 3) ; // while is invalid repeat the loop
			checkChoiceSecondMenu(choice);
		} while (choice !=3);
			
		
	}

	private static void checkChoiceSecondMenu(int choice) {
		switch (choice) {
		case 1:
			System.out.println("******WATER");
			break;
		case 2:
			System.out.println("******MILK");
			break;
		case 3:
			System.out.println("******EXIT");
			break;
		default: 
			System.out.println("*******************INVALID ENTRY******************* BE CAREFUL :(((");
		}	
	}

	private static void printSecondMenu() {
		System.out.println( "DRINKS MENU  ");
		System.out.println( "1 Water ");
		System.out.println( "2 Milk ");
		System.out.println( "3 Exit ");
	}

	private static void mainMenu() {
		choice = 0;
		do {
			printMenu();
			do {
				System.out.println( "ENTER YOUR CHOICE [1-5]: "); 
				choice = sc.nextInt();
				System.out.println((choice<1 || choice >5) ? "Invalid entry": "Valid Entry");
				// ask for choice input
			} while (choice < 1 || choice > 5) ; // while is invalid repeat the loop
			checkChoice(choice);
			
		} while (choice !=5);
		
	}

	private static void checkChoice(int choice) {
		switch (choice) {
		case 1:
			System.out.println("******BUY");
			secondMenu();
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
	}

	private static void printMenu() { 
		System.out.println( "COFFEE MACHINE MENU  ");
		System.out.println( "1 Buy ");
		System.out.println( "2 Fill ");
		System.out.println( "3 Take ");
		System.out.println( "4 Remaining ");
		System.out.println( "5 Exit ");
	}  // PrintMenu

}  // class
