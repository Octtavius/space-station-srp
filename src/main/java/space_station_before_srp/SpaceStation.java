package space_station_before_srp;

import java.util.HashMap;
import java.util.Map;

/**
 * this class is before SRP applied.
 * it has multiple methods in one class
 * Currently, our SpaceStation class is a classic example of a so-called “God object”
 * 
 * Admittedly, our space stations aren’t particularly 
 * capable (I guess NASA won’t be calling on me any time soon); 
 * however, there is still quite a bit to unpack here. 
 * Immediately we can see that the SpaceStation class has several disparate 
 * responsibilities. Roughly, we might say that space station operations can be 
 * broken down into four areas: sensors; supplies; fuel; and, thrusters. 
 * Although personnel are not specified in the class, we can easily imagine 
 * different actors who might care about these operational areas. 
 * Perhaps a scientist who manages the sensors, a logistical officer who handles supplies, 
 * an engineer who manages fuel, and a pilot who manages the thrusters. 
 * Given this variety of different operational areas and interested actors, 
 * might we say that this class is violating the SRP? Absolutely.
 * 
 * @author I323506
 *
 */
public class SpaceStation {

	// type of supply and quantity
	private Map<String, Integer> supplies;
	private int fuel;
	
	public SpaceStation() {
		supplies = new HashMap<String, Integer>();
		fuel = 0;
	}
	
	public void runSensors() {
		System.out.println("----- Sensor Action -----");
		System.out.println("Running Sesnsors!");
	}
	
	public void loadSupplies(String type, int quantity) {
		System.out.println("----- Loading supplies -----");
		System.out.println("Loading " + quantity + " of " + type);
		
		int newQuantity = supplies.get(type) + quantity;
		supplies.put(type, newQuantity);
	}
	
	public void useSupplies(String type, int quantity) {
		System.out.println("----- Use supplies -----");
		System.out.println("Using " + quantity + " of  " + type);
		
		// it will extract supplies and will decrease the count for the type
		int newQuantity = supplies.get(type) - quantity;
		supplies.put(type, newQuantity);
	}
	
	public void reportSupplies () {
		System.out.println("----- Report Action -----");
		// TODO print out all the supplies and quantity
		System.out.println();
		for (String supplyType: supplies.keySet()) {
			System.out.println(supplyType + ": " + supplies.get(supplyType));
		}
	}
	
	public void loadFuel(int quantity) {
		System.out.println("----- Load Fuel -----");

		System.out.println();
		System.out.println("Loading " + quantity + " of fule");
		fuel += quantity;
	}
	
	public void reportFuel() {
		System.out.println("----- Report Fule -----");
		System.out.println();
		
		System.out.println("Fuel: " + fuel);
	}
	
	public void activateThruster() {
		System.out.println("----- Activate Thruster -----");
		System.out.println();
		
		if (fuel > 10) {
			fuel -= 10;
			System.out.println("Thruster activated!"); 
		} else {
			System.out.println("Thruster Error: Insuficient fuel");
		}
		
		System.out.println("10 fuel used");
	}
}
