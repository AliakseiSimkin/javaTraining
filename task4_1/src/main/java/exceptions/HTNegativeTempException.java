package exceptions;

public class HTNegativeTempException extends Exception{
    public HTNegativeTempException(String message) {
        super(message);
    }

    public HTNegativeTempException(String message, Throwable cause) {
        super (message, cause);
    }
}
