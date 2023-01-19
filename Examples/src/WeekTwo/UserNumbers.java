package WeekTwo;
import javax.swing.JOptionPane;
public class UserNumbers {
    public static void main(String[] args) {
        String numString1 = JOptionPane.showInputDialog("Enter in the first number:");
        String numString2 = JOptionPane.showInputDialog("Enter in the second number:");

        double num1 = Double.parseDouble(numString1);
        double num2 = Double.parseDouble(numString2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        double sqrt1 = Math.sqrt(num1);
        double sqrt2 = Math.sqrt(num2);
        double power = Math.pow(num1, num2);
        double log = Math.log(num1);
        double log2 = Math.log(num2);

        System.out.printf("Number 1: %.2f\nNumber 2: %.2f\n", num1, num2);
    }
}
