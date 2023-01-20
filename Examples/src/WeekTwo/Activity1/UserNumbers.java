package WeekTwo.Activity1;

//Using Dialog boxes from JOptionPane
import javax.swing.JOptionPane;
//************************************************************
//  Activity #1: UserNumbers
//  Name: Blaine Bailey
//  Date of submission: 1/20/2023
//************************************************************
//  Documentation:
//  The purpose of the program is to get two numbers from
//  user input, and then perform various mathematical
//  operations on these numbers. The end result displays the
//  numbers the user inputted and displays the result of all
//  the mathematical operations.
//************************************************************
//  To run the program, click the green arrow. Then, type in
//  two numbers. The program will automatically perform the
//  mathematical operations, and will display the numbers you
//  inputted as well as the final result of each operation.
//************************************************************
//  This program uses dialog boxes from JOptionPane for input.
//************************************************************
public class UserNumbers {
    public static void main(String[] args) {
        //User inputs the two numbers required for math operations
        String numString1 = JOptionPane.showInputDialog("Enter in the first number:");
        String numString2 = JOptionPane.showInputDialog("Enter in the second number:");

        //Converts the numbers from user input from strings to integers
        int num1 = Integer.parseInt(numString1);
        int num2 = Integer.parseInt(numString2);

        //Performing required math operations on the two numbers
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        double sqrt1 = Math.sqrt(num1);
        double sqrt2 = Math.sqrt(num2);
        int power = (int)Math.pow(num1, num2);
        double log1 = Math.log(num1);
        double log2 = Math.log(num2);

        //Outputting the numbers the user entered
        //Outputting the results of each math operation
        System.out.printf("Number 1: %d\nNumber 2: %d\n", num1, num2);
        System.out.printf("%d + %d = %d\n", num1, num2, sum);
        System.out.printf("%d - %d = %d\n", num1, num2, difference);
        System.out.printf("%d * %d = %d\n", num1, num2, product);
        System.out.printf("%d / %d = %d\n", num1, num2, quotient);
        System.out.printf("Square root of %d = %.2f\n", num1, sqrt1);
        System.out.printf("Square root of %d = %.2f\n", num2, sqrt2);
        System.out.printf("%d ^ %d = %d\n", num1, num2, power);
        System.out.printf("Log(%d) = %.2f\n", num1, log1);
        System.out.printf("Log(%d) = %.2f\n", num2, log2);
    }
}
