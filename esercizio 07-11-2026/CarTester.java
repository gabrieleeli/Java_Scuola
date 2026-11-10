import java.util.Scanner;

/**
 * Test program for the {@link Car} class.
 *
 * <p>Creates two cars, drives and refuels them, prints their range and
 * reserve status and compares their fuel consumption.</p>
 *
 * @author gastaldello12303
 * @version 07-11-2026
 */
public class CarTester {

	/**
	 * Entry point of the program.
	 *
	 * @param args command-line arguments (not used)
	 */
	public static void main (String[] args) {

		Scanner in = new Scanner (System.in);

		// first car: 20 km/l, 50 litre tank, 10 litres of fuel
		Car a = new Car("FIAT Panda", 20, 50, 10);

		System.out.println(a.toString());

		System.out.println("Range: " + a.getRange() + " km");
		System.out.println("On reserve? " + a.isOnReserve());
		System.out.println("Can it travel 150 km? " + a.canTravel(150));

		a.drive(100);
		System.out.println("After 100 km, litres in the tank: " + a.getLiters());

		a.refuel(15);
		System.out.println("After refuelling 15 l: " + a.getLiters());

		// second car: the name is typed by the user, the other values are fixed
		System.out.print("Name: ");
		String nameB = in.nextLine();

		System.out.print("Efficiency (km/l): ");
		double efficiencyB = 10;

		System.out.print("Capacity (l): ");
		double capacityB = 100;

		System.out.print("Litres in the tank (0 = empty): ");
		double litersB = 0.0;

		Car b = new Car(nameB, efficiencyB, capacityB, litersB);

		System.out.println(b.toString());

		System.out.println("Range: " + b.getRange() + " km");
		System.out.println("On reserve? " + b.isOnReserve());
		System.out.println("Can it travel 50 km? " + b.canTravel(50));

		b.refuel(30);
		System.out.println("After refuelling 30 l: " + b.getLiters());
		System.out.println("Range after refuelling: " + b.getRange() + " km");

		// compare the efficiency of the two cars
		System.out.println(a.getName() + " consumes less than " + b.getName() + "? " + a.consumesLess(b));

	}
}
