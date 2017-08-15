package electricalAppliances.cleaningDevice.dry;

import electricalAppliances.cleaningDevice.CleaningDevice;


public abstract class Dry extends CleaningDevice {

    public Dry(String company, String model, int releaseDate, int voltagePower, double weight, double length, double width,
               double thickness, boolean power, int speed) {
        super(company, model, releaseDate, voltagePower, weight, length, width, thickness, power, speed);
    }
}
