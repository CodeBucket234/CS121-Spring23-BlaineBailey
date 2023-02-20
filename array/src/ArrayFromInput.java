//Using Scanner class for input
import java.util.Scanner;
//**********************************************************************************************************************
// Activity 15: Arrays
// Name: Blaine Bailey
// Date of Submission: 2/20/2023
//**********************************************************************************************************************
// This program creates 3 lists that store pokemon names, types, and hp. The user will have to enter the stats for 4
// different pokemon since each array can hold 4 values. After the user enters the name, type, and hp for all 4 pokemon,
// the program will display all of this information into a table in the console.
//**********************************************************************************************************************
// This program uses the Scanner class for input.
//**********************************************************************************************************************
public class ArrayFromInput {
    public static void main(String[] args) {
        //Creating Scanner object for input
        Scanner input = new Scanner(System.in);

        //Creating LENGTH variable for all array lengths
        final int LENGTH = 4;

        //Creating name, type, and health arrays for the pokemon
        String[] names = new String[LENGTH];
        String[] types = new String[LENGTH];
        int[] health = new int[LENGTH];

        //Gather input from user to populate arrays
        for(int i = 0; i < LENGTH; i++) {
            //Print out which pokemon the user is on
            System.out.printf("Pokemon %d\n", (i+1));

            //Get the names of the pokemon
            System.out.printf("Type in Pokemon %d's name: ", (i+1));
            names[i] = input.nextLine();

            //Get the types of the pokemon
            System.out.printf("Type in Pokemon %d's type: ", (i+1));
            types[i] = input.nextLine();

            //Get the health points of the pokemon
            System.out.printf("Type in Pokemon %d's hp: ", (i+1));
            health[i] = Integer.parseInt(input.nextLine());

            //Create new blank line for formatting
            System.out.println();
        }

        //Print out all of the pokemon and their stats in a table
        System.out.printf("\n%-14s %-14s %s", "Pokemon", "Type", "HP");
        for(int i = 0; i < LENGTH; i++) {
            System.out.printf("\n%-14s %-14s %d", names[i], types[i], health[i]);
        }
    }
}