package WeekThree.Activity3;
//Importing JOptionPane
import javax.swing.JOptionPane;
public class Login {
    public static void main(String[] args) {
        //Declaring and initializing login information
        String userName = "dw";
        String password = "secret";

        //Prompt user for username and password
        String name = JOptionPane.showInputDialog("Enter in your username:");
        String pw = JOptionPane.showInputDialog("Enter in your password:");

        //Testing whether the user has inputted the correct information
        if(name.equals(userName) && pw.equals(password)) {
            JOptionPane.showMessageDialog(null, "Welcome to CS121!");
        }
        else if(name.equals(userName) && !pw.equals(password)) {
            JOptionPane.showMessageDialog(null, "Your password is incorrect.");
        }
        else if(!name.equals(userName) && pw.equals(password)) {
            JOptionPane.showMessageDialog(null, "Your username is incorrect");
        }
        else {
            JOptionPane.showMessageDialog(null, "Your username and password are incorrect.");
        }
    }
}
