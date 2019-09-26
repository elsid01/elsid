package ndAssign;

import java.util.Scanner;


public class dumpCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner type = new Scanner(System.in);
	
	int numb1, numb2, numb3, result;
	
	System.out.println("Please enter three numbers of your choice:");
	
	numb1= type.nextInt();
	numb2= type.nextInt();
	numb3= type.nextInt();

	result = (numb1 + numb2 + numb3)/2;
	
	System.out.println(" Your result is: " + result);
	}

}
