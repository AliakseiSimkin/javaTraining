package electricalAppliances.cleaningDevice.dry.hairDryer;

import electricalAppliances.cleaningDevice.dry.AirForceAdjustment;
import electricalAppliances.cleaningDevice.dry.Dry;


public class HairDryer extends Dry implements AirForceAdjustment {
    protected int hairDryerPower;
    protected String caseColor;
    protected boolean coldAir;

    public HairDryer(String company, String model, int releaseDate, int wattsPower, double weight, double length, double width,
                     double thickness, boolean power, int speed, int hairDryerPower, String caseColor, boolean coldAir) {
        super(company, model, releaseDate, wattsPower, weight, length, width, thickness, power, speed);

        this.hairDryerPower = hairDryerPower;
        this.caseColor = caseColor;
    }

    public int getHairDryerPower() {
        return hairDryerPower;
    }
    public void setHairDryerPower(int hairDryerPower) {
        this.hairDryerPower = hairDryerPower;
    }

    public String getCaseColor() {
        return caseColor;
    }
    public void setCaseColor(String caseColor) {
        this.caseColor = caseColor;
    }

    public boolean getColdAir () {
        return this.coldAir;
    }
    public void setColdAir (boolean coldAir) {
        this.coldAir = coldAir;
    }

    @Override
    public void setAirForce(int speed) {
        /* some implementation */
    }

    @Override
    public String toString() {
         return "HairDryer was produced by " + company + " company, model - " + model + ", Release Date - " + releaseDate + ", wattsPower - " + wattsPower;
    }
}
