package WeekThree.Activity3;
//Importing Scanner class for input
import java.util.Scanner;
//**********************************************************************************************************************
// Activity 3: EvenOrOdd
// Name: Blaine Bailey
// Date of Submission: 1/29/2023
//**********************************************************************************************************************
// To use this program:
// Click the green arrow, then enter a number. The number will determine whether the number you selected is even or odd.
// It is that simple.
//**********************************************************************************************************************
// This program uses the Scanner class for input.
//**********************************************************************************************************************
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
