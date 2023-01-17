import javax.swing.JOptionPane;

public class Main {
       public static void main(String[] args) {
           //Declaring variables
           String name;
           int hours;
           double payRate;
           double grossPay;

           //Getting input from user
           name = JOptionPane.showInputDialog("What is your name?");
           hours = Integer.parseInt(JOptionPane.showInputDialogue("How many hours did you work?"));
           payRate = Double.parseDouble(JOptionPane.showInputDialogue("How much are you paid per hour?"));

           //Calculate gross pay
           grossPay = hours * payRate;

           //Displaying results to user
           JOptionPane.showMessageDialog(null, "Hello" + name + ", your gross pay is: $" + Str(grossPay));
       }
}