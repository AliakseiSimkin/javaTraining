package ElectricalAppliances.HeatingDevices;

import ElectricalAppliances.ElectricalAppliances;


public abstract class HeatingDevices extends ElectricalAppliances {
    protected boolean heatingType;

    public HeatingDevices(boolean heatingType, boolean power, int voltagePower, int weight, int length, int width, int thickness) {
        super(power, voltagePower, weight, length, width, thickness);
    }

    public void setHeatingType (boolean heatingType) {
        this.heatingType = heatingType;
    }
    public boolean getHeatingType () {
        return this.heatingType;
    }

}
