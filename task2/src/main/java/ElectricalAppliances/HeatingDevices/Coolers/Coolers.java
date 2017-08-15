package electricalAppliances.heatingDevices.coolers;

import electricalAppliances.heatingDevices.HeatingDevices;


public abstract class Coolers extends HeatingDevices {

    public Coolers(String company, String model, int releaseDate, int voltagePower, double weight, double length, double width, double thickness,
                   boolean power, boolean heatingType) {
        super(company, model, releaseDate, voltagePower, weight, length, width, thickness, power, false);

    }
}
