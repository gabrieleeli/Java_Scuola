/*
 * JavaPseudocode.java
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

/**
 * Translates a pseudocode algorithm into Java: swaps two characters of a
 * string.
 *
 * <p>The string is split with {@link String#substring(int, int)} into
 * five pieces: the part before position {@code i}, the character at
 * {@code i}, the part between {@code i} and {@code j}, the character at
 * {@code j} and the part after {@code j}. The pieces are then joined
 * again with the two characters exchanged.</p>
 *
 * @author gastaldello12303
 * @version 06-10-2026
 */
public class JavaPseudocode {

	/**
	 * Entry point of the program.
	 *
	 * <p>Swaps the characters at positions 3 and 6 of the string
	 * {@code "hello there"} and prints the string before and after the
	 * swap.</p>
	 *
	 * @param args command-line arguments (not used)
	 */
	public static void main (String[] args) {

		String str; int i; int j;
		str = "hello there";

		// positions of the two characters to swap
		i = 3;
		j = 6;

		String first = str.substring(0, i);        // characters before position i
		String charI = str.substring(i, i + 1);    // character at position i
		String middle = str.substring(i + 1, j);   // characters between i and j
		String charJ = str.substring(j, j + 1);    // character at position j
		String last = str.substring(j + 1);        // characters after position j

		// join the pieces again with the two characters exchanged
		String result = first + charJ + middle + charI + last;

		System.out.println("String before substring: " + str);
		System.out.println("String after substring: " + result);
	}
}
