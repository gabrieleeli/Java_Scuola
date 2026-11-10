/**
 * Test program for the {@link Counter} class.
 *
 * <p>Creates a counter, clicks it once, resets it and prints its value
 * after every step.</p>
 *
 * @author gastaldello12303
 * @version 10-10-2026
 */
public class Tester {

	/**
	 * Entry point of the program.
	 *
	 * <p>Exercises the methods {@link Counter#click()},
	 * {@link Counter#getValue()} and {@link Counter#reset()}.</p>
	 *
	 * @param args command-line arguments (not used)
	 */
	public static void main (String[] args) {
		Counter counter = new Counter(); // create a new Counter object

		int val = 0;
		System.out.println("Initial value of val: " + val);

		// one click: the counter goes from 0 to 1
		counter.click();
		val = counter.getValue();
		System.out.println("Count of val: " + val);

		// reset: the counter goes back to 0
		counter.reset();
		val = counter.getValue();
		System.out.println("Val after reset: " + val);

		// "value" is public, so it could also be read directly (bad practice):
		//int b = counter.value + 67;
		//System.out.println("value of value: " + b);
	}
}
