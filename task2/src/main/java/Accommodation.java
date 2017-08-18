import electricalAppliances.ElectricalAppliances;

import java.util.ArrayList;

public class Accommodation {
    protected ArrayList<ElectricalAppliances> accommodationDevices = new ArrayList<ElectricalAppliances>();

    public Accommodation(ArrayList<ElectricalAppliances> devices) {
        this.accommodationDevices = devices;
    }


    public ArrayList<ElectricalAppliances> getPowerOnDevices() {
        ArrayList<ElectricalAppliances> powerOnDevices = new ArrayList<ElectricalAppliances>();
        for (ElectricalAppliances device : this.accommodationDevices) {
            if (device.getPower() == true) {
                powerOnDevices.add(device);
            }
        }
        return powerOnDevices;
    }

    public void print() {
        System.out.println("Number of device(s) - " + this.accommodationDevices.size());
        for (ElectricalAppliances printDevices : this.accommodationDevices) {
            System.out.println(printDevices);
        }
        System.out.println();
    }

    public int calculatePowerConsumption (ArrayList<ElectricalAppliances> devices) {
        int powerConsumption = 0;
        for (ElectricalAppliances device : devices) {
            powerConsumption += device.getVoltagePower();
        }
        return powerConsumption;
    }

    public void printAccommDevicesByReleaseDate() {
        for (ElectricalAppliances device : this.accommodationDevices) {
            System.out.print(device.getReleaseDate() + " ");
        }
        System.out.println();
    }

    public ArrayList<ElectricalAppliances> sortByReleaseDate () {
        ArrayList<ElectricalAppliances> sortedDevices = new ArrayList<ElectricalAppliances>(this.accommodationDevices);
        ElectricalAppliances tmp;
        for (int i = sortedDevices.size()-1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (sortedDevices.get(j).getReleaseDate() > sortedDevices.get(j+1).getReleaseDate()) {
                    tmp = sortedDevices.get(j);
                    sortedDevices.add(j,  sortedDevices.get(j+1));
                    sortedDevices.remove (j+1);
                    sortedDevices.add(j+1, tmp);
                    sortedDevices.remove(j+2);
                }
            }
        }
        return sortedDevices;
    }

    public ArrayList<ElectricalAppliances> findDeviceByPowerAndBulky () {
        ArrayList<ElectricalAppliances> powerOnBulkyDevices = new ArrayList<ElectricalAppliances>();
        for (ElectricalAppliances device : this.accommodationDevices) {
            if (device.getPower() == true && device.getBulkyItem() == true) {
                powerOnBulkyDevices.add(device);
            }
        }
        return powerOnBulkyDevices;
    }
}