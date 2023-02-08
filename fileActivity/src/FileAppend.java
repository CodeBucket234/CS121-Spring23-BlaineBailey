//Importing Java.io for files
//Importing Scanner class for input
import java.io.*;
import java.util.Scanner;
//**********************************************************************************************************************
// Activity 10: File Activity
// Name: Blaine Bailey
// Date of Submission: 2/8/2023
//**********************************************************************************************************************
// This program appends data into the myCourses.txt file. Click the green arrow, then enter in number of headers in the
// file. Then enter new data under the headers. The program will take your input and put it in the file.
//**********************************************************************************************************************
// This program uses Scanner class for input.
//**********************************************************************************************************************
public class FileAppend {
    public static void main(String[] args) throws IOException {
        //Create FileWriter and PrintWriter objects for appending data into the file.
        FileWriter file = new FileWriter("myCourses.txt", true);
        PrintWriter outputFile = new PrintWriter(file);
        Scanner input = new Scanner(System.in);

        //Go to next line
        outputFile.print("\n");

        //Enter in number of headers the file has
        System.out.print("How many headers in the file?: ");
        int numHeaders = Integer.parseInt(input.nextLine());

        //Input new data under the headers
        for(int i = 1; i <= numHeaders; i++) {
            System.out.printf("Data for Header %d: ", i);
            String data = input.nextLine();
            outputFile.print(data + "\t");
        }
        outputFile.close();
    }
}
