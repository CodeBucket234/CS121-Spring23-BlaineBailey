package WeekTwo.Activity2;

//Using Scanner for user input
import java.util.Scanner;
//************************************************************
//  Activity #2: TestScores
//  Name: Blaine Bailey
//  Date of submission: 1/20/2023
//************************************************************
//  Documentation:
//  The purpose of the program is to take the numeric average
//  of three test scores the user inputted, and display a
//  letter grade based off of the average of the test scores
//  the user inputted.
//************************************************************
//  To run the program, click the green arrow. Then, type in
//  three test scores. The program will automatically take
//  the average of the test scores, and will display your
//  grade based on the test scores you inputted.
//************************************************************
//  This program uses the Scanner class for input.
//************************************************************
public class TestScores {
    public static void main(String[] args) {
        //Creating scanner object for user input
        Scanner input = new Scanner(System.in);

        //Asks user to input three test scores
        //Gathers user input for the three test scores
        System.out.print("Enter first test score: ");
        double score1 = input.nextDouble();
        System.out.print("Enter second test score: ");
        double score2 = input.nextDouble();
        System.out.print("Enter third test score: ");
        double score3 = input.nextDouble();

        //Creates an average score based on the three inputted test scores
        double average = (score1 + score2 + score3) / 3.0;
        System.out.printf("Your test score average: %.2f\n", average);

        //Displays letter grade based on test average score
        if(average >= 90) {
            System.out.println("Your letter grade is A");
        }
        else if(average >= 80) {
            System.out.println("Your letter grade is B");
        }
        else if(average >= 70) {
            System.out.println("Your letter grade is C");
        }
        else if(average >= 60) {
            System.out.println("Your letter grade is D");
        }
        else {
            System.out.println("Your letter grade is F");
        }
    }
}
