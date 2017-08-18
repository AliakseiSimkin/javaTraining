package electricalAppliances.audioVideo;

import electricalAppliances.ElectricalAppliances;


public class AudioVideo extends ElectricalAppliances {

    public AudioVideo(String company, String model, int releaseDate, int wattsPower, double weight, double length, double width, double thickness,
                      boolean power) {
        super(company, model, releaseDate, wattsPower, weight, length, width, thickness, power);
    }
}
