//Importing Java.io for files
//Importing Scanner class for input
import java.io.*;
import java.util.Scanner;
//**********************************************************************************************************************
// Activity 10
// Name: Blaine Bailey
// Date of Submission: 2/8/2023
//**********************************************************************************************************************
// This program writes initial data into the myCourses.txt file. Click the green arrow then enter in number of headers.
// Then write all the headers, and the program will put the headers into the file. Next, enter in number of data per
// header. Then enter all the data, and the program will put all the data into the file.
//**********************************************************************************************************************
// This program uses Scanner class for input.
//**********************************************************************************************************************
public class FileWrite {
    public static void main(String[] args) throws FileNotFoundException {
        //Create scanner object for input
        Scanner input = new Scanner(System.in);

        //If the file is found
        try {
            //Create PrintWriter object for file output
            PrintWriter outputFile = new PrintWriter("myCourses.txt");

            //Ask user for number of headers. Have user enter the information
            System.out.print("How many headers of data?: ");
            int numHeaders = Integer.parseInt(input.nextLine());

            //Have user enter the headers, then put headers into the file
            for(int i = 1; i <= numHeaders; i++) {
                System.out.printf("Header %d: ", i);
                String header = input.nextLine();
                outputFile.print(header + "\t");
            }
            //Have file go to next line
            outputFile.print("\n");

            //Ask user for amount of data per header. Have user enter in amount of data per header.
            System.out.print("How many data points per header?: ");
            int numData = Integer.parseInt(input.nextLine());

            //Make user input all the data into the file
            for(int i = 1; i <= numData; i++) {
                for(int j = 1; j <= numHeaders; j++) {
                    System.out.printf("Data %d for Header %d: ", i, j);
                    String data = input.nextLine();
                    outputFile.print(data + "\t");
                }
                //Only go into next line if there are more data to be entered on next line
                if(i < numData) {
                    outputFile.print("\n");
                }
            }
            outputFile.close();
        }

        //If the file is not found, throw an error
        catch(FileNotFoundException e) {
            System.err.println("File not found.");
        }
    }
}