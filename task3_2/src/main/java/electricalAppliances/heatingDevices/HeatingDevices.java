package electricalAppliances.heatingDevices;

import electricalAppliances.ElectricalAppliances;


public abstract class HeatingDevices extends ElectricalAppliances {
    protected boolean heatingType;

    public HeatingDevices(String company, String model, int releaseDate, int wattsPower, double weight, double length, double width,
                          double thickness, boolean power, boolean heatingType) {
        super(company, model, releaseDate, wattsPower, weight, length, width, thickness, power);
        this.heatingType = heatingType;
    }

    public void setHeatingType (boolean heatingType) {
        this.heatingType = heatingType;
    }
    public boolean getHeatingType () {
        return this.heatingType;
    }

}
