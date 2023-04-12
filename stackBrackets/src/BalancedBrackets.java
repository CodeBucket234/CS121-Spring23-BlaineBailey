import java.util.Stack;
//**********************************************************************************************************************
// Activity 32: Stacks
// Name: Blaine Bailey
// Date of Submission: 4/11/2023
//**********************************************************************************************************************
// This is the BalancedBrackets class. This class features two private instance variables: two stacks open and closed.
// The open stack stores all the open parenthesis, while closed stores the closing parenthesis. The only method in this
// class is checkBalance, which adds all opening parenthesis to open, and all closing parenthesis to closed. Then it
// checks the size of both stacks. If they are the same size, the stacks are cleared, and it returns a string that says
// balanced. Otherwise, both stacks are cleared and the string saying unbalanced is returned.
//**********************************************************************************************************************
public class BalancedBrackets {
    //Both instance variables storing instances of opening and closing parenthesis respectively
    private Stack open = new Stack();
    private Stack closed = new Stack();

    //Checks the balance of parenthesis by counting the number of each in a string
    public String checkBalance(String string) {
        //Count open and closed parenthesis
        for(int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if(c == '(') {
                open.push(c);
            }
            else if(c == ')') {
                closed.push(c);
            }
        }

        //Check if the number of open parenthesis is the same as the number of closed parenthesis
        if(open.size() == closed.size()) {
            open.clear();
            closed.clear();
            return "balanced";
        }
        else {
            open.clear();
            closed.clear();
            return "unbalanced";
        }
    }
}
