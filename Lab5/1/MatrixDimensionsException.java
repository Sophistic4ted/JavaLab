package myPackage;


public class MatrixDimensionsException extends Exception {
    public MatrixDimensionsException(String message) {
        super(message);
    }
    public  MatrixDimensionsException(String message, Throwable throwable) {
        super(message, throwable);
    }
}

