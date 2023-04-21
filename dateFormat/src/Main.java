import java.util.Scanner;
//**********************************************************************************************************************
// Activity 34: Simple Date Format
// Name: Blaine Bailey
// Date of Submission: 4/19/2023
//**********************************************************************************************************************
// This is the Main class. This program creates an instance of the TotalCalories class and a Scanner object for input.
// Then the program asks the user to provide input on the start and end dates of the diet, as well as the number of
// calories per day. Then the program uses the instance of the TotalCalories class to calculate the number of calories
// consumed total and displays the number of calories total throughout the duration of the diet.
//**********************************************************************************************************************
public class Main {
    public static void main(String[] args) {
        //Create instance of TotalCalories class
        TotalCalories calories = new TotalCalories();

        //Create scanner object for input
        Scanner input = new Scanner(System.in);

        //Gather start and end dates from user
        System.out.print("What day are you starting your diet? (MM/DD/YYYY): ");
        String start =input.nextLine();

        System.out.print("What day will your diet end? (MM/DD/YYYY): ");
        String end = input.nextLine();

        //Get number of calories per day
        System.out.print("How many calories are you eating per day?: ");
        int caloriesPerDay = Integer.parseInt(input.nextLine());

        //Call calculateCalories method to get total number of calories consumed
        System.out.printf("The number of total calories consumed: %d", calories.calculateCalories(caloriesPerDay, start, end));
    }
}