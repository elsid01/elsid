package ndAssign;

import java.util.Scanner;

public class carPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner type = new Scanner(System.in);
		
		int cars, drivers, passengers, car_not_driven, cars_driven;
		double space_in_a_car, carpool_capacity, average_passenger_per_car;
		double average_miles_driven, average_miles_per_gallon, gas_cost_per_gallon, money_saved;
		double gas_cost_per_trip;
		
		cars = 100;
		space_in_a_car = 4.0;
		drivers = 30;
		passengers = 90;
		average_miles_driven = 29.0;
		average_miles_per_gallon = 23.6;
		gas_cost_per_gallon = 2.517;
		
		car_not_driven = cars - drivers;
		cars_driven = drivers;
		carpool_capacity = cars_driven*space_in_a_car;
		average_passenger_per_car = passengers/cars_driven;
		gas_cost_per_trip = (average_miles_driven*gas_cost_per_gallon)/average_miles_per_gallon;
		money_saved = (gas_cost_per_trip)*cars - gas_cost_per_trip*cars_driven;
		
		
		System.out.println(" There are " + cars + " cars available . ");
		System.out.println(" There are only " + drivers + " drivers available .");
		System.out.println(" That mean there will be " + car_not_driven + " empty cars today ! ");
		System.out.println(" We can transport " + carpool_capacity + " people today . ");
		System.out.println(" Out of that, we're transporting " + passengers + " today .");
		System.out.println(" So we'll need to put about " + average_passenger_per_car + "in each car . ");
		System.out.println(" long story short, today, we'll be saving about $ " + money_saved);
		
		
		
	System.out.println(Math.asin(95));
		

	}

}
