/**
 * A gift card of a brand, with a credit that can be spent in a shop.
 *
 * <p>A card is created active. While it is active its credit can be spent
 * (partially or all at once), recharged (only if the card is
 * rechargeable) and transferred to another rechargeable card of the same
 * brand. Once the card is blocked it can no longer be used: the remaining
 * credit can only be recovered, one time.</p>
 *
 * @author gastaldello12303
 * @version 10-11-2026
 */
public class GiftCard {

	/** Brand (shop) where the card can be used. */
	private String brand;
	/** Credit currently available on the card. */
	private double credit;
	/** {@code true} if the card can be recharged with new money. */
	private boolean rechargeable;
	/** {@code true} if the card is active, {@code false} if it is blocked. */
	private boolean active;
	/** Number of purchases made with the card. */
	private int uses;

	/**
	 * Creates a new active gift card that has never been used.
	 *
	 * @param m the brand of the card
	 * @param c the initial credit
	 * @param r {@code true} if the card can be recharged
	 */
	public GiftCard (String m, double c, boolean r){
		brand = m;
		credit = c;
		uses = 0;
		rechargeable = r;
		active = true; // every new card starts active
		}

	/**
	 * Copy constructor: creates a new card with the same brand, credit,
	 * number of uses, rechargeability and state as another card.
	 *
	 * @param a the card to copy
	 */
	public GiftCard(GiftCard a){
		this.brand = a.brand;
		this.credit = a.credit;
		this.uses = a.uses;
		this.rechargeable = a.rechargeable;
		this.active = a.active;
		}

	/**
	 * Checks whether the card can pay an amount, that is whether it is
	 * active and has at least that much credit. Used internally by
	 * {@link #spend(double)}.
	 *
	 * @param money the amount to check
	 * @return {@code true} if the card is active and the credit is enough,
	 *         {@code false} otherwise
	 */
	private boolean hasEnoughCredit(double money){
		if (active == true && credit >= money){
			return true;
			}
		else{return false;}
		}

	/**
	 * Returns the credit available on the card.
	 *
	 * @return the credit
	 */
	public double getCredit(){
		return credit;
		}

	/**
	 * Returns the brand of the card.
	 *
	 * @return the brand
	 */
	public String getBrand(){
		return brand;
		}

	/**
	 * Returns how many purchases have been made with the card.
	 *
	 * @return the number of uses
	 */
	public int getUses(){
		return uses;
		}

	/**
	 * Tells whether the card can be recharged.
	 *
	 * @return {@code true} if the card is rechargeable
	 */
	public boolean isRechargeable(){
		return rechargeable;
		}

	/**
	 * Tells whether the card is active.
	 *
	 * @return {@code true} if the card is active, {@code false} if it has
	 *         been blocked
	 */
	public boolean isActive(){
		return active;
		}

	/**
	 * Spends all the credit of the card in a single purchase. Nothing
	 * happens if the card is blocked or already empty.
	 */
	public void spendAll(){
		if (active == true && credit > 0){
			credit = 0;
			uses += 1; // spending the whole credit is still a purchase
		}
		}

	/**
	 * Spends part of the credit of the card. The purchase is made only if
	 * the amount is positive, the card is active and the credit is
	 * enough; otherwise nothing happens.
	 *
	 * @param money the amount to spend
	 */
	public void spend(double money){
		if (money > 0 && hasEnoughCredit(money) == true){ // hasEnoughCredit already checks the state and the credit
			credit -= money;
			uses += 1;
		}
		}

	/**
	 * Checks whether two cards belong to the same brand.
	 *
	 * <p>The method is {@code static} because it compares the two cards
	 * passed as parameters and does not use the card it is called on:
	 * call it as {@code GiftCard.sameBrand(a, b)}.</p>
	 *
	 * @param a the first card
	 * @param b the second card
	 * @return {@code true} if the two cards have the same brand,
	 *         {@code false} otherwise
	 */
	public static boolean sameBrand(GiftCard a, GiftCard b){
		// strings must be compared with equals(): == only checks
		// whether they are the same object in memory
		if (a.brand.equals(b.brand)){
			return true;
			}

		else{return false;}
		}

	/**
	 * Blocks the card. A blocked card cannot be used to spend, recharge or
	 * transfer credit any more. Nothing happens if it is already blocked.
	 */
	public void blockCard(){
		if (active == true){
			active = false;
		}
		}

	/**
	 * Recovers the money left on a blocked card. The credit is returned
	 * and set to 0, so it can be recovered only once.
	 *
	 * @return the recovered credit, or 0 if the card is still active
	 */
	public double recoverMoney(){
		if (active == false){
			double recovered = credit;
			credit = 0; // the money is given back, so it is no longer on the card
			return recovered;
			}

		else {return 0;}
		}

	/**
	 * Adds money to the credit of the card. The recharge is made only if
	 * the card is rechargeable, active and the amount is positive;
	 * otherwise nothing happens.
	 *
	 * @param money the amount to add
	 */
	public void recharge(double money){
		if (this.isRechargeable() == true && active == true && money > 0){
			credit += money;
			}
		}

	/**
	 * Moves all the credit of this card to another card. The transfer is
	 * made only if:
	 * <ul>
	 *   <li>the two cards are different objects;</li>
	 *   <li>both cards are active;</li>
	 *   <li>this card has some credit;</li>
	 *   <li>the two cards have the same brand;</li>
	 *   <li>the card that receives the money is rechargeable.</li>
	 * </ul>
	 * Otherwise nothing happens.
	 *
	 * @param b the card that receives the credit
	 */
	public void transferTo(GiftCard b){
		if (this != b && this.active == true && b.active == true && this.credit > 0
				&& sameBrand(this, b) == true && b.isRechargeable() == true){
			b.credit += this.credit;
			this.credit = 0;
		}
		}

	/**
	 * Returns a text description of the card.
	 *
	 * @return a string with brand, credit, state, uses and rechargeability
	 */
	@Override
	public String toString(){
		return "Brand: " + brand + ", Credit: " + credit + ", Active: " + active + ", Uses: " + uses + ", Rechargeable: " + rechargeable;
		}


}
