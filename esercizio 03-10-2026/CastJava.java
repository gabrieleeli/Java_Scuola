/*
 * CastJava.java
 *
 * Copyright 2026 gastaldello12303 <gastaldello12303@INF1-22>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 *
 *
 */
import java.util.Scanner;

/**
 * Exercise on casts, rounding and arithmetic expressions.
 *
 * <p>The program shows:</p>
 * <ul>
 *   <li>how {@link Math#round(double)} turns a {@code double} into a
 *       {@code long}, and how a cast is needed to store it in an
 *       {@code int};</li>
 *   <li>the difference between integer division and floating-point
 *       division;</li>
 *   <li>the use of {@link Math#pow(double, double)},
 *       {@link Math#sqrt(double)} and the constant {@link Math#PI}.</li>
 * </ul>
 *
 * @author gastaldello12303
 * @version 03-10-2026
 */
public class CastJava {

	/**
	 * Entry point of the program.
	 *
	 * <p>First rounds a decimal balance in different ways, then reads
	 * three integers x, y and z and evaluates several expressions with
	 * them, and finally computes an average twice to show the effect of
	 * integer division.</p>
	 *
	 * @param args command-line arguments (not used)
	 */
	public static void main (String[] args) {

		double balance = 67.67; // define the variable as a double (decimal number)
		System.out.println("Balance as a decimal number: " + balance);

		long round = Math.round(balance); // Math.round returns a long (an integer type bigger than int), so no cast is needed: the decimal part is rounded away
		System.out.println("Balance rounded (long): " + round);

		int rounded = (int) Math.round(balance); // int is smaller than long, so a cast is needed to force the value into an int
		System.out.println("Balance rounded (int): " + rounded);

		Scanner in = new Scanner(System.in);

		int x; int y; int z; double result;
		System.out.println("Enter X: ");
		x = Integer.parseInt(in.nextLine());

		System.out.println("Enter Y: ");
		y = Integer.parseInt(in.nextLine());

		System.out.println("Enter Z: ");
		z = Integer.parseInt(in.nextLine());

		result = (x + y) / 2; // integer division: the decimal part is lost BEFORE the value is stored in the double
		System.out.println("(x+y)/2: " + result);

		result = x * y / 2; // integer division as well
		System.out.println("x * y / 2: " + result);

		result = Math.pow(1 + x / 100, y); // x / 100 is an integer division (0 when x < 100)
		System.out.println("Math.pow(1 + x / 100, y): " + result);

		result = Math.sqrt(x * x + y * y); // length of the hypotenuse of a right triangle with legs x and y
		System.out.println("Math.sqrt(x * x + y * y): " + result);

		result = (x + y + z) / 3.0; // dividing by 3.0 (a double) gives a floating-point division
		System.out.println("(x + y + z)/3.0: " + result);

		result = Math.pow(1 + x / 100.0, y); // with 100.0 the division keeps the decimal part
		System.out.println("Math.pow(1 + x / 100.0, y): " + result);

		result = Math.PI; // the constant pi defined in the Math class
		System.out.println("Math.PI: " + result);


		int score1 = 10;
		int score2 = 4;
		int score3 = 9;
		double average = (score1 + score2 + score3) / 3; // WRONG average: integer division gives 7.0 instead of 7.666...
		System.out.println("Average score: " + average);


		double total = score1 + score2 + score3; // storing the total in a double first...
		double average2 = total / 3;              // ...makes the division a floating-point one
		System.out.println("Average score: " + average2);


	}
}
