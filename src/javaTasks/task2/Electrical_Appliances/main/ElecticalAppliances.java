package javaTasks.task2.Electrical_Appliances.main;

/**
 * Created by BloodyPoSTaL on 07.08.2017.
 */
abstract class ElecticalAppliances {
    protected boolean power;
    protected int weight;
    protected int length;
    protected int width;
    protected int thickness;
    protected boolean bulkyItem;





    public void setPower (boolean power) {
        this.power = power;
    }
    public boolean getPower () {
        return this.power;
    }

    public void setWeight (int weight) {
        this.weight = weight;
    }
    public int getWeight () {
        return this.weight;
    }

    public void setLength (int length) {
        this.length = length;
    }
    public int getLength () {
        return this.length;
    }

    public void setWidth (int width) {
        this.width = width;
    }
    public int getWidth () {
        return this.width;
    }

    public void setThickness (int thickness) {
        this.thickness = thickness;
    }
    public int getThickness () {
        return this.thickness;
    }

    public void bulkyItemEvaluation (int weight, int length, int width, int thickness) {
        if (weight > 10 || length > 100 || width > 100 || thickness > 100) {
            this.bulkyItem = true;
        } else
            this.bulkyItem = false;
    }
    public boolean getBulkyItem () {
        return this.bulkyItem;
    }
}

