package electricalAppliances.heatingDevices.heaters.heater;

import electricalAppliances.heatingDevices.ChangeTemperature;
import electricalAppliances.heatingDevices.heaters.Heaters;


public class Heater extends Heaters implements ChangeTemperature {
    protected String heaterType;
    protected int heatingArea;


    public Heater(String company, String model, int releaseDate, int voltagePower, double weight, double length, double width, double thickness,
                  boolean power, boolean heatingType, String heaterType, int heatingArea) {
        super(company, model, releaseDate, voltagePower, weight, length, width, thickness, power, true);

        this.heaterType = heaterType;
        this.heatingArea = heatingArea;
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
    }

    @Override
    public String toString() {
        return "Heater company is " + company + ", model is " + model + ", and general parameters are: heaterType - " + heaterType
                + ", heatingArea - " + heatingArea;
    }
}
