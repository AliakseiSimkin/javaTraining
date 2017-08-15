package electricalAppliances.audioVideo.tv;

import electricalAppliances.audioVideo.AudioVideo;
import electricalAppliances.audioVideo.ChangeVolume;

public class TV extends AudioVideo implements ChangeVolume {
    protected String tvType; //LCD TV, analog TV, etc
    protected int screenDiagonal; //43, 45, 55, etc (length in inches)
    protected String screenResolution; //HD, FullHD, UHD, 1920x1080, etc
    protected String aspectRatio; //4:3, 16:9, etc
    protected boolean smartTV; //Does TV support smartTV or not?
    protected String smartTvType; // if smartTV is true - LG webOS  (3.0), AppleTV, etc

    public TV(String company, String model, int releaseDate, int voltagePower, double weight, double length, double width, double thickness,
              boolean power, String tvType, int screenDiagonal, String screenResolution, String aspectRatio,
              boolean smartTV, String smartTvType) {
        super(company, model, releaseDate, voltagePower, weight, length, width, thickness, power);

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

    public String getTvType() {
        return tvType;
    }
    public void setTvType(String tvType) {
        this.tvType = tvType;
    }

    public int getScreenDiagonal() {
        return screenDiagonal;
    }
    public void setScreenDiagonal(int screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public String getScreenResolution() {
        return screenResolution;
    }
    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public String getAspectRatio() {
        return aspectRatio;
    }
    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public void setSmartTV(boolean smartTV) {
        this.smartTV = smartTV;
    }

    public String getSmartTvType() {
        return smartTvType;
    }
    public void setSmartTvType(String smartTvType) {
        this.smartTvType = smartTvType;
    }

    @Override
    public void volumeUp(int volume) {
        /* some implementation */
    }

    @Override
    public void volumeDown(int volume) {
        /* some implementation */
    }

    @Override
    public String toString() {
        return "This TV is a the property of " + company + " company and its model is " + model + ". This TV has following up-to-date features: tvType - "
                + tvType + " and screenDiagonal - " + screenDiagonal;
    }
}
