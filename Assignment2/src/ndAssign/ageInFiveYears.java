package ndAssign;

import java.util.Scanner;
public class ageInFiveYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner type = new Scanner(System.in);
		
		String name;
		int age, InFiveYears, FiveYearsAgo;
		
		System.out.println("Hi there! What's your name? ");
		
		name= type.next();
		
		System.out.println("Hi " + name + " ! My name is Ely."
				+ " Nice to meet you. How old are you? ");
		age= type.nextInt();
		
		InFiveYears= age+5;
		FiveYearsAgo= age-5;
		System.out.println(" Did you know that in five years you will be "
				+  InFiveYears + " years old.\n And five years ago you were "
				+ FiveYearsAgo + " ! Imagine that!");
		
		

	}

}
