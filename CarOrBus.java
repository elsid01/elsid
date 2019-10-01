package logicalthinking;
import java.util.Scanner;
public class CarOrBus {

	public static void main(String[] args) {
		
		Scanner type = new Scanner(System.in);
		
		int people, cars, buses;
		System.out.println("Enter the number of people, cars, and buses available in that order :");
		
		people = type.nextInt();
		cars = type.nextInt();
		buses = type.nextInt();
		
		if(cars > people)
			System.out.println(" We should take the cars .");
		else if (cars<people)
            System.out.println(" We should not take the cars");
		else 
			System.out.println(" We can't decide.");
		
		if(buses>cars)
			System.out.println(" That's too many buses.");
		else if ( buses<cars)
			System.out.println(" Maybe we should take the buses.");
		else 
			System.out.println(" We still can't decide.");
		
		if(people>buses)
			System.out.println(" Alright, let's just take the buses.");
		else
			System.out.println(" Let's just take a car.");
	}

}
