package WeekThree.Activity3;
//Importing scanner class
import java.util.Scanner;
//**********************************************************************************************************************
// Activity 3: Triangles
// Name: Blaine Bailey
// Date of Submission: 1/27/2023
//**********************************************************************************************************************
// To use this program:
// Click the green arrow, then enter a planet from our solar system. Our program is case-insensitive. If you enter a
// planet from our solar system, then it will display a bunch of facts about the planet, and provide a link citation to
// the website with the information. If you do not enter a planet from our solar system, then you will be given an
// error message.
//**********************************************************************************************************************
// This program uses the Scanner class for input.
//**********************************************************************************************************************
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
        else if(s1 != s2 && s2 != s3 && s1 != s3) {
            System.out.println("Your triangle is scalene.");
        }
        else {
            System.out.println("Your triangle is isosceles.");
        }
    }
}
