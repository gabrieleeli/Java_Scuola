/*
 * RiverName.java
 *
 * Copyright 2026 gastaldello12303 <gastaldello12303@INF1-21>
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
 * Exercise on the {@link String} methods {@code length()} and
 * {@code replace()}.
 *
 * <p>The user types the name of the river "Mississippi"; the program
 * counts its characters and then replaces the substring
 * {@code "issipp"} with {@code "our"}, turning "Mississippi" into
 * "Missouri".</p>
 *
 * @author gastaldello12303
 * @version 29-09-2026
 */
public class RiverName {

	/**
	 * Entry point of the program.
	 *
	 * <p>Reads the river name, prints how many characters it has and
	 * prints the new name obtained with {@code replace()}.</p>
	 *
	 * @param args command-line arguments (not used)
	 */
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);

		// read the name of the river
		System.out.println("Write the name of the river Mississippi");
		String river = in.nextLine();

		// length() returns the number of characters of the string
		int characterCount = river.length();
		System.out.println("The river name is made of " + characterCount + " characters");

		// replace() returns a NEW string: strings are immutable,
		// so the result must be stored back into the variable
		river = river.replace("issipp", "our");

		System.out.println("Now the river is called: " + river);
	}
}
