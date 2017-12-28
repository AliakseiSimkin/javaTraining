package electricalAppliances.heatingDevices.heaters.heater;

import Exceptions.HTNegativeTempException;
import electricalAppliances.heatingDevices.ChangeTemperature;
import electricalAppliances.heatingDevices.heaters.Heaters;


public class Heater extends Heaters implements ChangeTemperature {
    protected String heaterType;
    protected int heatingArea;
    protected int defaultTemperature;

    public Heater(String company, String model, int releaseDate, int wattsPower, double weight, double length, double width, double thickness,
                  boolean power, boolean heatingType, String heaterType, int heatingArea, int defaultTemperature) {
        super(company, model, releaseDate, wattsPower, weight, length, width, thickness, power, true);

        this.heaterType = heaterType;
        this.heatingArea = heatingArea;
        this.defaultTemperature = defaultTemperature;
    }

    public String getHeaterType() {
        return heaterType;
    }
    public void setHeaterType(String heaterType) {
        this.heaterType = heaterType;
    }

    public int getHeatingArea() {
        return heatingArea;
    }
    public void setHeatingArea(int heatingArea) {
        this.heatingArea = heatingArea;
    }

    public int getDefaultTemperature() {
        return defaultTemperature;
    }
    public void setDefaultTemperature(int defaultTemperature) {
        this.defaultTemperature = defaultTemperature;
    }

    @Override
    public void temperatureUp(int Temperature) throws HTNegativeTempException {
        /* some implementation */
        if (defaultTemperature - Temperature <= 0) {
            System.out.println("You can not increase temperature by using negative temperature value");
            throw new HTNegativeTempException("You can not increase temperature by using negative temperature value");
        }
    }

    @Override
    public void temperatureDown(int Temperature) throws HTNegativeTempException {
        /* some implementation */
            if (defaultTemperature - Temperature <= 0) {
                System.out.println("You have to use a positive number to set a value for decreasing temperature");
                throw new HTNegativeTempException("You have to use a positive number to set a value for decreasing temperature");
            }
    }

    @Override
    public String toString() {
        return "Heater company is " + company + ", model - " + model + ", Release Date - " + releaseDate + ", power in watts - " + wattsPower + ".";
    }
}
