import Exceptions.AudioVideoMaxVolumeException;
import Exceptions.AudioVideoMinVolumeException;
import Exceptions.HTNegativeTempException;
import electricalAppliances.ElectricalAppliances;
import electricalAppliances.audioVideo.tv.TV;
import electricalAppliances.cleaningDevice.dry.hairDryer.HairDryer;
import electricalAppliances.cleaningDevice.dry.vacuumCleaner.VacuumCleaner;
import electricalAppliances.heatingDevices.coolers.frigde.Fridge;
import electricalAppliances.heatingDevices.heaters.heater.Heater;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HairDryer myHairDryer = new HairDryer("Xiaomi", "XT-Ultra1", 2016, 1020, 1.5, 75,
                35, 20, true, 300, 120, "red", true, 50, -2);

        VacuumCleaner myVacuumCleaner = new VacuumCleaner("EPAM", "IoT VC - type 1", 2018, 220, 10,
                115, 75, 40, false, 700, "container", 350, 200,
                "Light Blue");

        Fridge myFridge = new Fridge("Atlant", "Belarus 01", 2017, 220, 28, 200, 115,
                82, true, false, -5, 5, 0, "White",
                true, -15, -5, -8);

        Heater myHeater = new Heater("BelAZ ", "homeTractorEngine_DX4021", 2018, 220, 13, 220,
                113, 66, true, true, "Engine", 120,  25);

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
        powerOnDevices = myAccommodation.getPowerOnDevices();

        //Get row separator which depends on user's OS to move the carriage to a new line
        String newLine = System.getProperty("line.separator");

        //Print all power ON devices
        System.out.print("Devices are ON: ");
        printDevices(powerOnDevices);
        int powerConsumption =  myAccommodation.calculatePowerConsumption(powerOnDevices); //Get total power consumption from all power ON devices
        System.out.println(newLine + "Power consumpted by power ON devices is " + powerConsumption);

        //Sort devices by Release Date.
        ArrayList<ElectricalAppliances> sortedDevices = new ArrayList<ElectricalAppliances>(devicesInRoom);
        System.out.println("Sorting all devices by their Release Date ");
        sortedDevices = myAccommodation.sortByReleaseDate();
        printDevicesByReleaseDate(sortedDevices);

        //Find device with POWER ON (true) and BulkyItem (true) parameters
        ArrayList<ElectricalAppliances> powerOnBulkyDevices = myAccommodation.findDeviceByPowerAndBulky();
        System.out.println(newLine + "Power ON and Bulky Devices will be printed: ");
        printDevices(powerOnBulkyDevices);


        //Task 3.1 - add some exceptions and catch them all!
        //1) Use custom HTNegativeTempException clss - that class is used to warn a user about he can not use negative value for temperature.
        try {
            myHeater.temperatureUp(-5);
        } catch (HTNegativeTempException e) {
            e.printStackTrace();
            myHeater.setDefaultTemperature(0);
        }

        //2) Use custom AudioVideoMaxVolumeException to warn user about maximum volume value can not be above than 100
        try {
            myTV.volumeUp(55);
        } catch (AudioVideoMaxVolumeException e) {
            e.printStackTrace();
            System.out.println("Set current volume value to 100 because it is its maximum");
            myTV.setCurrentVolume(100);
        }

        //3) Use custom AudioVideoMinVolumeException to warn user about minimum volume value can not be under 0
        try {
            myTV2.volumeDown(75);
        } catch (AudioVideoMinVolumeException e) {
            e.printStackTrace();
            System.out.println("Volume value can not be under 0. Set volume value to the minimal one. Now volume value is 0");
            myTV2.setCurrentVolume(0);
        }

        //Use embedded exceptions.
        // 1) ArithmeticException is used in "Fridge" class - emergencyPowerShutdown method
        try {
            myFridge.emergencyPowerShutdown();
        } catch (ArithmeticException e) {
            e.getStackTrace();
            e.getCause();
            myFridge.setCurrentFreezerTemperature(-5);
            System.out.println("Current freezer temperature is -5 degree");
        }

        // 2) IllegalArgumentException - Heater class
        try {
            myHeater.setDefaultTemperature(-7);
        } catch (IllegalArgumentException e) {
            e.getMessage();
            e.getStackTrace();
            System.out.println("Current heater temperature has been set to 0");
            myHeater.setDefaultTemperature(0);

        }

        //3) IllegalArgumentException - TV class
        try {
            myTV2.setCurrentVolume(-23);
        } catch (IllegalArgumentException e) {
            e.getMessage();
            e.getStackTrace();
            e.getClass();
            System.out.println("TV volume can not be less than 0. Current TV volume has been set to 0");
            myTV2.setCurrentVolume(0);
        }

        //4) IllegalStateException - HairDryer class
        try {
            myHairDryer.isTemperatureCorrect(myHairDryer.getColdAir(), myHairDryer.getAirTemperature());
        } catch (IllegalStateException e) {
            e.getStackTrace();
            if (myHairDryer.getColdAir()== true && myHairDryer.getAirTemperature() > 0) {
                myHairDryer.setAirTemperature(-1);
                System.out.println("Default air temperature in cold air mode has been set (-1 degree)");
            }
            if (myHairDryer.getColdAir()== false&& myHairDryer.getAirTemperature() < 0) {
                myHairDryer.setAirTemperature(1);
                System.out.println("Default air temperature in warm air mode has been set (1 degree)");
            }
        }

        //5) IllegalArgumentException - VacuumCLeaner class
        try {
            myVacuumCleaner.setSuctionPower(-63);
        } catch (IllegalArgumentException e) {
            e.getStackTrace();
            System.out.println("VacuumCleaner power has been set to the mininal one - 0");
            myVacuumCleaner.setSuctionPower(0);
        }

    }

    public static void printDevices (ArrayList<ElectricalAppliances> devices) {
        System.out.println("Number of device(s) - " + devices.size());
        for (ElectricalAppliances printDevices : devices) {
            System.out.println(printDevices);
        }
        System.out.println();
    }

    public static void printDevicesByReleaseDate(ArrayList<ElectricalAppliances> devices) {
        for (ElectricalAppliances device : devices) {
            System.out.print(device.getReleaseDate() + " ");
        }
        System.out.println();
    }
}