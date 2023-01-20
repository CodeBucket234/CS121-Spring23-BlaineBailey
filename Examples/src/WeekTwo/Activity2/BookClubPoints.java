package WeekTwo.Activity2;

//Using dialog boxes from JOptionPane to gather user input
import javax.swing.JOptionPane;
//************************************************************
//  Activity #2: BookClubPoints
//  Name: Blaine Bailey
//  Date of submission: 1/20/2023
//************************************************************
//  Documentation:
//  The purpose of the program is to gather user input of
//  how many books the user purchased, and assigns points to
//  a user based on how many books they purchased.
//************************************************************
//  To run the program, click the green arrow. Then, type in
//  how many books you purchased. Then the program will
//  calculate the amount of points to give you based on how
//  many books you purchased and display a dialog box with the
//  amount of points earned.
//************************************************************
//  This program uses dialog boxes from JOptionPane for input.
//************************************************************
public class BookClubPoints {
    public static void main(String[] args) {
        //Gathers user input on how many books the user purchased
        String booksPurchased = JOptionPane.showInputDialog("How many books have you purchased this month?");

        //Turns user input from a string to an integer
        int numBooks = Integer.parseInt(booksPurchased);

        //Creates a points integer variable
        int points;

        //Assigns points based on number of books purchased
        if(numBooks == 0) {
            points = 0;
        }
        else if(numBooks == 1) {
            points = 5;
        }
        else if(numBooks == 2) {
            points = 15;
        }
        else if(numBooks == 3) {
            points = 30;
        }
        else {
            points = 60;
        }

        //Displays how many points the user earned
        JOptionPane.showMessageDialog(null, String.format("You have earned %d points!", points));
    }
}
