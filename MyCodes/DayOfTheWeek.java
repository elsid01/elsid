package logicalthinking;
import java.util.Scanner;
public class DayOfTheWeek {

	public static void Day(int n) {
		
		
		if (n==1)
			System.out.println("The day of the week is Monday. ");
		if (n==2)
			System.out.println("The day of the week is Tuesday. ");
		if (n==3)
			System.out.println("The day of the week is Wednesday. ");
		if (n==4)
			System.out.println("The day of the week is Thusday. ");
		if (n==5)
			System.out.println("The day of the week is Friday. ");
		if (n==6)
			System.out.println("The day of the week is Saturday. ");
		if (n==7)
			System.out.println("The day of the week is Sunday. ");
	}
	public static void main(String[] args) {
		
		Scanner type = new Scanner(System.in);
		System.out.println(" Enter a number between 1 to 7: ");
		int day = type.nextInt();
		
		Day(day);
		
	}

}
