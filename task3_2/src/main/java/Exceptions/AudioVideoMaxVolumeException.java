package Exceptions;

public class AudioVideoMaxVolumeException extends Exception {
    public AudioVideoMaxVolumeException (String message) {
        super(message);
    }

    public AudioVideoMaxVolumeException (String message, Throwable cause) {
        super (message, cause);
    }
}
