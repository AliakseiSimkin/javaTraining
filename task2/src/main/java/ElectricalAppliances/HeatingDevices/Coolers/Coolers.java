package ElectricalAppliances.HeatingDevices.Coolers;

import ElectricalAppliances.HeatingDevices.HeatingDevices;

public abstract class Coolers extends HeatingDevices {

    public Coolers(boolean heatingType, boolean power, int voltagePower, double weight, double length, double width, double thickness, int releaseDate) {
        super(false, power, voltagePower, weight, length, width, thickness, releaseDate);

    }
}
