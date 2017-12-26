package electricalAppliances.cleaningDevice.dry.hairDryer;

import electricalAppliances.cleaningDevice.dry.AirForceAdjustment;
import electricalAppliances.cleaningDevice.dry.Dry;
import electricalAppliances.cleaningDevice.dry.DryException;


public class HairDryer extends Dry implements AirForceAdjustment {
    protected int hairDryerPower;
    protected String caseColor;
    protected boolean coldAir;
    protected int blowingPower;

    public HairDryer(String company, String model, int releaseDate, int wattsPower, double weight, double length, double width,
                     double thickness, boolean power, int speed, int hairDryerPower, String caseColor, boolean coldAir, int blowingPower) {
        super(company, model, releaseDate, wattsPower, weight, length, width, thickness, power, speed);

        this.hairDryerPower = hairDryerPower;
        this.caseColor = caseColor;
        this.blowingPower = blowingPower;
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
        /* some implementation, e.g. suctionPiwer = speed; */
        try {
            if (blowingPower < 0)
                throw new DryException("suction power can not be less than 0");
        } catch (DryException ex) {
            System.out.println("suction power will be set to 0");
            blowingPower = 0;
        }
    }

    @Override
    public String toString() {
         return "HairDryer was produced by " + company + " company, model - " + model + ", Release Date - " + releaseDate + ", wattsPower - " + wattsPower;
    }
}
