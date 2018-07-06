package by.epam.task1chpta.exception;

public class ValidationFailure extends Exception {

    public ValidationFailure() {}


    public ValidationFailure(String msg) {
        super(msg);
    }


    public ValidationFailure(String msg, Throwable exception) {
        super(msg, exception);
    }


    public ValidationFailure(Throwable exception) {
        super(exception);
    }

}
