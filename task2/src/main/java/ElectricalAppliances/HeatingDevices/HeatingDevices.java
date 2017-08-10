package ElectricalAppliances.HeatingDevices;

import ElectricalAppliances.ElectricalAppliances;


public abstract class HeatingDevices extends ElectricalAppliances {
    protected boolean heatingType;

    public HeatingDevices(boolean heatingType, boolean power, int voltagePower, double weight, double length, double width, double thickness, int releaseDate) {
        super(power, voltagePower, weight, length, width, thickness, releaseDate);
        this.heatingType = heatingType;
    }

    public void setHeatingType (boolean heatingType) {
        this.heatingType = heatingType;
    }
    public boolean getHeatingType () {
        return this.heatingType;
    }

}
