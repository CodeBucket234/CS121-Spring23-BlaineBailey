package classArrayLists;
import java.util.ArrayList;
//**********************************************************************************************************************
// Activity 17: ArrayLists and Jumps
// Name: Blaine Bailey
// Date of Submission: 2/28/2023
//**********************************************************************************************************************
// This class creates objects that utilizes four array lists: a string array list for the course name, a double array
// list for gpa, an integer array list for the score, and a string array list for the letter grade. The constructor
// creates an object with these four array lists initially empty. There is two methods in this class. The addItem method
// takes in four parameters, a string for course name, a double for the gpa, an integer for the score, and a string for
// the letter grade. These parameters will be added to their appropriate array list. The displayInfo method takes no
// arguments and displays the course information in a table.
//**********************************************************************************************************************
public class CourseInfo {
    //Declaring the four array lists.
    ArrayList<String> course;
    ArrayList<Double> gpa;
    ArrayList<Integer> score;
    ArrayList<Character> letterGrade;

    //Constructor that creates an object that initializes the empty array lists.
    public CourseInfo() {
        this.course = new ArrayList<String>();
        this.gpa = new ArrayList<Double>();
        this.score = new ArrayList<Integer>();
        this.letterGrade = new ArrayList<Character>();
    }

    //Adds course information
    public void addItem(String course, double gpa, int score, char letter) {
        this.course.add(course);
        this.gpa.add(gpa);
        this.score.add(score);
        this.letterGrade.add(letter);
    }

    //Displays the course information in a table.
    public void displayInfo() {
        System.out.printf("%-14s %-14s %-14s %s\n", "Course Name", "GPA", "Score", "Letter Grade");
        for(int i = 0; i < this.course.size(); i++) {
            System.out.printf("%-14s %-14.2f %-14d %s\n", this.course.get(i), this.gpa.get(i), this.score.get(i), this.letterGrade.get(i));
        }
    }
}
