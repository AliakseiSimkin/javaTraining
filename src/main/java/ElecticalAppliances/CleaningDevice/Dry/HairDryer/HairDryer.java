package ElecticalAppliances.CleaningDevice.Dry.HairDryer;


public class HairDryer extends Dry implements AirForceAdjustment {
    protected int hairDryerPower;
    protected String caseColor;
    protected boolean coldAir;



    public HairDryer (int hairDryerPower, String caseColor) {

        this.hairDryerPower = hairDryerPower;
        this.caseColor = caseColor;

        this.weight = 5;
        this.length = 77;
        this.width = 55;
        this.thickness = 98;
        bulkyItemEvaluation(weight, length, width, thickness);
        System.out.println(getBulkyItem());

        setAirForce(speed);
    }















    public void setColdAir (boolean coldAir) {
        this.coldAir = coldAir;
    }
    public boolean getColdAir () {
        return this.coldAir;
    }

    public void setAirForce (int speed) {
        this.speed = speed;
    }
}
