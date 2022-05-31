package myapp.core;
import java.io.Console; //? Console comes from the java.io package

public class Greetings {
    // Entry Point

public static void main(String[] args) {
        // Get the console
        Console cons = System.console();

        // Read from input
        String name = cons.readLine("What is your name?"); //? This is a variable called "Name" whose type is name
        String result = name.substring(0, 1).toUpperCase().trim() + name.substring(1); //? This capitalise the first letter of the name and removes the white spaces surrounding the string using trim()
        System.out.printf("[%d] Hello %s. Nice to meet you. \n", 10, result); //? Printf = formats the output into a string. We don't use println as it is a fixed string.
    }
}