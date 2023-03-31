import java.util.ArrayList;
//**********************************************************************************************************************
// Activity 29: Generics Activity
// Name: Blaine Bailey
// Date of Submission: 3/31/2023
//**********************************************************************************************************************
// This is the GenericMethods class. This class has one generic method: printArrayList. printArrayList takes in an
// ArrayList of any type as an argument, and will print out the contents of the ArrayList.
//**********************************************************************************************************************
public class GenericMethods {
    //Print the contents of an ArrayList of any type
    public void printArrayList(ArrayList array) {
        for(int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
    }
}
