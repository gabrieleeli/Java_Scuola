/**
 * Test program for the {@link Circle} class.
 *
 * <p>Creates two circles and prints the radius, the area and the
 * circumference of the first one, followed by the circles returned by
 * {@link Circle#halfRadius()} and {@link Circle#sumRadius(Circle)}.</p>
 *
 * @author gastaldello12303
 * @version 24-10-2026
 */
public class CircleClassTester {

	/**
	 * Entry point of the program.
	 *
	 * @param args command-line arguments (not used)
	 */
	public static void main (String[] args) {
		Circle c = new Circle(67);
		Circle d = new Circle(6.7);
		// getRadius() returns a primitive double, so toString() cannot be called on it:
		//System.out.println(c.getRadius().toString());
		System.out.println("Radius of the circle: " + c.getRadius());
		System.out.println("Area of the circle: " + c.getArea());
		System.out.println("Circumference of the circle: " + c.getCircumference());
		// the returned Circle objects are printed through their toString() method
		System.out.println("Half radius: " +  c.halfRadius());
		System.out.println("radius + 6.7: " +  c.sumRadius(d));
	}
}
