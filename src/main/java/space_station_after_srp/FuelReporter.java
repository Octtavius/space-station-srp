package space_station_after_srp;

public class FuelReporter extends Reporter{

	FuelTank fuelTank;
	
	public FuelReporter(FuelTank fuelTank) {
		this.fuelTank = fuelTank;
	}
	
	@Override
	void printReport() {
		System.out.println("----- Report Fule -----");
		System.out.println();
		
		System.out.println("Fuel: " + fuelTank);
	}

}
