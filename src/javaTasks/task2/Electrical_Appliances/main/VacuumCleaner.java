package javaTasks.task2.Electrical_Appliances.main;

/**
 * Created by BloodyPoSTaL on 08.08.2017.
 */
public class VacuumCleaner extends Dry implements AirForceAdjustment {
    protected String dustCollector;
    protected int vacuumCleanerPower;
    protected int suctionPower;
    protected String caseColor;

    public VacuumCleaner (String dustCollector, int vacuumCleanerPower, int suctionPower, String caseColor) {
        this.dustCollector = dustCollector;
        this.vacuumCleanerPower = vacuumCleanerPower;
        this.suctionPower = suctionPower;
        this.caseColor = caseColor;

        this.weight = 5;
        this.length = 77;
        this.width = 55;
        this.thickness = 98;

        bulkyItemEvaluation(weight, length, width, thickness);
        System.out.println(getBulkyItem());

        setAirForce(speed);
    }


    public void setAirForce(int speed) {

    }

}
