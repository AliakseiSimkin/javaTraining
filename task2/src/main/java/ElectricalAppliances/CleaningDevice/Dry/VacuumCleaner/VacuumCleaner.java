package ElectricalAppliances.CleaningDevice.Dry.VacuumCleaner;

import ElectricalAppliances.CleaningDevice.Dry.AirForceAdjustment;
import ElectricalAppliances.CleaningDevice.Dry.Dry;


public class VacuumCleaner extends Dry implements AirForceAdjustment {
    protected String dustCollector;
    protected int vacuumCleanerPower;
    protected int suctionPower;
    protected String caseColor;

    public VacuumCleaner(String dustCollector, int vacuumCleanerPower, int suctionPower, String caseColor, int speed, boolean power, int voltagePower, int weight, int length, int width, int thickness) {
        super(speed, power, voltagePower, weight, length, width, thickness);

        this.dustCollector = dustCollector;
        this.vacuumCleanerPower = vacuumCleanerPower;
        this.suctionPower = suctionPower;
        this.caseColor = caseColor;

        System.out.println(getBulkyItem());
    }


    public void setAirForce(int speed) {

    }

}
