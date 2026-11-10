/**
 * A rectangle described by an integer base and an integer height.
 *
 * <p>Exercise on classes (part 2): private instance variables,
 * constructors, getter and setter methods, and methods that compute
 * values from the state of the object.</p>
 *
 * @author gastaldello12303
 * @version 13-10-2026
 */
public class Rectangle { // this line creates the class

	/** Length of the base of the rectangle. */
	private int base; // the two instance variables are private
	/** Length of the height of the rectangle. */
	private int height;

	/**
	 * Creates a rectangle with base and height both equal to 0.
	 * The sides can be changed later with {@link #setBase(int)} and
	 * {@link #setHeight(int)}.
	 */
	public Rectangle() { // default constructor (no parameters)
		base = 0; // both base and height start from 0
		height = 0;
	}

	/**
	 * Creates a rectangle with the given base and height.
	 *
	 * @param b the base of the rectangle
	 * @param h the height of the rectangle
	 */
	public Rectangle(int b, int h) {
		base = b; // constructor with parameters: the sides are given by the caller
		height = h;
	}

	/**
	 * Returns the base of the rectangle.
	 *
	 * @return the base
	 */
	public int getBase(){ // getter: lets other classes read the base
		return base;
	}

	/**
	 * Returns the height of the rectangle.
	 *
	 * @return the height
	 */
	public int getHeight(){ // getter: lets other classes read the height
		return height;
	}

	/**
	 * Changes the height of the rectangle.
	 *
	 * @param nh the new height
	 */
	public void setHeight(int nh){ // setter: changes the value of the height variable
		height = nh;
	}

	/**
	 * Changes the base of the rectangle.
	 *
	 * @param nb the new base
	 */
	public void setBase(int nb){ // setter: changes the value of the base variable
		base = nb;
	}

	/**
	 * Computes the area of the rectangle (base &times; height).
	 *
	 * @return the area
	 */
	public double area(){
		return base * height;
	}

	/**
	 * Computes the perimeter of the rectangle
	 * (2 &times; (base + height)).
	 *
	 * @return the perimeter
	 */
	public double perimeter(){
		return (base + height) * 2;
	}

	/**
	 * Computes the length of the diagonal of the rectangle using the
	 * Pythagorean theorem.
	 *
	 * @return the diagonal, that is sqrt(base<sup>2</sup> + height<sup>2</sup>)
	 */
	public double diagonal(){
		return Math.sqrt((base * base) + (height * height));
		//return Math.hypot(base, height); // equivalent alternative
	}

	/**
	 * Returns a text description of the rectangle with its base and
	 * height. Without this method, printing the object would show the
	 * class name followed by a hexadecimal hash code.
	 *
	 * @return a string such as {@code "Rectangle data: base: 3 height: 4"}
	 */
	@Override
	public String toString(){
		String s = "Rectangle data: ";
		s += "base: " + base;
		s += " height: " + height;
		return s;
	}
}
