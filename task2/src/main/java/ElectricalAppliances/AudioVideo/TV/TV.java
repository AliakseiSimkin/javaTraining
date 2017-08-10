package ElectricalAppliances.AudioVideo.TV;

import ElectricalAppliances.AudioVideo.AudioVideo;
import ElectricalAppliances.AudioVideo.ChangeVolume;

public class TV extends AudioVideo implements ChangeVolume {
    protected String tvType; //LCD TV, analog TV, etc
    protected int screenDiagonal; //43, 45, 55, etc (length in inches)
    protected String screenResolution; //HD, FullHD, UHD, 1920x1080, etc
    protected String aspectRatio; //4:3, 16:9, etc
    protected boolean smartTV; //Does TV support smartTV or not?
    protected String smartTvType; // if smartTV is true - LG webOS  (3.0), AppleTV, etc

    public TV(String tvType, int screenDiagonal, String screenResolution, String aspectRatio, boolean smartTV, String smartTvType, boolean power, int voltagePower, double weight, double length, double width, double thickness, int releaseDate) {
        super(power, voltagePower, weight, length, width, thickness, releaseDate);

        this.tvType = tvType;
        this.screenDiagonal = screenDiagonal;
        this.screenResolution = screenResolution;
        this.aspectRatio = aspectRatio;
        this.smartTV = smartTV;

        if (smartTV == true) {
            this.smartTvType = smartTvType;
        } else {
            this.smartTvType = "This TV has no any Smart TV";
        }
    }

    @Override
    public void volumeUp(int volume) {

    }

    @Override
    public void volumeDown(int volume) {

    }
}
