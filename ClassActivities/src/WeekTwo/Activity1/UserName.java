package WeekTwo.Activity1;

//Using Scanner for user input
import java.util.Scanner;
//************************************************************
//  Activity #1: UserName
//  Name: Blaine Bailey
//  Date of submission: 1/20/2023
//************************************************************
//  Documentation:
//  The purpose of the program is to get input of a user's
//  name, and then print out their name in three different
//  ways: UPPERCASE, lowercase, and reverse.
//************************************************************
//  To run the program, click the green arrow. Then, type in
//  your first name. Then click enter. Next, enter your last
//  name, then click enter. The program will automatically
//  show your full name in UPPERCASE, lowercase, and reverse.
//************************************************************
//  This program uses the Scanner method for user input.
//************************************************************
//  Methods used:
//  1) nextLine()
//  2) format()
//  3) toUpperCase()
//  4) toLowerCase()
//  5) charAt()
//  6) length()
//************************************************************
public class UserName {
    public static void main(String[] args) {
        //Creating scanner for user input
        Scanner input = new Scanner(System.in);

        //Asking users for their first and last name
        //Users input their first and last name
        System.out.print("What is your first name?: ");
        String firstName = input.nextLine();
        System.out.print("What is your last name?: ");
        String lastName = input.nextLine();

        //Creates a string of the user's full name
        String fullName = String.format("%s %s", firstName, lastName);

        //Creates the UPPERCASE and lowercase full names
        String fullNameUpper = fullName.toUpperCase();
        String fullNameLower = fullName.toLowerCase();

        //Displays the full name in UPPERCASE, lowercase, and reverse
        System.out.println(fullNameUpper);
        System.out.println(fullNameLower);
        System.out.println(reverse(fullName));
    }
    //For loop that reverses the full name
    public static String reverse(String name) {
        String newName = "";
        for(int i = name.length()-1; i >= 0; i--) {
            newName += name.charAt(i);
        }
        return newName;
    }
}
