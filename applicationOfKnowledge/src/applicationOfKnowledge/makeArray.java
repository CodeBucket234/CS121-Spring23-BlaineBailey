package applicationOfKnowledge;

//Importing Scanner class for input
import java.util.Scanner;
public class makeArray {
    //Creates an array of a size specified by the user and allows user to enter in numbers for the array.
    public int[] createArray() {
        //Create Scanner object for input
        Scanner input = new Scanner(System.in);

        //Get the desired length of the array from the user
        System.out.print("How many numbers do you want in your array?: ");
        int length = -1;
        //Ensure that the length of the list is between 2 and 100000.
        do {
            length = Integer.parseInt(input.nextLine());

            if(length > 100000 || length < 2) {
                System.out.println("Please select a valid array size between 2 and 100000.");
            }
        }
        while((length < 2) || (length > 100000));

        //Create the integer array for the numbers
        int[] nums = new int[length];

        //Notify the user to create a repeating number
        System.out.println("Please make sure one number is repeating.");

        //Fill the array with numbers the user chooses
        for(int i = 0; i < length; i++) {
            int num = -1;
            do {
                System.out.printf("Number at index %d: ", i);
                num = Integer.parseInt(input.nextLine());
                if(num < 1) {
                    System.out.println("That was an invalid number. Try again!");
                }
            }
            while(num <= 0);
            nums[i] = num;
        }
        //Return the integer array
        return nums;
    }
}
