package ndAssign;

import java.util.Scanner;

public class allAboutMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner type = new Scanner(System.in);

		String myName, myEyes, myTeeth, myHair;
		int  myAge, myHeight;

		myName = "Ely Mbaye";
		myEyes= "Black";
		myTeeth = "White";
		myHair = "Black";
		myHeight = 175;
		myAge = 33;

		System.out.println(" Let's talk about " + myName + ". \n They're " + myHeight + " inches tall .\n "
				+ "They " + myAge + " years old .\n Huh, that's older that I expected....\n They have "
				+ myEyes + " eyes and " + myHair + " hair. \n Their teeth are usually " + myTeeth + 
				", but it depends on the coffee. \n  Alright , this is pretty  boring. lets' talk about " + myName + ".");


	}

}
