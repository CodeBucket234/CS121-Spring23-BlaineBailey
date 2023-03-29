//**********************************************************************************************************************
// Activity 26: Selection, Insertion, & Quick Sort
// Name: Blaine Bailey
// Date of Submission: 3/28/2023
//**********************************************************************************************************************
// This is the main class. The main class creates an instance of the sorting class. Then it calls the getArray method to
// get the user to create an unsorted array with 5 integers. Then it shows the array the user created using the show
// method. Then it uses the sortArray method to sort the array, and then it uses the show method to display the sorted
// array.
//**********************************************************************************************************************
public class Main {
    public static void main(String[] args) {
        //Create instance of Sorting class
        Sorting selection = new Sorting();

        //Get user to create array with 5 unsorted integers
        int[] array = selection.getArray();

        //Display the array the user created
        System.out.println(selection.show(array));

        //Sort the unsorted array
        int[] sorted = selection.sortArray(array, 0);

        //Display the sorted array
        System.out.println(selection.show(sorted));
    }
}