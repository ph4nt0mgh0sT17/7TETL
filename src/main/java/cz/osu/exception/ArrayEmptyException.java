package cz.osu.exception;

/**
 * An exception that is indicates array is empty.
 */
public class ArrayEmptyException extends RuntimeException {

    public ArrayEmptyException(String message) {
        super(message);
    }

    public ArrayEmptyException(String message, Throwable cause) {
        super(message, cause);
    }
}
