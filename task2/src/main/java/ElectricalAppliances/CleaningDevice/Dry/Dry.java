package ElectricalAppliances.CleaningDevice.Dry;

import ElectricalAppliances.CleaningDevice.CleaningDevice;

public abstract class Dry extends CleaningDevice {

    public Dry(int speed, boolean power, int voltagePower, double weight, double length, double width, double thickness, int releaseDate) {
        super(speed, power, voltagePower, weight, length, width, thickness, releaseDate);
    }
}
