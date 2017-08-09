package javaTasks.task2.Electrical_Appliances.main;

/**
 * Created by BloodyPoSTaL on 08.08.2017.
 */
public class Fridge extends Coolers implements ChangeTemperature {
    protected int minTemperature;
    protected int maxTemperature;
    protected String caseColor;
    boolean freezer;
    protected int currentTemperature;

    public Fridge (int minTemperature, int maxTemperature, String caseColor, boolean freezer) {
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
        this.caseColor = caseColor;
        this.freezer = freezer;
        this.currentTemperature = 5;

        if (freezer == true) {
            int freezerMinTemperature = -15;
            int freezerMaxTemperature = -5;
        }

        this.weight = 5;
        this.length = 77;
        this.width = 55;
        this.thickness = 98;
        bulkyItemEvaluation(weight, length, width, thickness);
        System.out.println(getBulkyItem());
    }

    public void temperatureUp (int currentTemperature) {

    }

    public void temperatureDown (int currentTemperature) {

    }


}
