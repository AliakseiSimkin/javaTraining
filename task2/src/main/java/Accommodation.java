import electricalAppliances.ElectricalAppliances;

import java.util.ArrayList;

public class Accommodation {
    protected ArrayList<ElectricalAppliances> accommodationDevices = new ArrayList<ElectricalAppliances>();

    public Accommodation(ArrayList<ElectricalAppliances> devices) {
        this.accommodationDevices = devices;
    }


    public static ArrayList<ElectricalAppliances> getPowerOnDevices(ArrayList<ElectricalAppliances> accommodationDevices) {
        ArrayList<ElectricalAppliances> powerOnDevices = new ArrayList<ElectricalAppliances>();
        for (ElectricalAppliances device : accommodationDevices) {
            if (device.getPower() == true) {
                powerOnDevices.add(device);
            }
        }
        return powerOnDevices;
    }

    public static void printDevices (ArrayList<ElectricalAppliances> devices) {
        System.out.println("Number of device(s) - " + devices.size());
        for (ElectricalAppliances printDevices : devices) {
            System.out.println(printDevices);
        }
        System.out.println();
    }

    public static int calculatePowerConsumption (ArrayList<ElectricalAppliances> devices) {
        int powerConsumption = 0;
        for (ElectricalAppliances device : devices) {
            powerConsumption += device.getVoltagePower();
        }
        return powerConsumption;
    }

    public static ArrayList<ElectricalAppliances> sortByReleaseDate (ArrayList<ElectricalAppliances> devices) {
        ArrayList<ElectricalAppliances> sortedDevices = new ArrayList<ElectricalAppliances>(devices);
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

    public static void printDevicesReleaseDate (ArrayList<ElectricalAppliances> devices) {
        for (ElectricalAppliances device : devices) {
            System.out.print(device.getReleaseDate() + " ");
        }
        System.out.println();
    }

    public static ArrayList<ElectricalAppliances> findDeviceByPowerAndBulky (ArrayList<ElectricalAppliances> devices) {
        ArrayList<ElectricalAppliances> powerOnBulkyDevices = new ArrayList<ElectricalAppliances>();
        for (ElectricalAppliances device : devices) {
            if (device.getPower() == true && device.getBulkyItem() == true) {
                powerOnBulkyDevices.add(device);
            }
        }
        return powerOnBulkyDevices;
    }
}