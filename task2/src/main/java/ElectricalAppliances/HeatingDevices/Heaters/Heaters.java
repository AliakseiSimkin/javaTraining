package electricalAppliances.heatingDevices.heaters;

import electricalAppliances.heatingDevices.HeatingDevices;


public class Heaters extends HeatingDevices {

    public Heaters(String company, String model, int releaseDate, int voltagePower, double weight, double length, double width, double thickness,
                   boolean power, boolean heatingType) {
        super(company, model, releaseDate, voltagePower, weight, length, width, thickness, power, true);
    }

}
