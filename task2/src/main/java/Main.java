import electricalAppliances.ElectricalAppliances;
import electricalAppliances.audioVideo.tv.TV;
import electricalAppliances.cleaningDevice.dry.hairDryer.HairDryer;
import electricalAppliances.cleaningDevice.dry.vacuumCleaner.VacuumCleaner;
import electricalAppliances.heatingDevices.coolers.frigde.Fridge;
import electricalAppliances.heatingDevices.heaters.heater.Heater;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HairDryer myHairDryer = new HairDryer("Xiaomi","XT-Ultra1",2016, 220, 1.5, 75,
        35, 20, true, 300, 120, "red", true);

        VacuumCleaner myVacuumCleaner = new VacuumCleaner ("EPAM", "IoT VC - type 1", 2018, 220, 10,
        115, 75, 40, false, 700, "container", 350, 200,
                "Light Blue");

        Fridge myFridge = new Fridge("Atlant", "Belarus 01", 2017, 220, 28, 200,115,
        82, true, false, -5, 5, 0, "White",
        true, -15, -5, -8);

        Heater myHeater = new Heater("BelAZ ", "homeTractorEngine_DX4021", 2018, 220, 13, 220,
        113, 66, true, true, "Engine", 120);

        TV myTV = new TV("Sony", "XperiaTV TU2", 2016, 220, 8, 330, 150, 10,
        false, "LCD", 83, "UHD", "16:9", true, "AndroidTV");

        TV myTV2 = new TV("Sharp", "TVs P9", 2017, 220, 12, 120, 70, 40,
                true, "Analog TV", 27, "320:160", "4:3", false, "There is no smartTV");

        //Add all devices into ArrayList
        ArrayList<ElectricalAppliances> devicesInRoom = new ArrayList<ElectricalAppliances>();
        addApplianceToList(devicesInRoom, myHairDryer);
        addApplianceToList(devicesInRoom, myVacuumCleaner);
        addApplianceToList(devicesInRoom, myFridge);
        addApplianceToList(devicesInRoom, myHeater);
        addApplianceToList(devicesInRoom, myTV);
        addApplianceToList(devicesInRoom, myTV2);

        //Create a new ArrayList which contains only power ON devices.
        ArrayList<ElectricalAppliances> powerOnDevices = new ArrayList<ElectricalAppliances>();
        powerOnDevices = getPowerOnDevices(devicesInRoom);

        //Get row separator which depends on user's OS to move the carriage to a new line
        String newLine = System.getProperty("line.separator");

        //Print all power ON devices
        System.out.print("Devices are ON: ");
        printDevices(powerOnDevices);
        int powerConsumption = calculatePowerConsumption(powerOnDevices); //Get total power consumption from all power ON devices
        System.out.println(newLine + "Power consumed by power ON devices is " + powerConsumption);

        //Sort devices by Release Date.
        ArrayList<ElectricalAppliances> sortedDevices = new ArrayList<ElectricalAppliances>(devicesInRoom);
        System.out.println("Sorting all devices by their Release Date ");
        sortedDevices = sortByReleaseDate(devicesInRoom);
        printDevicesReleaseDate(sortedDevices);

        //Find device with POWER ON (true) and BulkyItem (true) parameters
        ArrayList<ElectricalAppliances> powerOnBulkyDevices = findDeviceByPowerAndBulky (devicesInRoom);
        System.out.println(newLine + "Power ON and Bulky Devices will be printed: ");
        printDevices(powerOnBulkyDevices);

    }








    public static void addApplianceToList (ArrayList<ElectricalAppliances> devicesInRoom, ElectricalAppliances device) { devicesInRoom.add(device); }

    public static ArrayList<ElectricalAppliances> getPowerOnDevices (ArrayList<ElectricalAppliances> devicesInRoom) {
        ArrayList<ElectricalAppliances> powerOnDevices = new ArrayList<ElectricalAppliances>();
        for (ElectricalAppliances device : devicesInRoom) {
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

    private static ArrayList<ElectricalAppliances> findDeviceByPowerAndBulky (ArrayList<ElectricalAppliances> devices) {
        ArrayList<ElectricalAppliances> powerOnBulkyDevices = new ArrayList<ElectricalAppliances>();
        for (ElectricalAppliances device : devices) {
            if (device.getPower() == true && device.getBulkyItem() == true) {
                powerOnBulkyDevices.add(device);
            }
        }
        return powerOnBulkyDevices;
    }


}
