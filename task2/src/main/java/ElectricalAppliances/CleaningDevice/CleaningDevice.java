package electricalAppliances.cleaningDevice;

import electricalAppliances.ElectricalAppliances;


public abstract class CleaningDevice extends ElectricalAppliances {
    protected int speed;

    public CleaningDevice(String company, String model, int releaseDate, int voltagePower, double weight, double length, double width,
                          double thickness, boolean power, int speed) {
        super(company, model, releaseDate, voltagePower, weight, length, width, thickness, power);
        this.speed = speed;
    }

    public void setSpeed (int speed) {
        this.speed = speed;
    }
    public int getSpeed () {
        return this.speed;
    }
}
