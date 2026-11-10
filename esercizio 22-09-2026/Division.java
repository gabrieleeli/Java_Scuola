/*
 * Division.java
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
 * Reads two integers from the keyboard and prints their quotient.
 *
 * <p>The two numbers are stored in {@code double} variables, so the
 * division is a floating-point division and the decimal part of the
 * result is kept (for example {@code 7 / 2 = 3.5}).</p>
 *
 * @author gastaldello12303
 * @version 22-09-2026
 */
public class Division {

	/**
	 * Entry point of the program.
	 *
	 * <p>Asks the user for a dividend and a divisor, divides them and
	 * prints the quotient on the screen.</p>
	 *
	 * @param args command-line arguments (not used)
	 */
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in); // create the "in" object to read input from the keyboard

		double a; double b; double quotient;

		// read the two operands (whole numbers stored as doubles)
		System.out.println("Enter the dividend: ");
		a = Integer.parseInt(in.nextLine());

		System.out.println("Enter the divisor: ");
		b = Integer.parseInt(in.nextLine());

		// floating-point division: the decimal part is not lost
		quotient = a / b;
		System.out.println("The quotient is " + quotient);
	}
}
