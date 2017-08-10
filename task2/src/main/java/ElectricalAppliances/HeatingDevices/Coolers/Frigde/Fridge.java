package ElectricalAppliances.HeatingDevices.Coolers.Frigde;

import ElectricalAppliances.HeatingDevices.ChangeTemperature;
import ElectricalAppliances.HeatingDevices.Coolers.Coolers;


public class Fridge extends Coolers implements ChangeTemperature {
    protected int minTemperature;
    protected int maxTemperature;
    protected String caseColor;
    boolean freezer;
    protected int currentTemperature;

    public Fridge(int minTemperature, int maxTemperature, String caseColor, boolean freezer, boolean heatingType, boolean power, int voltagePower, double weight, double length, double width, double thickness, int releaseDate) {
        super(true, power, voltagePower, weight, length, width, thickness, releaseDate);

        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
        this.caseColor = caseColor;
        this.freezer = freezer;
        this.currentTemperature = 5;

        if (freezer == true) {
            int freezerMinTemperature = -15;
            int freezerMaxTemperature = -5;
        }
    }

    public void temperatureUp (int currentTemperature) {

    }

    public void temperatureDown (int currentTemperature) {

    }


}
