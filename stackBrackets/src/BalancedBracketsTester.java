//**********************************************************************************************************************
// Activity 32: Stacks
// Name: Blaine Bailey
// Date of Submission: 4/11/2023
//**********************************************************************************************************************
// This is the BalancedBracketsTester class. This program creates an instance of the BalancedBrackets class, then tests
// the checkBalance method. Similarly, the program creates an instance of the BalancedAllBrackets class, then tests the
// checkTotalBalance method.
//**********************************************************************************************************************
public class BalancedBracketsTester {
    public static void main(String[] args) {
        //Create instance of BalancedBrackets class
        BalancedBrackets balanced = new BalancedBrackets();

        //Testing BalancedBrackets class
        System.out.println("Testing BalancedBrackets class");

        //Testing checkBalance method
        System.out.println(balanced.checkBalance("()"));
        System.out.println(balanced.checkBalance("(()())"));
        System.out.println(balanced.checkBalance("((((()(())))))"));
        System.out.println(balanced.checkBalance("(()"));

        //Empty line for formatting
        System.out.println();

        //Now testing optional BalancedAllBrackets class
        System.out.println("Now testing optional BalancedAllBrackets class");

        //Create instance of BalancedAllBrackets class
        BalancedAllBrackets allBalanced = new BalancedAllBrackets();

        //Test checkTotalBalance method
        System.out.println(allBalanced.checkTotalBalance("(([{}]))"));
        System.out.println(allBalanced.checkTotalBalance("{]()}"));
        System.out.println(allBalanced.checkTotalBalance("{{()][[]}"));
        System.out.println(allBalanced.checkTotalBalance("(()([]{}}{"));
        System.out.println(allBalanced.checkTotalBalance("{[][]}{}"));
    }
}