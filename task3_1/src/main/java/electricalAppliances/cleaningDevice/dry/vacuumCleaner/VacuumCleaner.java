package electricalAppliances.cleaningDevice.dry.vacuumCleaner;

import electricalAppliances.cleaningDevice.dry.AirForceAdjustment;
import electricalAppliances.cleaningDevice.dry.Dry;
import electricalAppliances.cleaningDevice.dry.DryException;


public class VacuumCleaner extends Dry implements AirForceAdjustment {
    protected String dustCollector;
    protected int vacuumCleanerPower;
    protected int suctionPower;
    protected String caseColor;

    public VacuumCleaner(String company, String model, int releaseDate, int wattsPower, double weight, double length, double width,
                         double thickness, boolean power, int speed, String dustCollector, int vacuumCleanerPower, int suctionPower, String caseColor) {
        super(company, model, releaseDate, wattsPower, weight, length, width, thickness, power, speed);

        this.dustCollector = dustCollector;
        this.vacuumCleanerPower = vacuumCleanerPower;
        this.suctionPower = suctionPower;
        this.caseColor = caseColor;
    }

    public String getDustCollector() {
        return dustCollector;
    }
    public void setDustCollector(String dustCollector) {
        this.dustCollector = dustCollector;
    }

    public int getVacuumCleanerPower() {
        return vacuumCleanerPower;
    }
    public void setVacuumCleanerPower(int vacuumCleanerPower) {
        this.vacuumCleanerPower = vacuumCleanerPower;
    }

    public int getSuctionPower() {
        return suctionPower;
    }
    public void setSuctionPower(int suctionPower) {
        if (suctionPower < 0) {
            throw new IllegalArgumentException("suction power can not be less than 0");
        }


        this.suctionPower = suctionPower;
    }

    public String getCaseColor() {
        return caseColor;
    }
    public void setCaseColor(String caseColor) {
        this.caseColor = caseColor;
    }

    @Override
    public void setAirForce(int speed) {
        /* some implementation, e.g. suctionPiwer = speed; */
        try {
            if (suctionPower < 0)
                throw new DryException ("suction power can not be less than 0");
        } catch (DryException ex) {
            System.out.println("suction power will be set to 0");
            suctionPower = 0;
        }
    }

    @Override
    public String toString() {
        return "Vacuum Cleaner was produced by " + company + ", model - " + model + ", Release Date - " + releaseDate + ", watts power - " + wattsPower;
    }
}
