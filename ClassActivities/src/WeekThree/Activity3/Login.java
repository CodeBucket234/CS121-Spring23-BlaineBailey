package WeekThree.Activity3;
//Importing JOptionPane
import javax.swing.JOptionPane;
//**********************************************************************************************************************
// Activity 3: Login
// Name: Blaine Bailey
// Date of Submission: 1/29/2023
//**********************************************************************************************************************
// To use this program:
// Click the green arrow, then enter the password and username. The program will display "Welcome to CS121!" if you
// entered the correct information. If not, the program will tell you whether you got the password wrong, or the
// username, or both.
//**********************************************************************************************************************
// This program uses the JOptionPane class for input.
//**********************************************************************************************************************
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
