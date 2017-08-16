import electricalAppliances.ElectricalAppliances;
import electricalAppliances.audioVideo.tv.TV;
import electricalAppliances.cleaningDevice.dry.hairDryer.HairDryer;
import electricalAppliances.cleaningDevice.dry.vacuumCleaner.VacuumCleaner;
import electricalAppliances.heatingDevices.coolers.frigde.Fridge;
import electricalAppliances.heatingDevices.heaters.heater.Heater;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HairDryer myHairDryer = new HairDryer("Xiaomi", "XT-Ultra1", 2016, 220, 1.5, 75,
                35, 20, true, 300, 120, "red", true);

        VacuumCleaner myVacuumCleaner = new VacuumCleaner("EPAM", "IoT VC - type 1", 2018, 220, 10,
                115, 75, 40, false, 700, "container", 350, 200,
                "Light Blue");

        Fridge myFridge = new Fridge("Atlant", "Belarus 01", 2017, 220, 28, 200, 115,
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
        devicesInRoom.add(myHairDryer);
        devicesInRoom.add(myVacuumCleaner);
        devicesInRoom.add(myFridge);
        devicesInRoom.add(myHeater);
        devicesInRoom.add(myTV);
        devicesInRoom.add(myTV2);

        //Create an accommodation list to contain all devices in scope of 1 appartment.
        Accommodation myAccommodation = new Accommodation(devicesInRoom);

        //Create a new ArrayList which contains only power ON devices.
        ArrayList<ElectricalAppliances> powerOnDevices = new ArrayList<ElectricalAppliances>();
        powerOnDevices = Accommodation.getPowerOnDevices(myAccommodation.accommodationDevices);

        //Get row separator which depends on user's OS to move the carriage to a new line
        String newLine = System.getProperty("line.separator");

        //Print all power ON devices
        System.out.print("Devices are ON: ");
        Accommodation.printDevices(powerOnDevices);
        int powerConsumption =  Accommodation.calculatePowerConsumption(powerOnDevices); //Get total power consumption from all power ON devices
        System.out.println(newLine + "Power consumed by power ON devices is " + powerConsumption);

        //Sort devices by Release Date.
        ArrayList<ElectricalAppliances> sortedDevices = new ArrayList<ElectricalAppliances>(devicesInRoom);
        System.out.println("Sorting all devices by their Release Date ");
        sortedDevices = Accommodation.sortByReleaseDate(myAccommodation.accommodationDevices);
        Accommodation.sortByReleaseDate(sortedDevices);


        //Find device with POWER ON (true) and BulkyItem (true) parameters
        ArrayList<ElectricalAppliances> powerOnBulkyDevices = Accommodation.findDeviceByPowerAndBulky(myAccommodation.accommodationDevices);
        System.out.println(newLine + "Power ON and Bulky Devices will be printed: ");
        Accommodation.printDevices(powerOnBulkyDevices);
    }
}