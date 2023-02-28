package classArrayLists;
import java.util.Scanner;
//**********************************************************************************************************************
// Activity 17: ArrayLists and Jumps
// Name: Blaine Bailey
// Date of Submission: 2/28/2023
//**********************************************************************************************************************
// This program uses the CourseInfo class to create a student object to hold all their course information. Once you
// click the green arrow, you will be prompted to enter in all the course information for the student. Once you finish,
// type q to quit entering information, and the program will display all the course information for the student. If you
// type in q in the middle of inputting a course, the program will not display the class with incomplete information.
// The program will only display classes containing complete information, because it only adds the course once all the
// information for that course is entered.
//**********************************************************************************************************************
// This program uses the Scanner class for input.
//**********************************************************************************************************************
public class TestClass {
    public static void main(String[] args) {
        //Creates scanner object for input
        Scanner input = new Scanner(System.in);

        //Creates student object for holding student's course information.
        CourseInfo student = new CourseInfo();

        //Using while loop to enter in course information.
        System.out.println("Enter the following information or type q to quit.");
        while(true) {
            //Declaring the variables to be used for the CourseInfo class.
            String name;
            double gpa;
            int score;
            char letter;

            //Gets course name
            System.out.print("Enter in a course name: ");
            String info = input.nextLine();
            //Testing to see if the user quits entering information
            if(info.equals("q")) {
                //Adding empty line for formatting purposes and quit to display table
                System.out.println();
                break;
            }
            //Add the course name if user did not type in q
            else {
                name = info;
            }

            //Gets gpa
            System.out.print("Enter in the gpa: ");
            info = input.nextLine();
            //Testing to see if the user quits entering information
            if(info.equals("q")) {
                //Adding empty line for formatting purposes and quit to display table
                System.out.println();
                break;
            }
            //Add the course name if user did not type in q
            else {
                gpa = Double.parseDouble(info);
            }

            //Gets the numeric score
            System.out.print("Enter in the score: ");
            info = input.nextLine();
            //Testing to see if the user quits entering information
            if(info.equals("q")) {
                //Adding empty line for formatting purposes and quit to display table
                System.out.println();
                break;
            }
            //Add the course name if user did not type in q
            else {
                score = Integer.parseInt(info);
            }

            //Gets the letter grade
            System.out.print("Enter in the letter grade: ");
            info = input.nextLine();
            //Testing to see if the user quits entering information
            if(info.equals("q")) {
                //Adding empty line for formatting purposes and quit to display table
                System.out.println();
                break;
            }
            //Add the course name if user did not type in q
            else {
                letter = info.charAt(0);
            }

            //Adding empty line for formatting purposes
            System.out.println();

            //Add the course each time complete class information is entered.
            student.addItem(name, gpa, score, letter);
        }

        //Display the course information in a table once done.
        student.displayInfo();
    }
}
