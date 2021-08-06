package task2;

public class NotFoundPeopleException extends Exception {
    public NotFoundPeopleException(String message) {
        super(message);
    }

    public NotFoundPeopleException(String message, Throwable cause) {
        super(message, cause);
    }
}
