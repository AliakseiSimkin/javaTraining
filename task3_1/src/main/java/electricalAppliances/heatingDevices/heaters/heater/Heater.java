package electricalAppliances.heatingDevices.heaters.heater;

import electricalAppliances.heatingDevices.ChangeTemperature;
import electricalAppliances.heatingDevices.HeatingDevicesException;
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

    @Override
    public void temperatureUp(int currentTemperature) {
        /* some implementation */
    }

    @Override
    public void temperatureDown(int currentTemperature) {
        /* some implementation */
        try {
            if (defaultTemperature - currentTemperature <= 0) {
                System.out.println("Min temperature can not be less than 0");
                throw new HeatingDevicesException("current temperature now is less than minimum value - 0");

            }
        } catch  (HeatingDevicesException e) {
            e.getStackTrace();
            e.getCause();
            System.out.println("Set default temperature to 0");
            defaultTemperature = 0;
        }
    }

    @Override
    public String toString() {
        return "Heater company is " + company + ", model - " + model + ", Release Date - " + releaseDate + ", power in watts - " + wattsPower + ".";
    }
}
