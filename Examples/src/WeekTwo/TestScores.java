package WeekTwo;
import java.util.Scanner;
public class TestScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first test score: ");
        double score1 = input.nextDouble();
        System.out.print("Enter second test score: ");
        double score2 = input.nextDouble();
        System.out.print("Enter third test score: ");
        double score3 = input.nextDouble();

        double average = (double)(score1 + score2 + score3) / 3.0;
        System.out.printf("Your test score average: %.2f\n", average);

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
