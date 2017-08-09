package ElectricalAppliances;

public abstract class ElectricalAppliances {
    protected boolean power;
    protected int voltagePower;
    protected int weight;
    protected int length;
    protected int width;
    protected int thickness;
    protected boolean bulkyItem;

    public ElectricalAppliances(boolean power, int voltagePower, int weight, int length, int width, int thickness) {
        this.power = power;
        this.voltagePower = voltagePower;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.thickness = thickness;
        this.bulkyItem = bulkyItemEvaluation(weight, length, width, thickness);
    }

    //protected String releaseDate;


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

    public boolean bulkyItemEvaluation (int weight, int length, int width, int thickness) {
        if (weight > 10 || length > 100 || width > 100 || thickness > 100) {
            return true;
        } else
            return false;

    }
    public boolean getBulkyItem () {
        return this.bulkyItem;
    }
}

