import java.util.Stack;

public class BalancedBrackets {
    Stack open = new Stack();
    Stack closed = new Stack();

    public String checkBalance(String string) {
        for(int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if(c == '(') {
                open.push(c);
            }
            else if(c == ')') {
                closed.push(c);
            }
        }
        if(open.empty()) {
            return "balanced";
        }
        else {
            return "unbalanced";
        }
    }
}
