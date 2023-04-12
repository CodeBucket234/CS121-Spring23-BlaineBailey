import java.util.Stack;
//**********************************************************************************************************************
// Activity 32: Stacks
// Name: Blaine Bailey
// Date of Submission: 4/11/2023
//**********************************************************************************************************************
// This is the optional BalancedAllBrackets class. This class not only checks the balance of parenthesis, but also for
// curly and square brackets. This class features 6 instance variables: stacks for each of the open and closed variants
// of parenthesis, curly braces, and square brackets. There are four methods, three methods for checking the balance of
// parenthesis, curly braces, and square brackets, and one that uses the three former methods to check the balances of
// all together. The three methods each work the same, and start off by counting the open and closed variants of their
// brackets. Then they check to see if there is the same amount of open brackets as closed brackets. If they are
// balanced, the method returns 1. Otherwise, the method returns 0 to indicate the string is unbalanced. The
// checkTotalBalance method calls each of the three methods and stores the result of each method. Then the method checks
// if all the brackets are balanced. If they are all balanced, the method returns balanced. If not, then the method
// returns unbalanced.
//**********************************************************************************************************************
public class BalancedAllBrackets {
    //Stacks that store open and closed variants for each
    private Stack openParenthesis = new Stack();
    private Stack closedParenthesis = new Stack();

    //Checking balance of curly braces
    private Stack openCurly = new Stack();
    private Stack closedCurly = new Stack();

    //Checking balance of square brackets
    private Stack openSquare = new Stack();
    private Stack closedSquare = new Stack();

    //Checks balance of parenthesis
    private int checkParenthesisBalance(String string) {
        //Counts open and closed parenthesis
        for(int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if(c == '(') {
                openParenthesis.push(c);
            }
            else if(c == ')') {
                closedParenthesis.push(c);
            }
        }

        //If the counts are equal
        if(openParenthesis.size() == closedParenthesis.size()) {
            openParenthesis.clear();
            closedParenthesis.clear();
            return 1;
        }
        //Otherwise, it is unbalanced
        else {
            openParenthesis.clear();
            closedParenthesis.clear();
            return 0;
        }
    }

    //Checks balance of curly braces
    private int checkCurlyBalance(String string) {
        //Counts open and closed curly braces
        for(int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if(c == '{') {
                openCurly.push(c);
            }
            else if(c == '}') {
                closedCurly.push(c);
            }
        }

        //If the counts of open and closed braces are equal
        if(openCurly.size() == closedCurly.size()) {
            openCurly.clear();
            closedCurly.clear();
            return 1;
        }
        //Otherwise, the braces are unbalanced
        else {
            openCurly.clear();
            closedCurly.clear();
            return 0;
        }
    }

    //Checking balance of square brackets
    private int checkSquareBalance(String string) {
        //Counts open and closed brackets
        for(int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if(c == '[') {
                openSquare.push(c);
            }
            else if(c == ']') {
                closedSquare.push(c);
            }
        }

        //If the counts for open and closed brackets are equal
        if(openSquare.size() == closedSquare.size()) {
            openSquare.clear();
            closedSquare.clear();
            return 1;
        }
        //Otherwise, the brackets are unbalanced
        else {
            openSquare.clear();
            closedSquare.clear();
            return 0;
        }
    }

    //Checks the total balance for all brackets
    public String checkTotalBalance(String string) {
        //Checks the balance for each bracket
        int balance1 = checkParenthesisBalance(string);
        int balance2 = checkCurlyBalance(string);
        int balance3 = checkSquareBalance(string);

        //If all are balanced, return balanced
        if(balance1 == 1 && balance2 == 1 && balance3 == 1) {
            return "balanced";
        }
        //Otherwise, return unbalanced
        else {
            return "unbalanced";
        }
    }
}
