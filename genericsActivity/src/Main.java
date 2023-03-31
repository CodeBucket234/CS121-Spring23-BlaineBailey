//Import all classes from Collections
import java.util.*;
//**********************************************************************************************************************
// Activity 29: Generics Activity
// Name: Blaine Bailey
// Date of Submission: 3/31/2023
//**********************************************************************************************************************
// This is the main method. This program creates 4 ArrayLists of different data types, and then creates an instance of
// the GenericMethods class. The instance of the GenericMethods class is used to call the generic printArrayList method
// to print out the contents of arrayLists of different types.
//**********************************************************************************************************************
public class Main {
    public static void main(String[] args) {
        //Create and initialize ArrayLists of different types with different values
        ArrayList<Integer> integers = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5)
        );
        ArrayList<Double> doubles = new ArrayList<>(
                Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5)
        );
        ArrayList<Character> chars = new ArrayList<>(
                Arrays.asList('a', 'b', 'c', 'd', 'e')
        );
        ArrayList<String> strings = new ArrayList<>(
                Arrays.asList("alpha", "beta", "gamma", "delta", "epsilon")
        );

        //Create instance of GenericMethods class
        GenericMethods generic = new GenericMethods();

        //Use method printArrayList to print out the contents for all arrayLists
        //Use empty lines for formatting
        generic.printArrayList(integers);
        System.out.println();
        generic.printArrayList(doubles);
        System.out.println();
        generic.printArrayList(chars);
        System.out.println();
        generic.printArrayList(strings);
    }
}