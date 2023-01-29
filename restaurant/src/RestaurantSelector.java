//Importing the Scanner class for input
import java.util.Scanner;
//**********************************************************************************************************************
// Activity 5: Restaurant Selector
// Name: Blaine Bailey
// Date of Submission: 1/29/2023
//**********************************************************************************************************************
// To use this program:
// Click the green arrow. Then the program will ask whether anyone in your party is a vegetarian, vegan, and
// gluten-free. The program will then show available restaurants that accommodate for the needs of the party based on
// your input.
//**********************************************************************************************************************
// This program uses the Scanner class for input.
//**********************************************************************************************************************
public class RestaurantSelector {
    public static void main(String[] args) {
        //Creating scanner object for input
        Scanner input = new Scanner(System.in);

        //Asking user whether members of their party are vegetarian, vegan, or gluten-free
        //Collecting user input
        System.out.print("Is anyone in your party vegetarian? ");
        String vegetarian = input.nextLine().toLowerCase();

        System.out.print("Is anyone in your party a vegan? ");
        String vegan = input.nextLine().toLowerCase();

        System.out.print("Is anyone in your party gluten-free? ");
        String glutenFree = input.nextLine().toLowerCase();

        //Checking to see available restaurants based on user input
        if(vegan.equals("yes")) {
            System.out.println("Here are your restaurant choices:");
            System.out.println("\tCorner Cafe");
            System.out.println("\tThe Chef's Kitchen");
        }
        else if(glutenFree.equals("yes")) {
            System.out.println("Here are your restaurant choices:");
            System.out.println("\tMain Street Pizza Company");
            System.out.println("\tCorner Cafe");
            System.out.println("\tThe Chef's Kitchen");
        }
        else if(vegetarian.equals("yes")) {
            System.out.println("Here are your restaurant choices:");
            System.out.println("\tMama's Fine Italian");
            System.out.println("\tMain Street Pizza Company");
            System.out.println("\tCorner Cafe");
            System.out.println("\tThe Chef's Kitchen");
        }
        else {
            System.out.println("Here are your restaurant choices:");
            System.out.println("\tJoe's Gourmet Burgers");
            System.out.println("\tMama's Fine Italian");
            System.out.println("\tMain Street Pizza Company");
            System.out.println("\tCorner Cafe");
            System.out.println("\tThe Chef's Kitchen");
        }
    }
}