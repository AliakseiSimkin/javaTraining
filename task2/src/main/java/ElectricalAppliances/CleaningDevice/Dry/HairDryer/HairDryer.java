package ElectricalAppliances.CleaningDevice.Dry.HairDryer;

import ElectricalAppliances.CleaningDevice.Dry.AirForceAdjustment;
import ElectricalAppliances.CleaningDevice.Dry.Dry;


public class HairDryer extends Dry implements AirForceAdjustment {
    protected int hairDryerPower;
    protected String caseColor;
    protected boolean coldAir;

    public HairDryer(int hairDryerPower, String caseColor, boolean coldAir, int speed, boolean power, int voltagePower, double weight, double length, double width, double thickness, int releaseDate) {
        super(speed, power, voltagePower, weight, length, width, thickness, releaseDate);

        this.hairDryerPower = hairDryerPower;
        this.caseColor = caseColor;

        bulkyItemEvaluation(weight, length, width, thickness);
    }


    public void setColdAir (boolean coldAir) {
        this.coldAir = coldAir;
    }
    public boolean getColdAir () {
        return this.coldAir;
    }

    public void setAirForce(int speed) {

    }

    public String toString() {
         return "HairDryer with parameters: hairDryerPower - " + this.hairDryerPower + ", caseColor - " + this.caseColor;
    }
}
