package ElecticalAppliances.HeatingDevices;
import ElecticalAppliances.HeatingDevices.HeatingDevices;

abstract class HeatingDevices extends  {
    protected boolean heatingType;

    public void setHeatingType (boolean heatingType) {
        this.heatingType = heatingType;
    }
    public boolean getHeatingType () {
        return this.heatingType;
    }

}
