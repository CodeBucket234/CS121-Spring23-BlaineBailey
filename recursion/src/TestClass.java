public class TestClass {
    public static void main(String[] args) {
        PalindromeDetector detector = new PalindromeDetector();

        if(detector.isPalindrome("Tacocat")) {
            System.out.println("Tacocat is a palindrome.");
        }
        else {
            System.out.println("Tacocat is not a palindrome.");
        }

        if(detector.isPalindrome("Hello Stacy")) {
            System.out.println("Hello Stacy is a palindrome.");
        }
        else {
            System.out.println("Hello Stacy is not a palindrome.");
        }
    }
}
