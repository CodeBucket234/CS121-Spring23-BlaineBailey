//**********************************************************************************************************************
// Activity 25: Bubble and Merge Sort
// Name: Blaine Bailey
// Date of Submission: 3/27/2023
//**********************************************************************************************************************
// This is the main method. This program creates a Sorting object, and then calls the getArray method to have the user
// create an unsorted array consisting of 5 integers. Then the program uses the show method to display all the values of
// the unsorted array that the user entered. Then the program calls the sortArray function, and then calls the show
// method to display the sorted array.
//**********************************************************************************************************************
public class Main {
    public static void main(String[] args) {
        //Creating Sorting object
        Sorting merge = new Sorting();

        //Get an unsorted array from the user
        int[] unsortedArray = merge.getArray();

        //Print out the unsorted array
        System.out.println(merge.show(unsortedArray));

        //Sort the unsorted array
        int[] sortedArray = merge.sortArray(unsortedArray, 0, 4);

        //Print out the sorted array
        System.out.println(merge.show(sortedArray));
    }
}
