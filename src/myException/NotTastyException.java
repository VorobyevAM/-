package myException;

public class NotTastyException extends Throwable{

    public NotTastyException(String message) {
        super(message);
    }
}