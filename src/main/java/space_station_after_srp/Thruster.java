package space_station_after_srp;

public class Thruster {

	private static final int FUEL_PER_THRUST = 10;
	private FuelTank fuelTank;
	
	public Thruster(FuelTank fuelThank) {
		this.fuelTank = fuelThank;
	}
	
	public void activateThruster() {
		System.out.println("----- Activate Thruster -----");
		System.out.println();
		
		if (fuelTank.getFuelLevel() > 10) {
			System.out.println("Thruster activated!");
			fuelTank.useFuel(FUEL_PER_THRUST);
		} else {
			System.out.println("Thruster Error: Insuficient fuel");
		}
		
		System.out.println("10 fuel used");
	}
}
