
/*
 *Emily Blanford 
 *Lab 10
 *2/2/2018
 */

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
	public static void main(String[] args) {
		// Declare variables
		Scanner scan = new Scanner(System.in);
		int userOption = 0;
		String purchase = "n";
		int quit = -1;

		// Greeting
		System.out.println("Welcome to the Grand Circus Motors admin console!");

		// Create an array list with my inventory
		ArrayList<Car> carList = new ArrayList<Car>();
		carList.add(new Car("Ford", "Focus", 2009, 20000));
		carList.add(new Car("Ford", "Fiesta", 2015, 19500));
		carList.add(new Car("Ford", "EcoSport", 2018, 24500));
		carList.add(new UsedCars("Ford", "Taurus", 1999, 3000, 76000));
		carList.add(new UsedCars("Buick", "Park Avenue", 1992, 1500, 120000));
		carList.add(new UsedCars("Pontiac", "Vibe", 2010, 5000, 80000));
		
		//

		while (userOption != quit) {
			// set quit condition for comparison
			quit = carList.size() + 1;

			// Print inventory from array list
			System.out.println("\nCurrent Inventory: ");
			for (int i = 0; i < carList.size(); i++) {
				System.out.println((i + 1) + ". " + carList.get(i));
			}
			System.out.println((carList.size() + 1) + ". Quit");

			// Check what option the user would like from the list
			userOption = Validator.getInt(scan, "\nWhich car would you like? ", 1, carList.size() + 1);

			// If user does not choose to exit, output selected vehicle information and
			// option to purchase
			if (userOption <= carList.size()) {
				System.out.println(carList.get(userOption - 1));
				purchase = Validator.getString(scan, "Would you like to purchase this car? (y/n) ");

				// if purchased, remove from the array list
				if (purchase.equalsIgnoreCase("y")) {
					System.out.println("Excellent! Our finance department will be in touch shortly.");
					carList.remove(userOption - 1);
				}
			}

		}

		// End program
		System.out.println("Have a great day!");
		scan.close();
	}


}
