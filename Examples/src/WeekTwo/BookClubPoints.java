package WeekTwo;
import javax.swing.JOptionPane;
public class BookClubPoints {
    public static void main(String[] args) {
        String booksPurchased = JOptionPane.showInputDialog("How many books have you purchased this month?");
        int numBooks = Integer.parseInt(booksPurchased);
        int points;

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
        JOptionPane.showMessageDialog(null, String.format("You have earned %d points!", points));
    }
}
