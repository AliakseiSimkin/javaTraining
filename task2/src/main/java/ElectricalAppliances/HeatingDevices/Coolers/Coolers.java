package electricalAppliances.heatingDevices.coolers;

import electricalAppliances.heatingDevices.HeatingDevices;


public abstract class Coolers extends HeatingDevices {

    public Coolers(String company, String model, int releaseDate, int wattsPower, double weight, double length, double width, double thickness,
                   boolean power, boolean heatingType) {
        super(company, model, releaseDate, wattsPower, weight, length, width, thickness, power, false);

    }
}
