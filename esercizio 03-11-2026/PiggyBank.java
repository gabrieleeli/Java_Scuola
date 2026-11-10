import java.util.Random;

/**
 * A piggy bank that belongs to an owner and holds an amount of money.
 *
 * <p>Money can be added only while the piggy bank is intact. Shaking it
 * makes a random amount of money fall out; smashing it gives back all the
 * money but leaves it broken; a broken piggy bank can be repaired, but it
 * starts again empty.</p>
 *
 * @author gastaldello12303
 * @version 03-11-2026
 */
public class PiggyBank {
	/** Amount of money currently inside the piggy bank. */
	private int money;
	/** Name of the owner of the piggy bank. */
	private String owner;
	/** {@code true} if the piggy bank is intact, {@code false} if it is broken. */
	private boolean intact;

	/**
	 * Creates a new, empty and intact piggy bank.
	 *
	 * @param s the name of the owner
	 */
	public PiggyBank(String s){
		money = 0;
		owner = s;
		intact = true;
		}

	/**
	 * Returns a text description of the piggy bank.
	 *
	 * @return a string with the owner, the money inside and whether the
	 *         piggy bank is intact
	 */
	@Override
	public String toString(){
		return "Piggy bank of: " + owner + " with: " + money + " intact: " + intact;
		}

	/**
	 * Adds money to the piggy bank. Nothing happens if the piggy bank is
	 * broken.
	 *
	 * @param amount the amount of money to put in
	 */
	public void addMoney(int amount){
		if (intact == true){money += amount;}
		}

	/**
	 * Returns the amount of money inside the piggy bank.
	 *
	 * @return the money currently inside
	 */
	public int getMoney(){
		return money;
		}

	/**
	 * Returns the name of the owner.
	 *
	 * @return the owner of the piggy bank
	 */
	public String getOwner(){
		return owner;
		}

	/**
	 * Shakes the piggy bank: a random amount of money between 1 and the
	 * whole content falls out of it.
	 *
	 * @return the money left inside after shaking, or 0 if the piggy
	 *         bank is broken or already empty
	 */
	public int shake(){
		if (intact == true && money > 0){ // Random.nextInt(0) would throw an exception, so an empty piggy bank is skipped
		Random r = new Random();
		money -= r.nextInt(money) + 1; // random number from 1 to money
		return money;
		}
		else {
			return 0;
			}
		}

	/**
	 * Smashes the piggy bank to take out all the money. After this call
	 * the piggy bank is broken and no more money can be added.
	 *
	 * @return the money that was inside, or 0 if the piggy bank was
	 *         already broken
	 */
	public int smash(){
		if (intact == true){
			intact = false;
			return money;
			}

		else{
			return 0;
			}
		}

	/**
	 * Repairs a broken piggy bank. The repaired piggy bank is intact and
	 * empty. Nothing happens if the piggy bank is already intact.
	 */
	public void repair(){
		if(intact == false){
			intact = true;
			money = 0;
			}
		}

	/**
	 * Moves all the money of this piggy bank into another one. The
	 * transfer happens only if both piggy banks are intact.
	 *
	 * @param p the piggy bank that receives the money
	 */
	public void transferTo(PiggyBank p){
		if (this.intact == true){
			if (p.intact == true){
				p.money += this.money;
				this.money = 0;
				}
		}
	}
}
