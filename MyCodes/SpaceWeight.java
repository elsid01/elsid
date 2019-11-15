package logicalthinking;
import java.util.Scanner;
public class SpaceWeight {

	public static void main(String[] args) {

		Scanner type = new Scanner(System.in);

		double weight, weightOnPlanet, gravity;
		int x;

		System.out.println(" I have information for following plannets: \n1. Venus\r\n" + 
				"2. Mars\r\n" + 
				"3. Jupiter\r\n" + 
				"4. Saturn\r\n" + 
				"5. Uranus\r\n" + 
				"6. Neptune\r\n" + 
				" "  + "  Which planet are you visiting? ");
		x = type.nextInt();

		switch (x) {
		case 1:
			gravity = 0.78;
			break;
		case 2 :
			gravity = 0.39;
			break;

		case 3: 
			gravity = 2.65;
			break;
		case 4:
			gravity = 1.17;
			break;
		case 5:
			gravity = 1.05;
			break;
		case 6:
			gravity = 1.23;
			break;

		default :
			gravity = 0.00;


		}


		System.out.println(" What is your earth weight? ");
		weight = type.nextDouble();





		weightOnPlanet = weight*gravity;

		System.out.println(" Your weight would be " + weightOnPlanet + " pounds on that planet");

	}



}






