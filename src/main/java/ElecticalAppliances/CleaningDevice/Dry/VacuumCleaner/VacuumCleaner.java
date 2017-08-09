package ElecticalAppliances.CleaningDevice.Dry.VacuumCleaner;


import ElecticalAppliances.CleaningDevice.Dry;
import ElecticalAppliances.CleaningDevice.Dry.AirForceAdjustment;

public class VacuumCleaner extends Dry implements AirForceAdjustment {
    protected String dustCollector;
    protected int vacuumCleanerPower;
    protected int suctionPower;
    protected String caseColor;

    public VacuumCleaner ( int weight, int length, int width, int thickness, String dustCollector, int vacuumCleanerPower, int suctionPower, String caseColor) {


        this.dustCollector = dustCollector;
        this.vacuumCleanerPower = vacuumCleanerPower;
        this.suctionPower = suctionPower;
        this.caseColor = caseColor;

        bulkyItemEvaluation(weight, length, width, thickness);
        System.out.println(getBulkyItem());

        setAirForce(speed);
    }


    public void setAirForce(int speed) {

    }

}
