package javaTasks.task2.Electrical_Appliances.main;

/**
 * Created by BloodyPoSTaL on 08.08.2017.
 */
public class HeatingDevices extends ElecticalAppliances {
    protected boolean heatingType;

    public void setHeatingType (boolean heatingType) {
        this.heatingType = heatingType;
    }
    public boolean getHeatingType () {
        return this.heatingType;
    }

}
