import java.util.Scanner;

/**
 * Test program for the {@link Rectangle} class.
 *
 * <p>Builds two rectangles in two different ways (with the
 * two-parameter constructor and with the default constructor followed by
 * the setters) and prints the area, perimeter and diagonal of both.</p>
 *
 * @author gastaldello12303
 * @version 13-10-2026
 */
public class RectangleTester {

	/**
	 * Entry point of the program.
	 *
	 * <p>Reads the sides of two rectangles from the keyboard and prints
	 * their description and their measures.</p>
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
	}
}
