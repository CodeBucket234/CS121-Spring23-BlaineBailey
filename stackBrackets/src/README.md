Activity 32 uses stacks. Activity 32 has 3 classes.

BalancedBrackets.java creates two stacks: one for opened parenthesis and one for closed parenthesis. The checkBalance method checks the balance of parenthesis in a string by adding the open and closed parenthesis to their respective stacks, and the size between the two is compared. If both stacks are the same size, then both stacks are cleared, and "balanced" is returned. Otherwise, both stacks are cleared, and "unbalanced" is returned.

BalancedAllBrackets.java works has 6 stacks, two for the parenthesis, two for the square brackets, and two for the curly braces. The checkParenthesisBalance method does the same thing as checkBalance for the BalancedBrackets class. In addition, the checkCurlyBalance and checkSquareBalance methods work the same as the checkParenthesis balance, except for curly braces and square brackets respectively. The checkTotalBalance method calls the previous three methods and determines if a string is balanced with all three brackets.

BalancedBracketsTester.java creates an instance of the BalancedBrackets class, and checks the checkBalance method by passing through different strings with parenthesis. Similarly, an instance of the BalancedAllBrackets class is created, and different strings are passed through checkTotalBalance featuring parenthesis, curly braces, and square brackets.
