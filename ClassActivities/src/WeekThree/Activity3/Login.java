package WeekThree.Activity3;
import javax.swing.JOptionPane;
public class Login {
    public static void main(String[] args) {
        String userName = "dw";
        String password = "secret";

        String name = JOptionPane.showInputDialog("Enter in your username:");
        String pw = JOptionPane.showInputDialog("Enter in your password:");

        if(name.equals(userName) && pw.equals(password)) {
            JOptionPane.showMessageDialog(null, "Welcome to CS121!");
        }
        else if(name.equals(userName) && !pw.equals(password)) {
            JOptionPane.showMessageDialog(null, "Your password is incorrect.");
        }
        else if(!name.equals(userName) && pw.equals(password)) {

        }
    }
}
