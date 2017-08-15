package electricalAppliances;

public abstract class ElectricalAppliances {
    protected String company;
    protected String model;
    protected int releaseDate;
    protected int voltagePower;
    protected double weight;
    protected double length;
    protected double width;
    protected double thickness;
    protected boolean bulkyItem;
    protected boolean power;

    public ElectricalAppliances(String company, String model, int releaseDate, int voltagePower, double weight, double length, double width,
                                double thickness, boolean power) {
        this.company = company;
        this.model = model;
        this.releaseDate = releaseDate;
        this.voltagePower = voltagePower;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.thickness = thickness;
        this.bulkyItem = setBulkyItem(weight, length, width, thickness);
        this.power = power;
    }

    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public int getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getVoltagePower() {
        return voltagePower;
    }
    public void setVoltagePower(int voltagePower) {
        this.voltagePower = voltagePower;
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

    public boolean setBulkyItem (double weight, double length, double width, double thickness) {
        if (weight > 10 || length > 100 || width > 100 || thickness > 100) {
            return true;
        } else
            return false;
    }
    public boolean getBulkyItem () {
        return this.bulkyItem;
    }

    public void setPower (boolean power) {
        this.power = power;
    }
    public boolean getPower () {
        return this.power;
    }
}