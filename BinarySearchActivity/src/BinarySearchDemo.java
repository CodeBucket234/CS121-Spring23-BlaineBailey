import java.util.*;
//**********************************************************************************************************************
// Activity 27: Binary Search Activity
// Name: Blaine Bailey
// Date of Submission: 4/11/2023
//**********************************************************************************************************************
// This is the BinarySearchDemo class. This class has two private instance variables: Scanner object input for
// collecting input on what number the user wants to search for, and an integer ArrayList nums that stores an array list
// of integers. This class features a constructor that takes in 5 integers as arguments, and the constructor adds each
// of the 5 integers into nums. Then there are two methods for using selection sort: findMinIndex returns the index of
// the minimum number in nums, and sort uses findMinIndex to sort nums through selection sort. Then there are two
// methods relating to binary search: search takes in a number as a parameter and uses binary search to find the number
// that was passed into the parameter. The search method returns the index of the number if it finds it, or -1 if the
// number is not found. The other binary search method in this class is binarySearch, which takes no parameters, and
// uses the input Scanner object to ask the user what number they want to search for. Then it calls the search method.
// If search returns -1, then it prints out "The number you are looking for has not been found." Otherwise, it prints
// out the number and the index where it was found.
//**********************************************************************************************************************
public class BinarySearchDemo {
    //Create Scanner object and ArrayList nums
    private Scanner input = new Scanner(System.in);
    private ArrayList<Integer> nums = new ArrayList<>();

    //BinarySearchDemo constructor that adds 5 integers to nums
    public BinarySearchDemo(int i1, int i2, int i3, int i4, int i5) {
        nums.add(i1);
        nums.add(i2);
        nums.add(i3);
        nums.add(i4);
        nums.add(i5);
    }

    //Sorting methods

    //Use selection sort to sort nums
    public void sort(int start) {
        //Get the index of the minimum value from the starting index
        int minIndex = findMinIndex(nums, start);

        //Swap current value at start index with minimum value
        int swap = nums.get(minIndex);
        int temp = nums.get(start);
        nums.set(start, swap);
        nums.set(minIndex, temp);

        //Call function recursively until nums is sorted
        if(start < nums.size() - 1) {
            sort(start+1);
        }
    }

    //Find index of minimum number in an array beginning from start index
    public int findMinIndex(ArrayList<Integer> array, int start) {
        //Start index of minimum value to be start index
        int minIndex = start;

        //Find the index of the minimum value
        for(int i = start; i < array.size(); i++) {
            if(array.get(i) < array.get(minIndex)) {
                minIndex = i;
            }
        }

        //Return the index of the minimum value.
        return minIndex;
    }

    //Bimary Search methods

    //Use binary search to find a number in nums
    public int search(int num) {
        //Create variables used in the binary search
        //start is starting index
        //end is last index
        //midIndex is the middle index
        int start = 0;
        int end = nums.size() - 1;
        int midIndex = (end + start)/2;

        //Use while loop to keep doing binary search until number is found or all numbers looked through
        while(nums.get(midIndex) != num && end >= start) {
            //If number is lower than current number at midIndex
            if(nums.get(midIndex) < num) {
                start = midIndex + 1;
            }
            //Else number is higher than current number at midIndex
            else {
                end = midIndex - 1;
            }
            midIndex = (end + start)/2;
        }

        //If number is not found
        if(end < start) {
            midIndex = -1;
        }

        //Return middle index
        return midIndex;
    }

    //Prompt user for the number they want to search and tell them if the number is found
    //If found, it tells the user the number and the index, otherwise indicate the number cannot be found.
    public void binarySearch() {
        //Prompt user for number to search for
        System.out.print("What number are you looking for?: ");
        int number = Integer.parseInt(input.nextLine());

        //Call search method to find the number
        int result = search(number);

        //If the number is not found
        if(result == -1) {
            System.out.println("The number you are looking for has not been found.");
        }
        //Else number is found. Print out number and index
        else {
            System.out.println(String.format("We found the number %d at index %d", nums.get(result), result));
        }
    }
}
