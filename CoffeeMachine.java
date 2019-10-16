package com.adj01MiniProjectCoffeeMachine.stages;

import java.util.Scanner;

public class CoffeeMachine {
	static int waterSupply = 500;
	static final int CUPWATER = 100;
	static int choice=0;
	
	static Scanner sc;
	static int cups =0;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		mainMenu();
		sc.close();
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
			buy();
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
		System.out.println( "MY WATER MACHINE MENU  ");
		System.out.println( "1 Buy ");
		System.out.println( "2 Fill ");
		System.out.println( "3 Take ");
		System.out.println( "4 Remaining ");
		System.out.println( "5 Exit ");
	}  // PrintMenu
	
	
	private static void remaining() {
		System.out.println("WELCOME REMAINING");
	}

	private static void take() {
		System.out.println("WELCOME TAKE");
		
	}

	private static void fill() {
		System.out.println("WELCOME FILL");
		
	}

	private static void buy() {
		System.out.println("WELCOME BUY");
		do {
			System.out.println("Enter cups 1-10:");
			cups = sc.nextInt();
			if (cups<1 || cups >10) 
				System.out.println("ERROR: Invalid entry");
		} while (cups<1 || cups >10); // up to 10 cups
		System.out.println("you want " + cups + "cups!");
		System.out.println("here they are");
		
		if (isWater(cups)) {
			System.out.println("Prepring your cups..WAIT");
			updateSupply(cups);
		} else {
			System.out.println("ERROR: insuficcient water supply");
			System.out.println("Only have water for " + waterSupply/CUPWATER);
		}
		
		
	}

	private static void updateSupply(int pcups) {
		waterSupply = waterSupply - (pcups * CUPWATER );
		System.out.println("new water supply balance = " + waterSupply );
	}

	private static boolean isWater(int pcups) {
        int maxCups = waterSupply / CUPWATER; 
		if (maxCups < pcups) 
		    return false;
		else
		   return true;
	}


}
