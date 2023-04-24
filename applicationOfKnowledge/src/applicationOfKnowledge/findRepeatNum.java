package applicationOfKnowledge;

//Importing Set and HashSet classes
import java.util.HashSet;
import java.util.Set;

public class findRepeatNum {
    //Finds and returns the first repeating number, or -1 if no repeating number is found
    private int findRepeat(int[] array) {
        //Create set with initial capacity of 100001 so that program uses constant extra space [ O(1) ]
        Set<Integer> uniqueNums = new HashSet<>(100001, 1);

        //Initialized repeating number as -1
        int foundNum = -1;

        //Check the array for repeating numbers by adding unique numbers to the set
        for(int num : array) {
            //Gets whether number was added to the set
            boolean isUnique = uniqueNums.add(num);

            //If the number was not added to the set, and thus is a repeating number
            if(!isUnique) {
                //Set foundNum to the repeating number and break out of for loop
                foundNum = num;
                break;
            }
        }
        //Return repeating number
        return foundNum;
    }

    //Calls findRepeat and prints out the repeating number, or prints out that there was no repeating number.
    public void printResults(int[] array) {
        //Get the repeating number
        int result = findRepeat(array);

        //If there are no repeating numbers, print out a statement informing the user of no repeating numbers being found.
        if(result == -1) {
            System.out.println("There was no repeating numbers.");
        }
        //Else, a repeating number is found. Print the repeating number
        else {
            System.out.printf("The number was %d!\n", result);
        }
    }
}
