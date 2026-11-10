/**
 * Prints an ASCII-art face as a greeting on the screen.
 *
 * <p>Exercise on {@code System.out.println} and on the escape
 * sequences {@code \t} (tab) and {@code \n} (new line).</p>
 *
 * @author gastaldello12303
 * @version 25-09-2026
 */
public class HelloPrinter {

	/**
	 * Entry point of the program.
	 *
	 * <p>Prints the ASCII-art face with a single {@code println}
	 * call.</p>
	 *
	 * @param args command-line arguments (not used)
	 */
	public static void main (String[] args) {

		// every "\n" starts a new row of the drawing, every "\t" indents it
		System.out.println("\t\t ///////\n\t\t+'''''''+\n\t        (| 0 0 |)\n\t         |  ^  |\n\t         | ,_, |\n\t\t +-----+");
	}
}
