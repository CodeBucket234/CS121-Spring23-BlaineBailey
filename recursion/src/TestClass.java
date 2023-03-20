//**********************************************************************************************************************
// Names: Blaine Bailey and David Case
// Activity 23: Recursion
// Date of Submission: 3/19/2023
//**********************************************************************************************************************
// This test class creates an instance of the PalindromeDetector class to test whether "Tacocat" and "Hello Stacy" is a
// palindrome. First, the program will use the PalindromeDetector method isPalindrome to test whether "Tacocat" is a
// palindrome. Since "Tacocat" is a palindrome, the test class will print out "Tacocat is a palindrome." into the
// console. Next, the program will use the Palindrome class to determine whether "Hello Stacy" is a palindrome. Since
// "Hello Stacy" is not a palindrome, the program will print out "Hello Stacy is not a palindrome." into the console.
//**********************************************************************************************************************
public class TestClass {
    public static void main(String[] args) {
        //Creating instance of the PalindromeDetector class
        PalindromeDetector detector = new PalindromeDetector();

        //Testing whether tacocat is a palindrome
        if(detector.isPalindrome("Tacocat")) {
            System.out.println("Tacocat is a palindrome.");
        }
        else {
            System.out.println("Tacocat is not a palindrome.");
        }

        //Testing whether hello stacy is a palindrome
        if(detector.isPalindrome("Hello Stacy")) {
            System.out.println("Hello Stacy is a palindrome.");
        }
        else {
            System.out.println("Hello Stacy is not a palindrome.");
        }
    }
}
