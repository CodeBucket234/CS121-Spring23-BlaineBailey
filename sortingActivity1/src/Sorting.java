//importing Scanner class for input
import java.util.Scanner;

//**********************************************************************************************************************
// Activity 25: Bubble and Merge Sort
// Name: Blaine Bailey
// Date of Submission: 3/27/2023
//**********************************************************************************************************************
// This is the sorting class. This class uses the scanner class for user input. The scanner object is used in the
// getArray method, where the user is asked to input 5 unsorted integers, and the unsorted array is returned. The
// sortArray method breaks down the array into two pieces and calls the merge method to help merge the array back
// together. The sortArray method takes in the unsorted array, the first index, and the last index as arguments. The
// merge method creates two temporary arrays, and puts them back together in a sorted manner, and then returns it to the
// sortArray method. The merge function takes in the unsorted array, the first index, the middle index, and the last
// index as arguments. The show method returns a string with all the values in the array. The show method takes in an
// integer array as an argument.
//**********************************************************************************************************************

//Sorting class
public class Sorting {

    //Creating a scanner object for input
    static Scanner input = new Scanner(System.in);

    //getArray asks for values to be entered into an unsorted array and returns the unsorted array
    public int[] getArray() {

        //Getting values for array
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

        //Creating array and returning it
        int integers[] = {i1, i2, i3, i4, i5};
        return integers;
    }

    //Sorts the unsorted array and returns a sorted array
    public int[] sortArray(int[] array, int left, int right) {
        if(left < right) {
            int mid = (left + right)/2;
            sortArray(array, left, mid);
            sortArray(array, mid+1, right);
            merge(array, left, mid, right);
        }
        return array;
    }

    //Helper function that merges two pieces of an array in a sorted order
    public void merge(int[] array, int left, int mid, int right) {

        //Getting sizes of each part of array
        int l1 = mid - left + 1;
        int l2 = right - mid;

        //Creating two temporary arrays for each part
        int[] leftArray = new int[l1];
        int[] rightArray = new int[l2];

        //Copying over values into each array
        for(int i = 0; i < l1; i++) {
            leftArray[i] = array[left + i];
        }
        for(int j = 0; j < l2; j++) {
            rightArray[j] = array[mid + 1 + j];
        }

        //Creating variables for indexes of each array
        int l = 0, r = 0;
        int k = left;

        //Going through and merging both left and right in sorted order
        while(l < l1 && r < l2) {
            if(leftArray[l] <= rightArray[r]) {
                array[k] = leftArray[l];
                l++;
            }
            else {
                array[k] = rightArray[r];
                r++;
            }
            k++;
        }

        //Copy over remaining left values
        while(l < l1) {
            array[k] = leftArray[l];
            l++;
            k++;
        }

        //Copy remaining right values
        while(r < l2) {
            array[k] = rightArray[r];
            r++;
            k++;
        }
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