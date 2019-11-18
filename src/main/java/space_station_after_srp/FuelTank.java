package space_station_after_srp;

public class FuelTank {
	
	private int fuel;

	
	public FuelTank() {
		fuel = 0;
	}
	
	public void loadFuel(int quantity) {
		System.out.println("----- Load Fuel -----");

		System.out.println();
		System.out.println("Loading " + quantity + " of fule");
		fuel += quantity;
	}

	public int getFuelLevel() {
		return fuel;
	}
	
	public void useFuel(int fuelQuantity) {
		fuelQuantity -= fuelQuantity;
	}
}
