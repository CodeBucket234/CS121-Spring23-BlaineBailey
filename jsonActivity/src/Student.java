//**********************************************************************************************************************
// Activity 37: JSON Activity
// Name: Blaine Bailey
// Date of Submission: 4/30/2023
//**********************************************************************************************************************
// This is the student class. This class has 2 instance String variables: major and class standing, 1 instance double
// variable: GPA, and 1 instance integer variable: ID number. The constructor for this class creates a custom student
// with specified values for the instance variables. This class also has getters and setters.
//**********************************************************************************************************************
public class Student {
    //Private instance variables
    private String major, classStanding;
    private double gpa;
    private int ID;

    //Student constructor
    public Student(int id, String major, String standing, double gpa) {
        this.ID = id;
        this.major = major;
        this.classStanding = standing;
        this.gpa = gpa;
    }

    //Getters
    public int getID() {
        return this.ID;
    }

    public String getMajor() {
        return this.major;
    }

    public String getClassStanding() {
        return this.classStanding;
    }

    public double getGpa() {
        return this.gpa;
    }

    //Setters
    public void setID(int id) {
        this.ID = id;
    }

    public void setMajor(String newMajor) {
        this.major = newMajor;
    }

    public void setClassStanding(String newStanding) {
        this.classStanding = newStanding;
    }

    public void setGpa(double newGPA) {
        this.gpa = newGPA;
    }
}