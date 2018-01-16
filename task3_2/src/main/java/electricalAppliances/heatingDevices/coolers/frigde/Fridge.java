package electricalAppliances.heatingDevices.coolers.frigde;

import electricalAppliances.heatingDevices.ChangeTemperature;
import electricalAppliances.heatingDevices.coolers.Coolers;


public class Fridge extends Coolers implements ChangeTemperature {
    protected int minFridgeTemperature;
    protected int maxFridgeTemperature;
    protected String caseColor;
    protected int currentFridgeTemperature;
    protected boolean freezer;
    protected int minFreezerTemperature;
    protected int maxFreezerTemperature;
    protected int currentFreezerTemperature;


    public Fridge(String company, String model, int releaseDate, int wattsPower, double weight, double length,
        double width, double thickness,
        boolean power, boolean heatingType, int minFridgeTemperature, int maxFridgeTemperature,
        int currentFridgeTemperature, String caseColor,
        boolean freezer, int minFreezerTemperature, int maxFreezerTemperature, int currentFreezerTemperature) {
        super(company, model, releaseDate, wattsPower, weight, length, width, thickness, power, false);
            this.minFridgeTemperature = minFridgeTemperature;
            this.maxFridgeTemperature = maxFridgeTemperature;
            this.currentFridgeTemperature = currentFridgeTemperature;
            this.caseColor = caseColor;
            this.freezer = freezer;

            if (freezer == true) {
                this.minFreezerTemperature = minFreezerTemperature;
                this.maxFreezerTemperature = maxFreezerTemperature;
            } else {
                this.minFreezerTemperature = 0;
                this.maxFreezerTemperature = 0;
            }
            this.currentFreezerTemperature = currentFreezerTemperature;
    }

    public int getMinFridgeTemperature() {
        return minFridgeTemperature;
    }
    public void setMinFridgeTemperature(int minFridgeTemperature) {
        this.minFridgeTemperature = minFridgeTemperature;
    }

    public int getMaxFridgeTemperature() {
        return maxFridgeTemperature;
    }
    public void setMaxFridgeTemperature(int maxFridgeTemperature) {
        this.maxFridgeTemperature = maxFridgeTemperature;
    }

    public String getCaseColor() {
        return caseColor;
    }
    public void setCaseColor(String caseColor) {
        this.caseColor = caseColor;
    }

    public boolean getFreezer() {
        return this.freezer;
    }
    public void setFreezer(boolean freezer) {
        this.freezer = freezer;
    }

    public int getCurrentFridgeTemperature() {
        return currentFridgeTemperature;
    }
    public void setCurrentFridgeTemperature(int currentFridgeTemperature) {
        this.currentFridgeTemperature = currentFridgeTemperature;
    }

    public int getMinFreezerTemperature() {
        return minFreezerTemperature;
    }
    public void setMinFreezerTemperature(int minFreezerTemperature) {
        this.minFreezerTemperature = minFreezerTemperature;
    }

    public int getMaxFreezerTemperature() {
        return maxFreezerTemperature;
    }
    public void setMaxFreezerTemperature(int maxFreezerTemperature) {
        this.maxFreezerTemperature = maxFreezerTemperature;
    }

    public int getCurrentFreezerTemperature() {
        return currentFreezerTemperature;
    }
    public void setCurrentFreezerTemperature(int currentFreezerTemperature) {
        this.currentFreezerTemperature = currentFreezerTemperature;
    }

    @Override
    public void temperatureUp (int currentTemperature) {
        /* some implementation */
    }
    @Override
    public void temperatureDown (int currentTemperature) {
        /* some implementation */
    }

    public void emergencyPowerShutdown () {
        if (currentFridgeTemperature == 0) {
            new ArithmeticException("Current Fridge temperature can not be 0");
        }
        currentFreezerTemperature = currentFreezerTemperature / currentFridgeTemperature;
    }

    @Override
    public String toString() {
        return "Fridge company is " + company + ", model - " + model + ", Release Date - " + releaseDate + ", power in watts - " + wattsPower;
    }
}
