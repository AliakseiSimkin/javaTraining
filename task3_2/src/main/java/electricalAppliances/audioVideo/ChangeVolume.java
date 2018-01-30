package electricalAppliances.audioVideo;

import exceptions.AudioVideoMaxVolumeException;
import exceptions.AudioVideoMinVolumeException;

public interface ChangeVolume {

    public void volumeUp (int volume) throws AudioVideoMaxVolumeException;
    public void volumeDown (int volume) throws AudioVideoMinVolumeException;


}
