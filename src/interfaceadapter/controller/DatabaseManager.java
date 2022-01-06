package interfaceadapter.controller;

import exceptions.SignUpInvalidEmailException;
import exceptions.SignUpInvalidFirstNameException;
import exceptions.SignUpInvalidLastNameException;
import exceptions.SignUpPasswordNotMatchException;

public class DatabaseManager {

    public void signUpVerify(String firstName, String lastName, String email, String password, String passwordConfirmed) throws IllegalArgumentException {
        if (!password.equals(passwordConfirmed)) {
            throw new SignUpPasswordNotMatchException();
        }

        if (firstName.length() < 2) {
            throw new SignUpInvalidFirstNameException();
        }

        if (lastName.length() < 2) {
            throw new SignUpInvalidLastNameException();
        }

        if (email.length() < 2) {
            throw new SignUpInvalidEmailException();
        }

        // Check if the email existed or not
    }
}
