//Import Scanner class
import java.util.Scanner;
//**********************************************************************************************************************
// Activity 26: Selection, Insertion, & Quick Sort
// Name: Blaine Bailey
// Date of Submission: 3/28/2023
//**********************************************************************************************************************
// This is the sorting class. This class features a getArray method that prompts the user for 5 unsorted integers and
// returns an array with the 5 unsorted integers. The sortArray method sorts the array using selection sort. The
// findMinIndex method helps the sortArray method to find the index value of the minimum integer for sorting. The show
// method is used to display the arrays.
//**********************************************************************************************************************
public class Sorting {
    //Creating scanner object for user input
    Scanner input = new Scanner(System.in);

    //Prompts user to input 5 unsorted integers and returns the unsorted array
    public int[] getArray() {
        //Prompt user for 5 unsorted integers
        System.out.print("Enter integer 1: ");
        int i1 = Integer.parseInt(input.nextLine());
        System.out.print("Enter integer 2: ");
        int i2 = Integer.parseInt(input.nextLine());
        System.out.print("Enter integer 3: ");
        int i3 = Integer.parseInt(input.nextLine());
        System.out.print("Enter integer 4: ");
        int i4 = Integer.parseInt(input.nextLine());
        System.out.print("Enter integer 5: ");
        int i5 = Integer.parseInt(input.nextLine());

        //Put the integers into an array
        int integers[] = {i1, i2, i3, i4, i5};

        //Return the array
        return integers;
    }

    //Sorts the array using selection sort
    public int[] sortArray(int[] array, int start) {
        //Calling minIndex function to find the index with the minimum value
        int minIndex = findMinIndex(array, start);

        //Swapping the minimum value with the value of the starting index
        int temp = array[start];
        array[start] = array[minIndex];
        array[minIndex] = temp;

        //Only call sortArray recursively if there is more elements in the array
        if(start < array.length - 1) {
            sortArray(array, start + 1);
        }

        //Return the sorted array
        return array;
    }

    //Helper function findMin
    private int findMinIndex(int[] array, int start) {
        //Start index of minimum value to be start index
        int minIndex = start;

        //Find the index of the minimum value
        for(int i = start; i < array.length; i++) {
            if(array[i] < array[minIndex]) {
                minIndex = i;
            }
        }

        //Return the index of the minimum value.
        return minIndex;
    }

    //Method for displaying all values in the array
    public String show(int[] array) {
        //Create display string
        String display = "";

        //Fill display string with all values in the array
        for(int i = 0; i < array.length; i++) {
            if(i < array.length-1) {
                display += array[i] + ", ";
            }
            else {
                display += array[i];
            }
        }

        //Return the display string
        return display;
    }
}
