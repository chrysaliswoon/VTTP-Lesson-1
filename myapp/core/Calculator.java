package myapp.core;
import java.io.Console;

// How it works
//? Console will prompt the user for 3 things: First number, Second number and what operator they would like to use on the numbers. 
//? If the user chooses add, it will add the numbers together, else if user chooses div, it will divide the numbers and output into 3 decimal places, etc.
//? If the user chooses an invalid operator, it will print out an error message.

public class Calculator {
    public static void main(String[] args) {
        //? Get the console
        Console cons = System.console();

        // ? Read the User Inputs
        // ? trim().toLowerCase(): Trims and makes inputs to lower case
        String operand0 = cons.readLine("Input the first number: ").trim().toLowerCase();
        String operand1 = cons.readLine("Input the second number: ").trim().toLowerCase();
        String operator = cons.readLine("Operator: add, div, sub, mul ").trim().toLowerCase();

        // ? Convert the strings into integers
        // ? parseInt: parses the String argument as a signed decimal integer object
        Integer number0 = Integer.parseInt(operand0);
        Integer number1 = Integer.parseInt(operand1);

        // ? Calculations
        // ? floatValue(): inbuilt method in java that returns the value of the
        // specified number casted to float data type
        Integer add = number0 + number1;
        // // Integer division = (number0 / number1);
        float div = (float)number0 / number1;
        Integer sub = number0 - number1;
        Integer mul = number0 * number1;

        // ? Conditional Statements to output different results based on user inputs
        //? %.3f: means a floating point number with three digits after the decimal point.
        if (operator.equals("add"))
            System.out.printf("The answer for %d + %d = %s \n", number0, number1, add);
        else if (operator.equals("div"))
            System.out.printf("The answer for %d / %d = %.3f \n", number0, number1, div);
        else if (operator.equals("sub"))
            System.out.printf("The answer for %d - %d = %s \n", number0, number1, sub);
        else if (operator.equals("mul"))
            System.out.printf("The answer for %d * %d = %s \n", number0, number1, mul);
        else
            System.err.println("Please input either \"add\", \"div\", \"sub\" or \"mul\"");
    }
}