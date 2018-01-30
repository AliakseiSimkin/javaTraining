package exceptions;

public class AudioVideoMinVolumeException extends Exception {
    public AudioVideoMinVolumeException (String message) {
        super (message);
    }

    public AudioVideoMinVolumeException (String message, Throwable cause) {
        super (message, cause);
    }
}
