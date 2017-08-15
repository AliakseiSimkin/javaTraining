package electricalAppliances.audioVideo;

import electricalAppliances.ElectricalAppliances;


public class AudioVideo extends ElectricalAppliances {

    public AudioVideo(String company, String model, int releaseDate, int voltagePower, double weight, double length, double width, double thickness,
                      boolean power) {
        super(company, model, releaseDate, voltagePower, weight, length, width, thickness, power);
    }
}
