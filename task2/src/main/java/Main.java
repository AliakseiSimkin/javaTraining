import ElectricalAppliances.AudioVideo.TV.TV;
import ElectricalAppliances.CleaningDevice.Dry.HairDryer.HairDryer;
import ElectricalAppliances.CleaningDevice.Dry.VacuumCleaner.VacuumCleaner;
import ElectricalAppliances.ElectricalAppliances;
import ElectricalAppliances.HeatingDevices.Coolers.Frigde.Fridge;
import ElectricalAppliances.HeatingDevices.Heaters.Heater.Heater;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HairDryer myHairDryer = new HairDryer(300, "red", true, 400, true, 220, 2, 75, 50, 35, 2016 );
        VacuumCleaner myVacuumCleaner = new VacuumCleaner ( "container", 760, 500, "blue", 630, true, 220, 7, 120, 78, 60, 2014);
        Fridge myFridge = new Fridge(-0, 5, "white", true, false, false, 220, 25, 220, 120,95, 2017);
        Heater myHeater = new Heater("infrared", 33, true, true, 220, 7, 160, 45, 38, 2017);
        TV myTV = new TV("LCD", 55, "Full HD", "16:9", false, "none", true, 220, 12, 200, 100, 10, 2015);
        TV myTV2 = new TV("LCD", 43, "Full HD", "16:9", false, "none", false, 220, 12, 200, 100, 10, 2017);

        //Add all devices into ArrayList
        ArrayList<ElectricalAppliances> devicesInRoom = new ArrayList<ElectricalAppliances>();
        addApplianceToList(devicesInRoom, myHairDryer);
        addApplianceToList(devicesInRoom, myVacuumCleaner);
        addApplianceToList(devicesInRoom, myFridge);
        addApplianceToList(devicesInRoom, myHeater);
        addApplianceToList(devicesInRoom, myTV);
        addApplianceToList(devicesInRoom, myTV2);

        //Включить некоторые в розетку (я получаю все девайсы, которые включены в розетку)
        //Create a new ArrayList which contains only power ON devices.
        ArrayList<ElectricalAppliances> powerOnDevices = new ArrayList<ElectricalAppliances>();
        powerOnDevices = getPowerOnDevices(devicesInRoom);

        //Get row separator which depends on user's OS to move the carriage to a new line
        String newLine = System.getProperty("line.separator");

        //Посчитать потребляемую мощность
        //Print all power ON devices
        System.out.print("Devices are ON: ");
        printDevices(powerOnDevices);
        int powerConsumption = calculatePowerConsumption(powerOnDevices); //Get total power consumption from all power ON devices
        System.out.println(newLine + "Power consumed by power ON devices is " + powerConsumption);

        //Провести сортировку приборов в квартире на основе одного из параметров.
        //Sort devices by Release Date.
        ArrayList<ElectricalAppliances> sortedDevices = new ArrayList<ElectricalAppliances>(devicesInRoom);
        System.out.println("Sorting all devices by their Release Date ");
        sortedDevices = sortByReleaseDate(devicesInRoom);
        printDevicesReleaseDate(sortedDevices);

        //Найти прибор в квартире, соответствующий заданному диапазону параметров.
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
