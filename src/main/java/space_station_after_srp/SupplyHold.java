package space_station_after_srp;

import java.util.HashMap;
import java.util.Map;

public class SupplyHold {

	// type of supply and quantity
	private Map<String, Integer> supplies;
	
	public SupplyHold() {
		supplies = new HashMap<String, Integer>();
	}
		
	public Map<String, Integer> getSupplies() {
		return supplies;
	}

	public void loadSupplies(String type, int quantity) {
		System.out.println("----- Loading supplies -----");
		System.out.println("Loading " + quantity + " of " + type);
		
		Integer currentQuantity = supplies.get(type);
		if (currentQuantity == null) {
			supplies.put(type, quantity);
		} else {			
			int newQuantity = supplies.get(type) + quantity;
			supplies.put(type, newQuantity);
		}
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
}
