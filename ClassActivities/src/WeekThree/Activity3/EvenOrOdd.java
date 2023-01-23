package WeekThree.Activity3;
//Importing Scanner class for input
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        //Creating new scanner object for user input
        Scanner input = new Scanner(System.in);

        //Ask user to enter in a number, and gather user input
        System.out.print("Enter in a number: ");
        int num = input.nextInt();

        //Testing whether the number is even or odd with modulus (%) operator
        //Print out whether number is even or odd
        if(num % 2 == 1) {
            System.out.println("Your number is odd.");
        }
        else {
            System.out.println("Your number is even.");
        }
    }
}
