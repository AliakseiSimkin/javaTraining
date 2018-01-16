package electricalAppliances.audioVideo;

import Exceptions.AudioVideoMaxVolumeException;
import Exceptions.AudioVideoMinVolumeException;

public interface ChangeVolume {

    public void volumeUp (int volume) throws AudioVideoMaxVolumeException;
    public void volumeDown (int volume) throws AudioVideoMinVolumeException;


}
