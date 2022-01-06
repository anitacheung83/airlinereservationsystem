package exceptions;

public class SignUpInvalidLastNameException extends IllegalArgumentException{
    public SignUpInvalidLastNameException(){
        super("Invalid last name entered.");
    }
}
