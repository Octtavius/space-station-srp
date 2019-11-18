package space_station_after_srp;

public class SupplyReporter extends Reporter{

	private SupplyHold supplyHold;
	
	public SupplyReporter(SupplyHold supplyHold) {
		this.supplyHold = supplyHold;
	}
	
	@Override
	void printReport() {
		System.out.println("----- Report Action -----");
		// TODO print out all the supplies and quantity
		System.out.println();
		for (String supplyType: supplyHold.getSupplies().keySet()) {
			System.out.println(supplyType + ": " + supplyHold.getSupplies().get(supplyType));
		}
	}

}
