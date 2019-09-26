package ndAssign;
import java.util.Scanner;
public class AskQuestion {

	public static void main(String[] args) {
		Scanner type = new Scanner(System.in);
		String name;
		int age;
		double wage;
		System.out.println("Hello! What is your name ? ");

		name = type.next();

		System.out.println("Hi " + name + " ! How old are you ? ");

		age = type.nextInt();

		System.out.println(" So you're " + age + " , eh! That's not old at all ! \n  How much do you make " + name + " ?" );

		wage = type.nextDouble();

		System.out.println(wage + " ! That's really good for your " + age + " !");

	}

}
