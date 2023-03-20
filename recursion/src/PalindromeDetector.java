//**********************************************************************************************************************
// Names: Blaine Bailey and David Case
// Activity 23: Recursion
// Date of Submission: 3/19/2023
//**********************************************************************************************************************
// The PalindromeDetector class has one method. The isPalindrome method takes in a string as an argument, and creates
// two strings. The forward string takes the argument and makes it lowercase. The backwards string is filled with a for
// loop that starts at the end of the string and goes to the beginning of the string. The backwards string will be the
// backwards lowercase string. Then if the forwards and backwards string is the same, then the string is a palindrome
// and the method will return true. Otherwise, it will return false.
//**********************************************************************************************************************
public class PalindromeDetector {
    //Method that checks if a string is a palindrome
    public boolean isPalindrome(String str) {
        String forwards = "";
        String backwards = "";
        //creates forward string
        forwards = str.toLowerCase();

        //creates a backwards string
        for(int i = str.length()-1; i > -1; i--) {
            backwards += str.toLowerCase().charAt(i);
        }

        //checks if forwards and backwards is the same
        //if the string is a palindrome, returns true. Otherwise, it returns false
        if(forwards.equals(backwards)) {
            return true;
        }
        else {
            return false;
        }
    }
}