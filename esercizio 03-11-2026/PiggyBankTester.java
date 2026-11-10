import java.util.Scanner;

/**
 * Test program for the {@link PiggyBank} class.
 *
 * <p>Creates a piggy bank, puts money in it, shakes it, smashes it,
 * repairs it, transfers its money to another person's piggy bank and
 * finally tries to shake a broken piggy bank.</p>
 *
 * @author gastaldello12303
 * @version 03-11-2026
 */
public class PiggyBankTester {

	/**
	 * Entry point of the program.
	 *
	 * @param args command-line arguments (not used)
	 */
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		PiggyBank s = new PiggyBank("Gabriele");

		// a new piggy bank is empty
		System.out.println(s.getOwner());
		System.out.println(s.getMoney());

		System.out.println("Money: ");
		int amount = Integer.parseInt(in.nextLine());
		s.addMoney(amount);

		System.out.println(s.toString());

		System.out.println("Money left after shaking the piggy bank: " + s.shake());

		System.out.println("Smashing the piggy bank: " + s.smash());

		// after the repair the piggy bank is intact again, but empty
		s.repair();

		System.out.println("Enter money into the repaired piggy bank: ");
		amount = Integer.parseInt(in.nextLine());
		s.addMoney(amount);
		System.out.println("Money in the repaired piggy bank: " + s.getMoney());

		// transfer all the money to the piggy bank of another person
		System.out.println("Enter the name of the person you want to transfer the money to: ");
		String person = in.nextLine();
		PiggyBank other = new PiggyBank(person);

		System.out.println("Enter money into the piggy bank of " + person + ": ");
		amount = Integer.parseInt(in.nextLine());
		other.addMoney(amount);
		System.out.println("Money in the piggy bank of " + person + ": " + other.getMoney());

		s.transferTo(other);
		System.out.println("After the transfer: " + s.toString());
		System.out.println("After the transfer: " + other.toString());

		// a broken piggy bank cannot be shaken: shake() returns 0
		System.out.println("Smashing the piggy bank: " + s.smash());
		System.out.println("Shaking the broken piggy bank: " + s.shake());

	}
}
