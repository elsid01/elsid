package logicalthinking;

import java.util.Scanner;


public class LegalProblem {

	public static void main(String[] args) {
		Scanner type = new Scanner(System.in);
		
		String name;
		int age ;
		System.out.println(" What is your name ?");
		
		name = type.next();
		
		System.out.println(" Ok, " + name + " how old are you ?");
		
		age = type.nextInt();
		
		if(age<16)
		{
			System.out.println("You can't drive " + name);
		}
		 if (age>16 || age<=18)
		 {
			 System.out.println("you can't vote, " + name);
			 
		 }
		  if ( age>18 || age<=25) {
			  System.out.println(" you can't rent a car , " + name);
		  }
		 if ( age>=25) {
			 System.out.println(" You can do anything that's legal");
		 }
	}

}
