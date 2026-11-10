import java.util.Scanner;

/**
 * Test program for the extended {@link Rectangle} class.
 *
 * <p>Builds three rectangles from keyboard input, prints their measures
 * and tests the methods that create new rectangles
 * ({@link Rectangle#sumSides()} and {@link Rectangle#doubleSides()}).</p>
 *
 * @author gastaldello12303
 * @version 20-10-2026
 */
public class RectangleTester {

	/**
	 * Entry point of the program.
	 *
	 * <p>Reads the sides of three rectangles and prints their
	 * descriptions, their measures and the rectangles obtained by summing
	 * and doubling the sides of the third one.</p>
	 *
	 * @param args command-line arguments (not used)
	 */
	public static void main (String[] args) {

		Scanner in = new Scanner(System.in);

		int height; int base;


		System.out.println("Enter the integer base of the rectangle: ");
			base = Integer.parseInt(in.nextLine());

		System.out.println("Enter the integer height of the rectangle: ");
			height = Integer.parseInt(in.nextLine());

		Rectangle r = new Rectangle(base, height); // first rectangle: built with the constructor with parameters

			System.out.println(r.toString()); // toString() prints the data instead of the hexadecimal string after the class name


		Rectangle r1 = new Rectangle(); // second rectangle: built with the default constructor (0 x 0)
		System.out.println("Enter the integer base of the second rectangle: ");
			r1.setBase(Integer.parseInt(in.nextLine())); // setBase writes the base inside the rectangle created above

		System.out.println("Enter the integer height of the second rectangle: ");
			r1.setHeight(Integer.parseInt(in.nextLine())); // setHeight writes the height inside the rectangle created above

		System.out.println(r1.toString());

		// calculations:

		System.out.println("Area of the first rectangle: " + r.area()); // area method defined in the Rectangle class
		System.out.println("Perimeter of the first rectangle: " + r.perimeter()); // perimeter method
		System.out.println("Diagonal of the first rectangle: " + r.diagonal()); // diagonal method

		System.out.println("");

		System.out.println("Area of the second rectangle: " + r1.area());
		System.out.println("Perimeter of the second rectangle: " + r1.perimeter());
		System.out.println("Diagonal of the second rectangle: " + r1.diagonal());

		// third rectangle: the sides must be read BEFORE calling the constructor
		int b3; int h3;

		System.out.println("Enter the base of the 3rd rectangle: ");
		b3 = Integer.parseInt(in.nextLine());

		System.out.println("Enter the height of the 3rd rectangle: ");
		h3 = Integer.parseInt(in.nextLine());

		Rectangle r3 = new Rectangle(b3, h3);

		System.out.println(r3.toString());
		System.out.println("Rectangle after summing the sides: " + r3.sumSides());
		System.out.println("Rectangle after doubling the sides: " + r3.doubleSides());
	}
}
