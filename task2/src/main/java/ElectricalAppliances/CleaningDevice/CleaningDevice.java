package ElectricalAppliances.CleaningDevice;

import ElectricalAppliances.ElectricalAppliances;


public abstract class CleaningDevice extends ElectricalAppliances {
    int speed;

    public CleaningDevice(int speed, boolean power, int voltagePower, double weight, double length, double width, double thickness, int releaseDate) {
        super(power, voltagePower, weight, length, width, thickness, releaseDate);
        this.speed = speed;
    }

    public void setSpeed (int speed) {
        this.speed = speed;
    }
    public int getSpeed () {
        return this.speed;
    }
}
