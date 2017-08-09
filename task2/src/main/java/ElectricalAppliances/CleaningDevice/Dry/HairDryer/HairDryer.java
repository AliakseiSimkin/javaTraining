package ElectricalAppliances.CleaningDevice.Dry.HairDryer;

import ElectricalAppliances.CleaningDevice.Dry.AirForceAdjustment;
import ElectricalAppliances.CleaningDevice.Dry.Dry;


public class HairDryer extends Dry implements AirForceAdjustment {
    protected int hairDryerPower;
    protected String caseColor;
    protected boolean coldAir;

    public HairDryer(int hairDryerPower, String caseColor, boolean coldAir, int speed, boolean power, int voltagePower, int weight, int length, int width, int thickness) {
        super(speed, power, voltagePower, weight, length, width, thickness);

        this.hairDryerPower = hairDryerPower;
        this.caseColor = caseColor;

        bulkyItemEvaluation(weight, length, width, thickness);
        System.out.println(getBulkyItem());
    }


    public void setColdAir (boolean coldAir) {
        this.coldAir = coldAir;
    }
    public boolean getColdAir () {
        return this.coldAir;
    }

    public void setAirForce(int speed) {

    }
}
