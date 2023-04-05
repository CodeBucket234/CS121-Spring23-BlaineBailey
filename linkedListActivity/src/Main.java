//**********************************************************************************************************************
// Activity 31: Linked Lists
// Name: Blaine Bailey
// Date of Submission: 4/5/2023
//**********************************************************************************************************************
// This is the main class. This program creates two instances of the Student class: Kacy and David. Starting with Kacy,
// The program adds four courses to Kacy's courseList. Then it displays Kacy's information and all the courses on their
// courseList. Then it removes one course from Kacy's courseList, and prints out the remaining classes. The program does
// the same thing for David afterwards.
//**********************************************************************************************************************
public class Main {
    public static void main(String[] args) {
        //Create two instances of Student class
        Student Kacy = new Student("Kacy", "Drew", "A105B340", "Biology", "Sophomore");
        Student David = new Student("David", "Higgins", "C813A060", "Economics", "Senior");

        //Start with Kacy

        //Add four classes to Kacy's courseList
        Kacy.addClass("Organic Chemistry");
        Kacy.addClass("Genetics");
        Kacy.addClass("English");
        Kacy.addClass("Personal Finance");

        //Print out Kacy's information
        System.out.println(Kacy.getStudentInfo());

        //Display all Kacy's courses
        Kacy.displayStudentCourses();

        //Remove a class from Kacy's courseList
        Kacy.removeCourse("English");

        //Empty line for formatting purposes
        System.out.println();

        //Display all the remaining of Kacy's courses
        Kacy.displayStudentCourses();

        //Empty line for formatting purposes
        System.out.println();

        //Now David

        //Add four classes to David's courseList
        David.addClass("Supply and Demand");
        David.addClass("Business");
        David.addClass("Macroeconomics");
        David.addClass("Microeconomics");

        //Print out David's information
        System.out.println(David.getStudentInfo());

        //Display all David's courses
        David.displayStudentCourses();

        //Remove a class from David's courseList
        David.removeCourse("Business");

        //Empty line for formatting purposes
        System.out.println();

        //Display all the remaining of David's courses
        David.displayStudentCourses();
    }
}