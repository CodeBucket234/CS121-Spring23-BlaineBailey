//Importing Scanner class for input
//Importing Random class for random number generation
import java.util.Scanner;
import java.util.Random;
//**********************************************************************************************************************
// Activity 9: ESP Game
// Name: Blaine Bailey
// Date of Submission: 2/1/2023
//**********************************************************************************************************************
// To use the program:
// Click the green arrow. Then the program will ask you to input either red, green, blue, orange, or yellow. The program
// will then tell you what color the computer chose and keep track of the correct number of guesses. The program will do
// this 10 times. Once the 10 times are up, the program will tell you how many correct guesses you made out of 10.
//**********************************************************************************************************************
// This program uses the Scanner class for input.
//**********************************************************************************************************************
public class ESPGame {
    public static void main(String[] args) {
        //Creating Scanner object to get user input
        Scanner input = new Scanner(System.in);

        //Creating Random object to generate a random number
        Random rand = new Random();

        //Declaring variables
        int randColor;
        String color;
        String colorGuess;
        int correct = 0;

        //For loop to give user 10 guesses
        for(int i = 1; i <= 10; i++) {
            //Generating random number which will decide color
            randColor = rand.nextInt(5);

            //Turning random number into a color
            if(randColor == 0) {
                color = "red";
            }
            else if(randColor == 1) {
                color = "green";
            }
            else if(randColor == 2) {
                color = "blue";
            }
            else if(randColor == 3) {
                color = "orange";
            }
            else {
                color = "yellow";
            }

            //Prompt user to input a color
            System.out.printf("%d. What color has the computer chosen?\n", i);
            //Get user's guess
            colorGuess = input.nextLine().toLowerCase();

            //Tell user the correct color
            System.out.printf(">The computer has chosen %s\n", color);

            //Keep track of the correct number of guesses
            if(colorGuess.equals(color)) {
                correct++;
            }
        }
        //Tell user at the end the correct number of guesses they got out of 10.
        System.out.printf("You got %d out of 10 correct.", correct);
    }
}