/**
 * A rectangle described by an integer base and an integer height.
 *
 * <p>Extended version of the class from 13-10-2026. Besides getters,
 * setters and the measure methods, it adds a copy constructor and
 * methods that take another {@code Rectangle} as a parameter or return a
 * new {@code Rectangle}.</p>
 *
 * @author gastaldello12303
 * @version 20-10-2026
 */
public class Rectangle { // this line creates the class

	/** Length of the base of the rectangle. */
	private int base; // the two instance variables are private
	/** Length of the height of the rectangle. */
	private int height;

	/**
	 * Creates a rectangle with base and height both equal to 0.
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
	 * Copy constructor: creates a new rectangle with the same base and
	 * height as another one.
	 *
	 * @param r the rectangle to copy
	 */
	public Rectangle(Rectangle r){
		this.base = r.base; // "this" refers to the object being created, "r" is the rectangle passed in
		this.height = r.height;
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
	 * height.
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

	/**
	 * Creates a new rectangle whose sides are the sum of the sides of this
	 * rectangle and of another one. Neither rectangle is modified.
	 *
	 * @param y the rectangle whose sides are added to this one
	 * @return a new rectangle with base {@code this.base + y.base} and
	 *         height {@code this.height + y.height}
	 */
	public Rectangle sumSides(Rectangle y){
		Rectangle r2 = new Rectangle(this.base + y.base, this.height + y.height);
		return r2;
		}

	/**
	 * Checks whether this rectangle and another one have the same area.
	 *
	 * @param r the rectangle to compare with
	 * @return {@code true} if the two areas are equal, {@code false}
	 *         otherwise
	 */
	public boolean hasSameArea(Rectangle r){

		if (this.area() == r.area()){
			return true;
		}

		else{
			return false;
			}
		}

	/**
	 * Creates a new rectangle with both sides doubled (base &times; 2 and
	 * height &times; 2). This rectangle is not modified.
	 *
	 * @return a new rectangle with doubled sides
	 */
	public Rectangle doubleSides(){
		int doubledBase = this.base * 2;
		int doubledHeight = this.height * 2;

		// a method can return only one value, so the two sides are
		// returned together inside a new Rectangle object
		return new Rectangle(doubledBase, doubledHeight);
		}

	/**
	 * Creates a new rectangle whose sides are the sides of this rectangle
	 * added to themselves (base + base and height + height). The result is
	 * the same as {@link #doubleSides()}; this version uses additions
	 * instead of multiplications. This rectangle is not modified.
	 *
	 * @return a new rectangle with each side added to itself
	 */
	public Rectangle sumSides(){
		int summedBase = this.base + this.base;
		int summedHeight = this.height + this.height;

		return new Rectangle(summedBase, summedHeight);
		}
}
