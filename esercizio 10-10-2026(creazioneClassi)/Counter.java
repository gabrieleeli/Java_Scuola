/**
 * A simple click counter, like the hand-held tally counters used to
 * count people entering a room.
 *
 * <p>First exercise on creating a class: it has one instance variable,
 * a method that reads it ({@link #getValue()}) and two methods that
 * change it ({@link #click()} and {@link #reset()}).</p>
 *
 * @author gastaldello12303
 * @version 10-10-2026
 */
public class Counter {
	/** Current value of the counter (number of clicks since the last reset). */
	public int value;

	/**
	 * Creates a new counter that starts from 0.
	 */
	public Counter()
		{
			value = 0;
		}

	/**
	 * Returns the current value of the counter.
	 *
	 * @return the number of clicks counted so far
	 */
	public int getValue()
		{
			return value;
		}

	/**
	 * Advances the counter by one (simulates pressing the button).
	 */
	public void click()
		{
			value = value + 1;
		}

	/**
	 * Sets the counter back to 0.
	 */
	public void reset()
		{
			value = 0;
		}

}
