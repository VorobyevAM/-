package myException;

public class ChildDontWantItException extends Throwable{

    public ChildDontWantItException(String message) {
        super(message);
    }
}