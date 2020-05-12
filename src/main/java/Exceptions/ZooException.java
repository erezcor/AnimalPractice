package Exceptions;

public class ZooException extends Exception {
    private final static String ZOO_EXCEPTION_HEADLINE = "Zoo Exception: ";

    public ZooException(String message) {
        super(ZOO_EXCEPTION_HEADLINE + message);
    }
}
