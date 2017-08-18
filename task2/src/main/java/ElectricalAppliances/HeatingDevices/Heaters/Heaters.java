package electricalAppliances.heatingDevices.heaters;

import electricalAppliances.heatingDevices.HeatingDevices;


public class Heaters extends HeatingDevices {

    public Heaters(String company, String model, int releaseDate, int wattsPower, double weight, double length, double width, double thickness,
                   boolean power, boolean heatingType) {
        super(company, model, releaseDate, wattsPower, weight, length, width, thickness, power, true);
    }

}
