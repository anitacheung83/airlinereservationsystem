package exceptions;

public class SignUpPasswordNotMatchException extends IllegalArgumentException {
    public SignUpPasswordNotMatchException(){
        super("Password do not match!");
    }
}
