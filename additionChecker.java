package secondslide;

import java.util.Scanner;

public class additionChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner type = new Scanner(System.in);
		
		//declare variables
		
		int number1 , number2, total, answer;
		
		System.out.println(" I have two numbers to add : ");
		
		number1 = type.nextInt();
		number2 = type.nextInt();
		
		
		
		total = number1 + number2;
		
		System.out.println(" What is " + number1 + "+" + number2 + "?");
		
		answer = type.nextInt();
		
		if (total == answer) {
			
			System.out.println(" Great job !");
		}
		
		else {
			System.out.println("Fals");
		}
		

	}

}
