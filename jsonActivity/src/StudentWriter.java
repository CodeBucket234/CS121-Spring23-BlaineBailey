import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
//**********************************************************************************************************************
// Activity 37: JSON Activity
// Name: Blaine Bailey
// Date of Submission: 4/30/2023
//**********************************************************************************************************************
// This is the StudentWriter class. This class creates an instance of the Student class, converts it into a JSON string
// using a Gson object, and uses a FileWriter object to write the student JSON string into a json file.
//**********************************************************************************************************************
public class StudentWriter {
    public static void main(String[] args) {
        try {
            //Create instance of Student class
            Student Kent = new Student(912303221, "Computer Science", "Junior", 3.65);

            //Create Gson object for converting student into JSON string
            Gson gson = new Gson();

            //Converting student into JSON string using Gson object
            String JsonString = gson.toJson(Kent);

            //Create FileWriter object
            FileWriter filewriter = new FileWriter("students.json");

            //Use FileWriter object to write student into JSON file
            filewriter.write(JsonString);

            //Close FileWriter object
            filewriter.close();
        }
        //If IOException occurs, print the stack trace to show where problem occurs.
        catch(IOException e) {
           e.printStackTrace();
        }
    }
}