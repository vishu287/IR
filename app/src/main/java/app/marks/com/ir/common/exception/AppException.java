package app.marks.com.ir.common.exception;

/**
 * Created by vishwanathm on 2/5/2018.
 */

public class AppException extends RuntimeException {

    public AppException(final String message) {
        super(message);
    }


    public AppException(final String message,Throwable t) {
        super(message,t);
    }
}