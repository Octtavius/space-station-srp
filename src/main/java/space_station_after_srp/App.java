package space_station_after_srp;

import space_station_after_srp.SpaceStation;

/**
 * Single responsibility principle
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SpaceStation spaceStation = new SpaceStation();
        
        spaceStation.sensors.runSensors();
        
        spaceStation.supplyHold.loadSupplies("Food", 2000);
        spaceStation.supplyReporter.printReport();
    }
}
