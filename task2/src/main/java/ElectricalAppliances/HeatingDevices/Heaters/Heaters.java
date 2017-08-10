package ElectricalAppliances.HeatingDevices.Heaters;

import ElectricalAppliances.HeatingDevices.HeatingDevices;

public abstract class Heaters extends HeatingDevices {

    public Heaters(boolean heatingType, boolean power, int voltagePower, double weight, double length, double width, double thickness, int releaseDate) {
        super(true, power, voltagePower, weight, length, width, thickness, releaseDate);
    }

}
