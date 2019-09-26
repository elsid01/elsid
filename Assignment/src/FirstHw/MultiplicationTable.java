package FirstHw;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner type = new Scanner(System.in);
		
		int multiplicant, multiplier = 1;
		
		System.out.println("Enter a number :");
		
		multiplicant = type.nextInt();
		
		while (multiplier<=10) {
			System.out.println(multiplicant + " x " + multiplier + " = " + multiplicant*multiplier);
			
			multiplier++;
			
		}
		

	}

}
