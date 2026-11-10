/*
 * Sum.java
 *
 * Copyright 2026 gastaldello12303 <gastaldello12303@INFO3-06>
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
 * Reads two integers from the keyboard and prints their sum.
 *
 * <p>First exercise on keyboard input: it shows how to create a
 * {@link Scanner}, read a line of text and convert it into an
 * {@code int} with {@link Integer#parseInt(String)}.</p>
 *
 * @author gastaldello12303
 * @version 22-09-2026
 */
public class Sum {

	/**
	 * Entry point of the program.
	 *
	 * <p>Asks the user for two whole numbers, adds them together and
	 * prints the result on the screen.</p>
	 *
	 * @param args command-line arguments (not used)
	 */
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in); // create the "in" object to read input from the keyboard

		int a; int b; int sum;

		// read the two addends
		System.out.println("Enter the first addend: ");
		a = Integer.parseInt(in.nextLine());

		System.out.println("Enter the second addend: ");
		b = Integer.parseInt(in.nextLine());

		// compute and print the sum
		sum = a + b;
		System.out.println("The sum is " + sum);
	}
}
