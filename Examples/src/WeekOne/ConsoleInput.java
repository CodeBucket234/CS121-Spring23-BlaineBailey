package WeekOne;
import java.util.Scanner;
public class ConsoleInput {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Please enter your first name: ");
        String firstName = console.nextLine();
        System.out.println("Please enter your last name: ");
        String lastName = console.nextLine();

        System.out.printf("Full name: %s %s", firstName, lastName);
    }
}
