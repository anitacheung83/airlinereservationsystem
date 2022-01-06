package exceptions;

public class SignUpInvalidFirstNameException extends IllegalArgumentException{
    public SignUpInvalidFirstNameException(){
        super("Invalid first name entered.");
    }
}
