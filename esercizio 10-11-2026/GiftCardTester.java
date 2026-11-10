import java.util.Scanner;

/**
 * Test program for the {@link GiftCard} class.
 *
 * <p>Creates some gift cards and tests every public method: spending,
 * recharging, comparing brands, transferring credit, blocking a card and
 * recovering its money. The expected result of each step is written in
 * the comments.</p>
 *
 * @author gastaldello12303
 * @version 10-11-2026
 */
public class GiftCardTester {

	/**
	 * Entry point of the program.
	 *
	 * @param args command-line arguments (not used)
	 */
	public static void main (String[] args) {

		Scanner in = new Scanner(System.in);

		// a rechargeable card with 50 of credit
		GiftCard a = new GiftCard("Amazon", 50, true);
		System.out.println("Card a: " + a.toString());

		// spend an amount typed by the user
		System.out.println("How much do you want to spend with card a? ");
		double amount = Double.parseDouble(in.nextLine());
		a.spend(amount); // nothing happens if the amount is negative or greater than the credit
		System.out.println("After spending " + amount + ": " + a.toString());

		// spending more than the credit is refused
		a.spend(1000);
		System.out.println("After trying to spend 1000 (refused): " + a.toString());

		// recharge the card
		a.recharge(20);
		System.out.println("After recharging 20: " + a.toString());

		// a non-rechargeable card ignores the recharge
		GiftCard b = new GiftCard("Amazon", 30, false);
		b.recharge(20);
		System.out.println("Card b after recharging 20 (not rechargeable): " + b.toString());

		// copy constructor: c is a separate copy of a
		GiftCard c = new GiftCard(a);
		System.out.println("Card c (copy of a): " + c.toString());

		// compare the brands
		GiftCard d = new GiftCard("Zalando", 100, true);
		System.out.println("a and b same brand? " + GiftCard.sameBrand(a, b)); // true
		System.out.println("a and d same brand? " + GiftCard.sameBrand(a, d)); // false

		// transfer: b (Amazon) -> a (Amazon, rechargeable) works
		b.transferTo(a);
		System.out.println("After transferring b to a:");
		System.out.println("  a: " + a.toString());
		System.out.println("  b: " + b.toString());

		// transfer: c (Amazon) -> d (Zalando) is refused, different brands
		c.transferTo(d);
		System.out.println("After trying to transfer c to d (refused):");
		System.out.println("  c: " + c.toString());
		System.out.println("  d: " + d.toString());

		// spend all the credit of d
		d.spendAll();
		System.out.println("d after spending everything: " + d.toString());

		// block card a: it can no longer be used
		a.blockCard();
		a.spend(10);
		a.recharge(10);
		System.out.println("a after blocking (spend and recharge refused): " + a.toString());

		// the money of a blocked card can be recovered only once
		System.out.println("Money recovered from a: " + a.recoverMoney());
		System.out.println("Money recovered from a again: " + a.recoverMoney()); // 0

		// an active card does not give back money
		System.out.println("Money recovered from c (active): " + c.recoverMoney()); // 0

		System.out.println("Final state of a: " + a.toString());
	}
}
