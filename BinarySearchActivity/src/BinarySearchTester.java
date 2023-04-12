//**********************************************************************************************************************
// Activity 27: Binary Search Activity
// Name: Blaine Bailey
// Date of Submission: 4/11/2023
//**********************************************************************************************************************
// This is the BinarySearchTester class. This program creates an instance of the BinarySearchDemo class, and then calls
// the sort method to sort the array list of integers. It passes through 0 as an argument as the sorting will start at
// index 0. Then it calls the binarySearch method to ask the user what number they are looking for, and uses binary sort
// to find the number. The program will either display the number and the index of the number or it will display that
// the number has not been found.
//**********************************************************************************************************************
public class BinarySearchTester {
    public static void main(String[] args) {
        //Create instance of BinarySearchDemo class
        BinarySearchDemo binary = new BinarySearchDemo(3, 5, 2, 4, 1);

        //Sort the array list
        binary.sort(0);

        //Search for number inputted by user
        binary.binarySearch();
    }
}