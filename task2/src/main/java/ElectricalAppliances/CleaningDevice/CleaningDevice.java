package ElectricalAppliances.CleaningDevice;

import ElectricalAppliances.ElectricalAppliances;


public abstract class CleaningDevice extends ElectricalAppliances {
    int speed;

    public CleaningDevice(int speed, boolean power, int voltagePower, int weight, int length, int width, int thickness) {
        super(power, voltagePower, weight, length, width, thickness);
        this.speed = speed;
    }

    public void setSpeed (int speed) {
        this.speed = speed;
    }
    public int getSpeed () {
        return this.speed;
    }
}
