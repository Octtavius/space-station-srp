package space_station_after_srp;

public class SpaceStation {

	public FuelTank fuelTank;
	public SupplyHold supplyHold;
	public Thruster thruster;
	public Sensors sensors;
	public SupplyReporter supplyReporter;
	public FuelReporter fuelReporter;
	
	public SpaceStation () {
		this.fuelTank = new FuelTank();
		this.supplyHold = new SupplyHold();
		this.thruster = new Thruster(fuelTank);
		this.sensors = new Sensors();
		this.supplyReporter = new SupplyReporter(supplyHold);
		this.fuelReporter = new FuelReporter(fuelTank);
	}
}
