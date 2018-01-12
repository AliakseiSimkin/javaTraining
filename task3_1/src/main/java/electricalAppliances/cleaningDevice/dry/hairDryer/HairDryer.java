package electricalAppliances.cleaningDevice.dry.hairDryer;

import electricalAppliances.cleaningDevice.dry.AirForceAdjustment;
import electricalAppliances.cleaningDevice.dry.Dry;
import electricalAppliances.cleaningDevice.dry.DryException;


public class HairDryer extends Dry implements AirForceAdjustment {
    protected int hairDryerPower;
    protected String caseColor;
    protected boolean coldAir;
    protected int blowingPower;
    protected int airTemperature;

    public HairDryer(String company, String model, int releaseDate, int wattsPower, double weight, double length, double width,
                     double thickness, boolean power, int speed, int hairDryerPower, String caseColor, boolean coldAir, int blowingPower, int airTemperature) {
        super(company, model, releaseDate, wattsPower, weight, length, width, thickness, power, speed);

        this.hairDryerPower = hairDryerPower;
        this.caseColor = caseColor;
        this.blowingPower = blowingPower;
        this.airTemperature = airTemperature;
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

    public int getBlowingPower () {
        return blowingPower;
    }
    public void setBlowingPower (int blowingPower) {
        this.blowingPower = blowingPower;
    }

    public int getAirTemperature() {
        return airTemperature;
    }
    public void setAirTemperature(int airTemperature) {
        this.airTemperature = airTemperature;
    }

    public void isTemperatureCorrect (boolean coldAir, int airTemperature) {
        if (coldAir == true && airTemperature > 0 || coldAir == false && airTemperature < 0) {
            System.out.println("Hair Dryer's current temperature and the mode is not matched");
            throw new IllegalStateException();
        }
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
