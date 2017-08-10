package ElectricalAppliances;

public abstract class ElectricalAppliances {
    protected boolean power;
    protected int voltagePower;
    protected double weight;
    protected double length;
    protected double width;
    protected double thickness;
    protected int releaseDate;
    protected boolean bulkyItem;

    public ElectricalAppliances(boolean power, int voltagePower, double weight, double length, double width, double thickness, int releaseDate) {
        this.power = power;
        this.voltagePower = voltagePower;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.thickness = thickness;
        this.releaseDate = releaseDate;
        this.bulkyItem = bulkyItemEvaluation(weight, length, width, thickness);
    }

    public void setPower (boolean power) {
        this.power = power;
    }
    public boolean getPower () {
        return this.power;
    }

    public void setWeight (double weight) {
        this.weight = weight;
    }
    public double getWeight () {
        return this.weight;
    }

    public void setLength (double length) {
        this.length = length;
    }
    public double getLength () {
        return this.length;
    }

    public void setWidth (int width) {
        this.width = width;
    }
    public double getWidth () {
        return this.width;
    }

    public void setThickness (double thickness) {
        this.thickness = thickness;
    }
    public double getThickness () {
        return this.thickness;
    }

    public boolean bulkyItemEvaluation (double weight, double length, double width, double thickness) {
        if (weight > 10 || length > 100 || width > 100 || thickness > 100) {
            return true;
        } else
            return false;
    }
    public boolean getBulkyItem () {
        return this.bulkyItem;
    }
}

