//Import scanner for input
import java.util.Scanner;
//**********************************************************************************************************************
// Activity 11: Methods Activity
// Name: Blaine Bailey
// Date of Submission: 2/8/2023
//**********************************************************************************************************************
// This program asks user for length and width of a rectangle, then calculates area of a rectangle based on the inputted
// length and width. Finally, the program displays the length, width, and area of the rectangle. Click the green arrow,
// then enter the length and width of the rectangle.
//**********************************************************************************************************************
// The program uses the Scanner class for input.
//**********************************************************************************************************************
public class MethodsActivity {
    //Create scanner object for input
    //Make scanner object static for all methods
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        double length = getLength();
        double width = getWidth();
        double area = getArea(length, width);
        displayData(length, width, area);
        input.close();
    }

    //getLength() method gets user input of the length of a rectangle
    //Returns length as a double
    public static double getLength() {
        System.out.print("Length of rectangle: ");
        return Double.parseDouble(input.nextLine());
    }

    //getWidth() method asks user to input width of a rectangle
    //Returns width as a double
    public static double getWidth() {
        System.out.print("Width of rectangle: ");
        return Double.parseDouble(input.nextLine());
    }

    //getArea() method has length and width parameters and calculates area of a rectangle
    //Returns area as a double
    public static double getArea(double length, double width) {
        return length * width;
    }

    //displayData() method has length, width, and area as parameters
    //Displays the length, width, and area of a triangle
    public static void displayData(double length, double width, double area) {
        System.out.printf("Rectangle length: %.1f\n", length);
        System.out.printf("Rectangle width: %.1f\n", width);
        System.out.printf("Rectangle area: %.1f", area);
    }
}