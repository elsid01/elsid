package logicalthinking;
import java.util.Scanner;

public class WhatIf {

	public static void main(String[] args) {
	Scanner type = new Scanner(System.in);
	
	//Declaring variable
	int people, cats, dogs;
	
	System.out.println(" Enter the number of people, cats, and dogs in that order :");
	
	// Assigning variable
	people =type.nextInt();
	cats = type.nextInt();
	dogs = type.nextInt();
	
	
	// Set the if statements
	if(cats >= people)
	{
		System.out.println("Too many cats ! The world is doomed :");
	}
	else
		System.out.println(" Too few cats! The world is save now  ");
		
	if (dogs<= people) {
		System.out.println(" The world is dry .");
		
	}
	
	else 
		System.out.println(" The world is drooled on!");
	

	}

}
