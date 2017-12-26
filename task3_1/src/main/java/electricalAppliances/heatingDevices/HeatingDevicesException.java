package electricalAppliances.heatingDevices;

public class HeatingDevicesException extends Exception {
    public HeatingDevicesException(String message) {
        super(message);
    }

    public HeatingDevicesException(String message, Throwable cause) {
        super(message, cause);
    }
}
