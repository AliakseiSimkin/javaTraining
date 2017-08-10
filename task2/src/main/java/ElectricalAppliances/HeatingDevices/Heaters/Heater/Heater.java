package ElectricalAppliances.HeatingDevices.Heaters.Heater;

import ElectricalAppliances.HeatingDevices.ChangeTemperature;
import ElectricalAppliances.HeatingDevices.Heaters.Heaters;

public class Heater extends Heaters implements ChangeTemperature {
    protected String heaterType;
    protected int heatingArea;


    public Heater(String heaterType, int heatingArea, boolean heatingType, boolean power, int voltagePower, double weight, double length, double width, double thickness, int releaseDate) {
        super(true, power, voltagePower, weight, length, width, thickness, releaseDate);

        this.heaterType = heaterType;
        this.heatingArea = heatingArea;
    }

    @Override
    public void temperatureUp(int currentTemperature) {

    }

    @Override
    public void temperatureDown(int currentTemperature) {

    }
}
