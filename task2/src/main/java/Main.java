import ElectricalAppliances.AudioVideo.TV.TV;
import ElectricalAppliances.CleaningDevice.Dry.HairDryer.HairDryer;
import ElectricalAppliances.CleaningDevice.Dry.VacuumCleaner.VacuumCleaner;
import ElectricalAppliances.HeatingDevices.Coolers.Frigde.Fridge;
import ElectricalAppliances.HeatingDevices.Heaters.Heater.Heater;

public class Main {
    public static void main(String[] args) {
        HairDryer myHairDryer = new HairDryer(300, "red", true, 400, true, 220, 2, 75, 50, 35, 2016 );
        VacuumCleaner myVacuumCleaner = new VacuumCleaner ( "container", 760, 500, "blue", 630, true, 220, 7, 120, 78, 60, 2016);
        Fridge myFridge = new Fridge(-0, 5, "white", true, false, false, 220, 25, 220, 120,95, 2017);
        Heater myHeater = new Heater("infrared", 33, true, true, 220, 7, 160, 45, 38, 2017);
        TV myTV = new TV("LCD", 55, "Full HD", "16:9", false, "none", true, 220, 12, 200, 100, 10, 2017);

        

    }

}
