package ElectricalAppliances.AudioVideo.TV;

import ElectricalAppliances.AudioVideo.AudioVideo;
import ElectricalAppliances.AudioVideo.ChangeVolume;

public class TV extends AudioVideo implements ChangeVolume {


    public TV(boolean power, int voltagePower, double weight, double length, double width, double thickness, int releaseDate) {
        super(power, voltagePower, weight, length, width, thickness, releaseDate);
    }

    @Override
    public void volumeUp(int volume) {

    }

    @Override
    public void volumeDown(int volume) {

    }
}
