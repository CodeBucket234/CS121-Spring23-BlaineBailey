//Inport everything in java.util
import java.util.*;
//**********************************************************************************************************************
// Activity 28: Sets and Iterators Activity
// Name: Blaine Bailey
// Date of Submission: 3/29/2023
//**********************************************************************************************************************
// This is the StudentSet class. This has one instance variable, which is the students Hashset. The program uses the
// Scanner class for input and the iterator class for iterating through the set. The addStudents method uses the Scanner
// object input to get the user to input any number of students before they type q. The displayStudents method uses the
// it iterator object to iterate through the set and print out all the students.
//**********************************************************************************************************************
public class StudentSet {
    //Create students string Hashset
    private Set<String> students = new HashSet<>();

    //Create Scanner object for input
    Scanner input = new Scanner(System.in);

    //Prompt user to enter any number of students until the user types q
    public void addStudents() {
        while(true) {
            System.out.print("Add student or \"q\" to quit: ");
            String console = input.nextLine();

            //Check to see if the user types q
            if(console.toLowerCase().equals("q")) {
                break;
            }
            //If the user does not type q, add the student
            else {
                students.add(console);
            }
        }
    }

    //Display all the students using iterator
    public void displayStudents() {
        Iterator<String> it = students.iterator();
        while(it.hasNext()) {
            System.out.println((String)it.next());
        }
    }
}
