package electricalAppliances.cleaningDevice.dry;

public class DryException extends Exception {
        public DryException (String message) {
            super(message);
        }

        public DryException (String message,Throwable cause) {
            super (message, cause);
        }

    }
