package ElectricalAppliances.CleaningDevice.Dry;

import ElectricalAppliances.CleaningDevice.CleaningDevice;

public abstract class Dry extends CleaningDevice {

    public Dry(int speed, boolean power, int voltagePower, int weight, int length, int width, int thickness) {
        super(speed, power, voltagePower, weight, length, width, thickness);
    }
}
