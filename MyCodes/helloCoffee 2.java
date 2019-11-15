/*
 * Name: Ely Mbaye
 * Date: 10/13/2019
 * Teacher: Marcial Cordon
 *                        
 *                        
 *                        Description:
 *                 This program is called the coffee Machine
 *                 It displays a default set of ingredients( water, milk, coffee, beans, and cups).
 *                 The machine ask the user to choose an option.
 *                 These options allows him to buy a coffee, check the machine's stock, and refill it.
 *                 
 **/





package byPeaces;
import java.util.Scanner;
public class helloCoffee {

	/*
	 * Instance variable of the class
	 */
	public static int fillWater, fillMilk, fillBeans, fillCups;
	public static int water=400 , milk=540 , beans=120 , cups=9 ,  money=550;
	public static int x=0;

	//Creating a Scanner object
	Scanner type = new Scanner(System.in);

	/*
	 * Refill method
	 */
	public static void FillUpTheMachine() {
		//Scanner object
		Scanner type = new Scanner(System.in);

		//Ask user to prompt values to restock the machine
		System.out.println("Write how many ml of water do you want to add: ");
		fillWater= type.nextInt();

		System.out.println("Write how many ml of milk do you want to add: ");
		fillMilk = type.nextInt();

		System.out.println("Write how many grams of coffee beans do you want to add: ");
		fillBeans = type.nextInt();

		System.out.println("Write how many disposable cups of coffee do you want to add: ");
		fillCups = type.nextInt();

		//Update the remaining components
		water+=fillWater;
		milk+=fillMilk;
		beans+=fillBeans;
		cups+=fillCups;

	}


	/*
	 * Available resources method
	 */

	public static void RemainingResources() {
		//Displaying the remaining components
		System.out.println("The coffee machine has:\n " + water + " of water\n " + milk + " of milk\n " + beans
				+ " of coffee beans\n " + cups + " of disponible cups\n " + "$" + money + " of money\n");
	};

	/*
	 * Action method
	 */
	public static void Action() {
		//Scanner object
		Scanner type = new Scanner(System.in);

		//Output to ask for action
		System.out.println("write action (buy, fill, take, remaining, exit): ");

		//Array for action choices
		String[] action = {"buy", "fill", "take", "remaining", "exit"};
		//Prompt a choice
		action[0] = type.next();

		//Switch case for the different choice cases
		switch(action[0]) {

		case "buy":
			//Calling ChoseWhatToBuy(); method
			ChoseWhatToBuy();
			break;
		case "fill":
			//Calling FillUpTheMachine(); method
			FillUpTheMachine();
			break;
		case "take":
			System.out.println("Take your money! ");
			//Initialize money to 0 after money is retrieved
			money=0;
			break;
		case "remaining":
			//Calling RemainingResources(); method
			RemainingResources();
			break;
		case "exit":
			//Assign x to -1 to break out of the while loop
			x=-1;
			break;
		default :



		}

	}

	/*
	 * Choose what to buy method
	 */
	public static void ChoseWhatToBuy() {
		Scanner type = new Scanner(System.in);
		//Print choices for the user
		System.out.println("What do you want to buy?\n 1.espresso\n 2.latte\n 3.cappuccino\n back- to main menu: ");

		//Declare choice  and prompt variable
		int choice = type.nextInt();

		/*
		 * If statement for possible options
		 */
		if(choice==1) {

			//Nested if statement for espresso
			if(water<250 ) {
				System.out.println("Sorry not enough water!");}
			else if(beans<16 ) {
				System.out.println("Sorry not enough coffee beans!");}
			else if(cups<1 ) {
				System.out.println("Sorry not enough disposable cups!");}
			else {
				System.out.println("I have enough resources, making you a coffe!");}
			//Update stock values
			water=water-250;
			beans=beans-16;
			cups=cups-1;
			money=money+4;

		}
		if(choice==2) {

			//Nested if statement for latte
			if(water<350 ) {
				System.out.println("Sorry not enough water!");}
			else if(milk<75) {
				System.out.println("Sorry not enough coffee beans!");}
			else if(beans<20 ) {
				System.out.println("Sorry not enough coffee beans!");}
			else if(cups<1 ) {
				System.out.println("Sorry not enough disposable cups!");}
			else {
				System.out.println("I have enough resources, making you a coffe!");}
			//Update stock values
			water=water-350;
			milk=milk-75;
			beans=beans-20;
			cups=cups-1;
			money=money+7;

		}
		if(choice==3) {

			//Nested if statement for cappuccino
			if(water<200 ) {
				System.out.println("Sorry not enough water!");}
			else if(milk<100) {
				System.out.println("Sorry not enough coffee beans!");}
			else if(beans<12 ) {
				System.out.println("Sorry not enough coffee beans!");}
			else if(cups<1 ) {
				System.out.println("Sorry not enough disposable cups!");}
			else {
				System.out.println("I have enough resources, making you a coffe!");}
			//Update stock value
			water=water-200;
			milk=milk-100;
			beans=beans-12;
			cups=cups-1;
			money=money+6;

		}

	}



	/*
	 * Main method
	 */

	public static void main(String[] args) {
		//Creating a scanner object
		Scanner type = new Scanner(System.in);

		//While loop to keep the program running until -1 is entered

		while(x !=-1) {
			//calling the Action(); method
			Action();
		}
		//exit statement
		System.out.println("Process finish with exit code 0 ");


		//ChoseWhatToBuy();
		//RemainingResources();



	}


}


