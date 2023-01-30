//Importing Scanner class for input
//Import Random class for random number generation
import java.util.Scanner;
import java.util.Random;
//**********************************************************************************************************************
// Activity 7: Guessing Game
// Name: Blaine Bailey
// Date of Submission: 1/30/2023
//**********************************************************************************************************************
// To use the program:
// Click the green arrow. Then the program will ask you to either enter a number or "q" if you want to quit. If you
// enter "q", then the program will call you a quitter, and then tell you the number. If you enter a guess. then the
// program will see whether your number was the correct number or not. If you did not guess the correct number, then the
// program will tell you whether your number was too high or too low. If you guess correctly, then the program will tell
// you that you are correct and show you how many guesses you made.
//**********************************************************************************************************************
public class GuessingGame {
    public static void main(String[] args) {
        //Creating Random object for number generation
        //Creating Scanner object for input
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        //Generate the random number
        int number = rand.nextInt(100) + 1;

        //Make guessNum negative so the program does not automatically give you the right answer
        //If user enters a number, then this will be the user's guess
        int guessNum = -1;

        //Declare and initialize guesses at 0, which will hold number of guesses
        int guesses = 0;

        //Declare guess string variable, which will store user input
        String guess;

        //Now make the user play the game
        System.out.println("Guess a number between 1 and 100, or enter \"q\" if you give up:");
        while(guessNum != number) {
            //User either enters a guess or a number
            guess = input.nextLine();

            //If the user quits
            if(guess.equals("q")) {
                System.out.printf("Quitter! The number was %d.", number);
                break;
            }
            //If the user enters a guess
            else {
                //Turns the user's guess into a number for comparison
                guessNum = Integer.parseInt(guess);

                //If the number guessed is too high
                if(guessNum > number) {
                    System.out.print("Too high. Guess again: ");
                    guesses++;
                }
                //If the number guessed is too low
                else if(guessNum < number) {
                    System.out.print("Too low. Guess again: ");
                    guesses++;
                }
                //Else the user got the correct answer
                else {
                    System.out.println("Correct!");
                    guesses++;
                    System.out.printf("Number of guesses: %d", guesses);
                    break;
                }
            }
        }
    }
}