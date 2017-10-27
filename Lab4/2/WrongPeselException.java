package myPackage;


public class WrongPeselException extends Exception {
    public WrongPeselException(String message) {
        super(message);
    }
    public  WrongPeselException(String message, Throwable throwable) {
        super(message, throwable);
    }
}

