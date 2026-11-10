/*
 * RectangleExerciseP78.java
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

import java.awt.Rectangle;
import java.util.Scanner;

/**
 * Computes the area and the perimeter of a rectangle (textbook exercise,
 * page 78).
 *
 * <p>The program uses the library class {@link java.awt.Rectangle}:
 * it builds a rectangle from the position and size typed by the user and
 * then reads its width and height through the getter methods.</p>
 *
 * @author gastaldello12303
 * @version 29-09-2026
 */
public class RectangleExerciseP78 {

	/**
	 * Entry point of the program.
	 *
	 * <p>Reads the position (x, y), the height and the width of a
	 * rectangle, then prints its size, its area and its perimeter.</p>
	 *
	 * @param args command-line arguments (not used)
	 */
	public static void main (String[] args) {

		Scanner in = new Scanner(System.in);

		double area; double perimeter;
		int x; int y; int height; int width;

		// read position and size of the rectangle
		System.out.println("Enter the x position: ");
		x = Integer.parseInt(in.nextLine());
		System.out.println("Enter the y position: ");
		y = Integer.parseInt(in.nextLine());
		System.out.println("Enter the height of the rectangle: ");
		height = Integer.parseInt(in.nextLine());
		System.out.println("Enter the width of the rectangle: ");
		width = Integer.parseInt(in.nextLine());

		// the constructor of java.awt.Rectangle expects (x, y, width, height)
		Rectangle box = new Rectangle(x, y, width, height);

		System.out.println("The height of the rectangle is: " + box.getHeight());
		System.out.println("The width of the rectangle is: " + box.getWidth());

		// area = width * height
		area = (box.getWidth() * box.getHeight());
		System.out.println("The area of the rectangle is: " + area);

		// perimeter = 2 * (width + height)
		perimeter = (2 * (box.getWidth() + box.getHeight()));
		System.out.println("The perimeter of the rectangle is: " + perimeter);
	}
}
