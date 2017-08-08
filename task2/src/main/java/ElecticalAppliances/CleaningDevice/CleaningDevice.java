package ElecticalAppliances.CleaningDevice;

abstract class CleaningDevice extends  {

    int speed=0;

    public void setSpeed (int speed) {
        this.speed = speed;
    }
    public int getSpeed () {
        return this.speed;
    }
}
