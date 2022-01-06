package exceptions;

public class SignUpInvalidEmailException extends IllegalArgumentException{
    public SignUpInvalidEmailException() {
        super("Invalid email entered.");
    }
}
