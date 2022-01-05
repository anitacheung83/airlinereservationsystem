package frameworksanddrivers.commandlineinterface;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class CommandLine {
    final InputStream input;

    public CommandLine(InputStream input){
        this.input = input;
    }

    public void startWelcome() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        System.out.println("Welcome to the Airline Reservation System! \n Enter 1 if you wish to SignUp, enter 2 if you wish to Login, enter 3 if you wish to Continue");

        String choice = reader.readLine();
        if (choice.equals("1")){
            startSignUp();
        } else if (choice.equals("2")) {
            startLogin();
        } else if (choice.equals("3")) {
            homePage();
        }
    }

    public void startSignUp() {

    }

    public void startLogin() {

    }

    public void homePage() {

    }
}
