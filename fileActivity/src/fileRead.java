import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class fileRead {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("myCourses.txt");
        try {
            Scanner inputFile = new Scanner(file);
            while (inputFile.hasNextLine()) {
                String line = inputFile.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        }
    }
}