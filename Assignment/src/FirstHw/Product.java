package FirstHw;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner type = new Scanner(System.in);
		
		int mult1, mult2, prod;
		
		System.out.println("Enter 2 numbers to multiply :");
		
		mult1 = type.nextInt();
		mult2 = type.nextInt();
		
		prod = mult1*mult2;
		
		System.out.println("The product of " + mult1 + " and " + mult2 + " is " + prod );
		
		

	}

}
