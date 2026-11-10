/**
 * A circle described by its radius.
 *
 * <p>Provides constructors (default, with radius, copy), getter and
 * setter for the radius, methods that compute the area and the
 * circumference, and methods that return new {@code Circle} objects.</p>
 *
 * @author gastaldello12303
 * @version 24-10-2026
 */
public class Circle {
	/** Radius of the circle. */
	private double radius;

	/**
	 * Creates a circle with radius 0.
	 */
	public Circle(){
		radius = 0;
		}

	/**
	 * Creates a circle with the given radius.
	 *
	 * @param r the radius of the circle
	 */
	public Circle(double r){
		radius = r;
		}

	/**
	 * Copy constructor: creates a new circle with the same radius as
	 * another one.
	 *
	 * @param c the circle to copy
	 */
	public Circle(Circle c){

		this.radius = c.radius;
		}

	/**
	 * Returns a text description of the circle with its radius.
	 *
	 * @return a string such as {@code "The radius is: 2.5"}
	 */
	@Override
	public String toString(){
		String s = "";
		s += "The radius is: " + radius;
		return s;
		}

	/**
	 * Changes the radius of the circle.
	 *
	 * @param r the new radius
	 */
	public void setRadius(double r){ // setter: changes the value of the variable
		radius = r;
		}

	/**
	 * Returns the radius of the circle.
	 *
	 * @return the radius
	 */
	public double getRadius(){
		return radius;
		}

	/**
	 * Computes the area of the circle (&pi; &times; r<sup>2</sup>).
	 *
	 * @return the area
	 */
	public double getArea(){
		double area = Math.PI * (radius * radius);
		return area;
		}

	/**
	 * Computes the circumference of the circle (2 &times; r &times; &pi;).
	 *
	 * @return the circumference
	 */
	public double getCircumference(){
		double circumference = (2.0 * radius) * Math.PI;
		return circumference;
		}

	/**
	 * Creates a new circle whose radius is half the radius of this one.
	 * This circle is not modified.
	 *
	 * @return a new circle with radius {@code radius / 2}
	 */
	public Circle halfRadius(){
		Circle c1 = new Circle(this.radius / 2);
		return c1;
		}

	/**
	 * Creates a new circle whose radius is the sum of the radius of this
	 * circle and of another one. Neither circle is modified.
	 *
	 * @param f the circle whose radius is added
	 * @return a new circle with radius {@code this.radius + f.radius}
	 */
	public Circle sumRadius(Circle f){
		Circle h = new Circle(this.radius + f.radius);
		return h;
		}
}
