package javaTasks.task2.Electrical_Appliances.main;

/**
 * Created by BloodyPoSTaL on 07.08.2017.
 */
abstract class CleaningDevice extends ElecticalAppliances  {
    int speed=0;

    public void setSpeed (int speed) {
        this.speed = speed;
    }
    public int getSpeed () {
        return this.speed;
    }
}
