import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//**********************************************************************************************************************
// Activity 37: JSON Activity
// Name: Blaine Bailey
// Date of Submission: 4/30/2023
//**********************************************************************************************************************
// This is the StudentReader class. This class uses the BufferedReader class to read from the students.json file, and
// uses a Gson object to convert the student object in the file into a Student object. The data about the Student object
// is printed into the console.
//**********************************************************************************************************************
public class StudentReader {
    public static void main(String[] args) {
        try {
            //Create a Gson object
            Gson gson = new Gson();

            //Create BufferedReader object to read student object from JSON file
            BufferedReader reader = new BufferedReader(new FileReader("students.json"));

            //Use Gson object to create student object from JSON file
            Student student = gson.fromJson(reader, Student.class);

            //Print student data
            System.out.printf("Student ID: %d\nStudent Major: %s\nStudent Class Standing: %s\nStudent GPA: %.2f", student.getID(), student.getMajor(), student.getClassStanding(), student.getGpa());
        }
        //If IOException occurs, print the stack trace to show where problem occurs.
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
