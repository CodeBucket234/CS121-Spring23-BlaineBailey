package WeekThree.Activity3;
//Importing scanner class
import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        //Creating scanner object
        Scanner input = new Scanner(System.in);

        //Prompting user to enter in all three sides
        System.out.print("Enter in the first side here: ");
        int s1 = input.nextInt();
        System.out.print("Enter in the second side here: ");
        int s2 = input.nextInt();
        System.out.print("Enter in the third side here: ");
        int s3 = input.nextInt();

        //Testing the triangle sides
        if(s1 == 0 || s2 == 0 || s3 == 0) {
            System.out.println("This is not a triangle.");
        }
        else if(s1 == s2 && s1 == s3) {
            System.out.println("Your triangle is equilateral.");
        }
        else if((s1 == s2 && s2 != s3) || (s1 != s2 && s2 == s3)) {
            System.out.println("Your triangle is isosceles.");
        }
        else {
            System.out.println("Your triangle is scalene.");
        }
    }
}
