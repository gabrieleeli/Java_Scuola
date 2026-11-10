
/**
 * Second exercise on casts, constants, increment operators and
 * floating-point precision.
 *
 * <p>The program shows:</p>
 * <ul>
 *   <li>where to put a cast to obtain a floating-point division;</li>
 *   <li>the constants {@link Math#PI} and {@link Math#E};</li>
 *   <li>the difference between post-increment ({@code d++}) and
 *       pre-increment ({@code ++d});</li>
 *   <li>compound assignment operators such as {@code *=};</li>
 *   <li>rounding errors caused by the binary representation of
 *       decimal numbers (textbook pages 137 and 195).</li>
 * </ul>
 *
 * @author gastaldello12303
 * @version 06-10-2026
 */
public class CastJava2 {

	/**
	 * Entry point of the program.
	 *
	 * <p>Runs each small example in sequence and prints its result.</p>
	 *
	 * @param args command-line arguments (not used)
	 */
	public static void main (String[] args) {
		double a; int b = 10; int c = 3;

		a = 10 / 3; // even though "a" is a double, the result is an integer because both operands are integers
		System.out.println("Before the cast: " + a);

		a = (double) b / c; // after casting b to double the division keeps the decimal part of the result
		System.out.println("After the cast: " + a);

		a = (double) (b / c); // here the cast is useless: (b / c) is computed first as an integer, so the decimal part is already lost
		System.out.println("Cast around the parentheses: " + a);

					// Constants:

		System.out.println("Pi: " + Math.PI);
		System.out.println("Euler's number: " + Math.E);



		int d = 5;
		System.out.println(d);
		System.out.println(d++); // post-increment: prints the current value (5) and THEN adds 1
		System.out.println(++d); // pre-increment: adds 1 FIRST and then prints the new value (7)



		int t = 2;
		t *= 2; // shorthand for t = t * 2;
		System.out.println(t);

					// Page 137

		double f = 4.35;
		System.out.println(100 * f);  // apparent error (434.99999999999994): it comes from converting the decimal number to binary

					// Page 195

		double r = Math.sqrt(2);
		double e = r * r - 2; // mathematically 0, but rounding errors make it slightly different
		if (e == 0){

			System.out.println("sqrt(2) squared minus 2 is equal to 0");

			}

		else{

			System.out.println("sqrt(2) squared minus 2 is not 0 but: " + e);

			}

		/*

		final double EPSILON = 1E-14; // 1E-14 means 1 * 10^(-14)
		if (Math.abs(e) <= EPSILON)
			{
				// x is approximately equal to y
			}
		*/


	}
}
