/**
 * Prints a smiley face drawn with ASCII characters.
 *
 * <p>Exercise on escape sequences inside string literals:
 * {@code \t} inserts a tab and {@code \n} starts a new line.</p>
 *
 * @author gastaldello12303
 * @version 25-09-2026
 */
public class SmileyFace {

	/**
	 * Entry point of the program.
	 *
	 * <p>Prints the face on the screen using a single
	 * {@code println} call.</p>
	 *
	 * @param args command-line arguments (not used)
	 */
	public static void main (String[] args) {

		// hair, forehead, eyes, nose, mouth and chin, one per line
		System.out.println("\t\t ///////\n\t\t+'''''''+\n\t        (| 0 0 |)\n\t         |  ^  |\n\t         | ,_, |\n\t\t +-----+");
	}
}
