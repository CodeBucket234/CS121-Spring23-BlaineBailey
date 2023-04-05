import java.util.LinkedList;
//**********************************************************************************************************************
// Activity 31: Linked Lists
// Name: Blaine Bailey
// Date of Submission: 4/5/2023
//**********************************************************************************************************************
// This is the Student class. This class features 7 instance variables: first name, last name, ID, major, class
// standing, gpa, and the courseList linked list. This method has a constructor that has 5 parameters for first name,
// last name, ID, major, and class standing. This class has an addClass method that accepts a string value in the
// parameter, and it adds a course to the courseList. This class also has a removeClass function that accepts a class as
// a parameter, and it removes the class from the courseList. The method getStudentInfo returns a formatted string that
// displays all the information about a student. The displayStudentCourses method prints out all the student's courses
// from their courseList.
//**********************************************************************************************************************
public class Student {
    //Declare instance variables
    private String first, last, ID, major, standing;
    private double gpa;

    //Declare and initialize courseList
    private LinkedList<String> courseList = new LinkedList();

    //Student constructor
    public Student(String first, String last, String ID, String major, String standing) {
        this.first = first;
        this.last = last;
        this.ID = ID;
        this.major = major;
        this.standing = standing;
    }

    //Add a course to courseList
    public void addClass(String course) {
        courseList.add(course);
    }

    //Remove a course from courseList
    public void removeCourse(String course) {
        courseList.remove(course);
    }

    //Return formatted string with student's information
    public String getStudentInfo() {
        return String.format("Student: %s %s\nID: %s\nMajor: %s\nClass Standing: %s\n", first, last, ID, major, standing);
    }

    //Print out all the student's courses from courseList
    public void displayStudentCourses() {
        for(String course : courseList) {
            System.out.printf("%s\n", course);
        }
    }
}