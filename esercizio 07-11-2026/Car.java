/**
 * A car with a fuel tank, described by its name, its fuel efficiency
 * (kilometres per litre) and the capacity of its tank.
 *
 * <p>The class keeps track of the fuel in the tank: the car can be
 * refuelled (never above the tank capacity) and driven (only if there is
 * enough fuel for the whole distance). It can also report its range and
 * whether it is running on the fuel reserve.</p>
 *
 * @author gastaldello12303
 * @version 07-11-2026
 */
public class Car {

	/** Name (make and model) of the car. */
	private String name;
	/** Fuel efficiency, in kilometres per litre. */
	private double efficiency;
	/** Capacity of the fuel tank, in litres. */
	private double capacity;
	/** Litres of fuel currently in the tank. */
	private double fuelLiters;

	/**
	 * Creates a car with some fuel already in the tank.
	 *
	 * @param n the name of the car
	 * @param r the fuel efficiency, in km/l
	 * @param c the capacity of the tank, in litres
	 * @param l the litres of fuel initially in the tank
	 */
	public Car(String n, double r, double c, double l){
		name = n;
		efficiency = r;
		capacity = c;
		fuelLiters = l;
		}

	/**
	 * Creates a car with an empty tank.
	 *
	 * @param n the name of the car
	 * @param r the fuel efficiency, in km/l
	 * @param c the capacity of the tank, in litres
	 */
	public Car(String n, double r, double c){
		name = n;
		efficiency = r;
		capacity = c;
		fuelLiters = 0;
		}

	/**
	 * Returns the name of the car.
	 *
	 * @return the name
	 */
	public String getName(){
		return name;
		}

	/**
	 * Returns the fuel efficiency of the car.
	 *
	 * @return the efficiency, in km/l
	 */
	public double getEfficiency(){
		return efficiency;
		}

	/**
	 * Returns the capacity of the tank.
	 *
	 * @return the capacity, in litres
	 */
	public double getCapacity(){
		return capacity;
		}

	/**
	 * Returns the fuel currently in the tank.
	 *
	 * @return the fuel, in litres
	 */
	public double getLiters(){
		return fuelLiters;
		}

	/**
	 * Changes the name of the car.
	 *
	 * @param name the new name
	 */
	public void setName(String name){
		this.name = name;
		}

	// efficiency and capacity are fixed characteristics of the car,
	// so their setters are intentionally disabled:
	//~ public void setEfficiency(double efficiency){
		//~ this.efficiency = efficiency;
		//~ }

	//~ public void setCapacity(double capacity){
		//~ this.capacity = capacity;
		//~ }

	/**
	 * Sets the fuel in the tank. If the value is greater than the tank
	 * capacity, the tank is simply filled up to its capacity.
	 *
	 * @param fuelLiters the new amount of fuel, in litres
	 */
	public void setLiters(double fuelLiters){
		if (fuelLiters <= capacity){
		this.fuelLiters = fuelLiters;
		}
		else {
			this.fuelLiters = capacity;
			}
	}

	/**
	 * Returns a text description of the car.
	 *
	 * @return a string with name, capacity, efficiency and fuel in the tank
	 */
	@Override
	public String toString(){
		return "Car: " + name + " with a capacity of: " + capacity + " litres" + " and an efficiency of: " + efficiency + " km/l " + "with: " + fuelLiters + " litres in the tank";
		}

	/**
	 * Checks whether the car has enough fuel to travel a distance.
	 *
	 * @param distance the distance to travel, in km
	 * @return {@code true} if the range of the car is at least
	 *         {@code distance}, {@code false} otherwise
	 */
	public boolean canTravel(double distance){
		boolean answer;
		if (efficiency * fuelLiters >= distance ){
			answer = true;
			return answer;
			}

		else{
			answer = false;
			return answer;
			}
		}

	/**
	 * Drives the car for a distance and consumes the corresponding fuel
	 * ({@code distance / efficiency} litres). If there is not enough
	 * fuel for the whole distance, the car does not move and no fuel is
	 * consumed.
	 *
	 * @param distance the distance to drive, in km
	 */
	public void drive(double distance){
		if (canTravel(distance)){
			this.fuelLiters = fuelLiters - (distance / efficiency);
			}
		}

	/**
	 * Returns the range of the car, that is how many kilometres it can
	 * still travel with the fuel in the tank.
	 *
	 * @return the range, in km ({@code efficiency * fuelLiters})
	 */
	public double getRange(){
		double a = efficiency * fuelLiters;
		return a;
		}

	/**
	 * Checks whether the car is running on the fuel reserve, that is
	 * whether the fuel in the tank is 5% of the capacity or less.
	 *
	 * @return {@code true} if the car is on reserve, {@code false}
	 *         otherwise
	 */
	public boolean isOnReserve(){
		if(fuelLiters <= ((capacity * 5) / 100)){
			return true;
			}

		else{
			return false;
			}
		}

	/**
	 * Adds fuel to the tank and returns the new fuel level. If the added
	 * fuel would overflow the tank, the tank is filled exactly up to its
	 * capacity. If the tank is already full nothing changes.
	 *
	 * @param addedFuel the litres of fuel to add
	 * @return the litres of fuel in the tank after filling up
	 */
	public double fillUp(double addedFuel){
		if (fuelLiters < capacity){
			double a = fuelLiters + addedFuel;
			if(a >= capacity){
				this.fuelLiters = capacity;          // too much fuel: the tank is full
				return fuelLiters;
				}
			else{
				this.fuelLiters = a;                 // the added fuel fits in the tank
				return fuelLiters;
				}
			}
		else {
			return fuelLiters;
			}
		}

	/**
	 * Refuels the car with a quantity of fuel. If the quantity would
	 * overflow the tank, the tank is filled exactly up to its capacity.
	 *
	 * @param quantity the litres of fuel to add
	 */
	public void refuel(double quantity){
		if (fuelLiters + quantity > capacity){
			this.fuelLiters = capacity;          // excessive refuelling: the tank is full
			}
		else {
			this.fuelLiters = fuelLiters + quantity;   // update the fuel in the tank
			}
		}

	/**
	 * Checks whether this car consumes less fuel than another one, that is
	 * whether it has a higher efficiency (travels more km with one litre).
	 *
	 * @param other the car to compare with
	 * @return {@code true} if this car consumes less than {@code other},
	 *         {@code false} otherwise
	 */
	public boolean consumesLess(Car other){
		if (this.efficiency > other.efficiency){
			return true;
			}
		else {
			return false;
			}
		}
}

