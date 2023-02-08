//Importing Java.io for files
//Importing Scanner class for reading files
import java.io.*;
import java.util.Scanner;
//**********************************************************************************************************************
// Activity 10: Files
// Name: Blaine Bailey
// Date of Submission: 2/8/2023
//**********************************************************************************************************************
// This program reads the file myCourses.txt and displays its contents into the console output. Simply click the green
// arrow to start the program.
//**********************************************************************************************************************
public class fileRead {
    public static void main(String[] args) throws FileNotFoundException {
        //Get myCourses.txt file
        File file = new File("myCourses.txt");

        //If file found
        try {
            Scanner inputFile = new Scanner(file);
            while (inputFile.hasNextLine()) {
                String line = inputFile.nextLine();
                System.out.println(line);
            }
        }

        //If file is not found, throw an error
        catch (FileNotFoundException e) {
            System.err.println("File not found.");
        }
    }
}