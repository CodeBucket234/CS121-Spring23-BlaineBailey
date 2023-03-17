public class PalindromeDetector {
    public boolean isPalindrome(String str) {
        String forwards = "";
        String backwards = "";
        forwards = str.toLowerCase();
        for(int i = str.length()-1; i > -1; i--) {
            backwards += str.toLowerCase().charAt(i);
        }
        if(forwards.equals(backwards)) {
            return true;
        }
        else {
            return false;
        }
    }
}