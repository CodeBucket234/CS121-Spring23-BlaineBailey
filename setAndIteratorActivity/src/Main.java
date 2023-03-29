//**********************************************************************************************************************
// Activity 28: Sets and Iterators Activity
// Name: Blaine Bailey
// Date of Submission: 3/29/2023
//**********************************************************************************************************************
// This is the main class. This program creates an instance of the StudentSet class, and then it calls the addStudents
// method to prompt the user to add students until they type q. Once the user types q to quit, the program will call the
// displayStudents method to print out the students.
//**********************************************************************************************************************
public class Main {
    public static void main(String[] args) {
        //Create instance of StudentSet class
        StudentSet students = new StudentSet();

        //Prompt user to keep adding to the set
        students.addStudents();

        //Blank line for formatting
        System.out.println();

        //Display all the students in the set
        students.displayStudents();
    }
}