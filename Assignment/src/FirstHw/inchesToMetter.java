package FirstHw;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;
public class inchesToMetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner type = new Scanner(System.in);
		double inches, metters;
		System.out.println("Enter a number in Inches to convert:");

		inches = type.nextDouble();

		metters = 0.0254*inches;

		System.out.printf( " %.2f inches is %.2f metters " , inches, metters);

	}

}
