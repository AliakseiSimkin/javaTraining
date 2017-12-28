package electricalAppliances.audioVideo.tv;

import Exceptions.AudioVideoMaxVolumeException;
import Exceptions.AudioVideoMinVolumeException;
import electricalAppliances.audioVideo.AudioVideo;
import electricalAppliances.audioVideo.ChangeVolume;

public class TV extends AudioVideo implements ChangeVolume {
    protected String tvType; //LCD TV, analog TV, etc
    protected int screenDiagonal; //43, 45, 55, etc (length in inches)
    protected String screenResolution; //HD, FullHD, UHD, 1920x1080, etc
    protected String aspectRatio; //4:3, 16:9, etc
    protected boolean smartTV; //Does TV support smartTV or not?
    protected String smartTvType; // if smartTV is true - LG webOS  (3.0), AppleTV, etc
    protected int currentVolume; //current volume value. Default value is 35 (max value is 100)

    public TV(String company, String model, int releaseDate, int wattsPower, double weight, double length, double width, double thickness,
              boolean power, String tvType, int screenDiagonal, String screenResolution, String aspectRatio,
              boolean smartTV, String smartTvType) {
        super(company, model, releaseDate, wattsPower, weight, length, width, thickness, power);

        this.tvType = tvType;
        this.screenDiagonal = screenDiagonal;
        this.screenResolution = screenResolution;

        this.aspectRatio = aspectRatio;
        this.smartTV = smartTV;
        this.currentVolume = 35;

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

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }


    @Override
    public void volumeUp(int volume) throws AudioVideoMaxVolumeException {
        /* some implementation */
        if (currentVolume + volume > 100) {
            throw new AudioVideoMaxVolumeException("Max volume can not be above than 100");
        }
    }

    @Override
    public void volumeDown(int volume) throws AudioVideoMinVolumeException {
        /* some implementation */
        if (currentVolume - volume < 0) {
            throw new AudioVideoMinVolumeException("Min volume can not be under 0");
        }
    }

    @Override
    public String toString() {
        return "This TV is a the property of " + company + " company, model - " + model + ", Release Date - " + releaseDate + ", watts power - " + wattsPower;
    }
}
