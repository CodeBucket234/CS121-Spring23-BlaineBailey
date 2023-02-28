package stringArrayList;
import java.util.ArrayList;
//**********************************************************************************************************************
// Activity 17: ArrayLists and Jumps
// Name: Blaine Bailey
// Date of Submission: 2/28/2023
//**********************************************************************************************************************
// This program uses the ArrayList class in Java to create a list of pokemon. Click the green arrow, and the string
// array list will be initialized. Then, four pokemon and one soda will be added to the array list. Then, the program
// will remove the soda from the list at index 3. Then, the program will display how many pokemon you have and what
// your second pokemon (at index 1) is. Then the program will use both the for each loop and the for loop to display all
// the pokemon.
//**********************************************************************************************************************
public class StringArrayList {
    public static void main(String[] args) {
        //Create string ArrayList for pokemon
        ArrayList<String> pokemon = new ArrayList<String>();

        //Add 5 strings to pokemon ArrayList
        pokemon.add("Pikachu");
        pokemon.add("Lucario");
        pokemon.add("Snivy");
        pokemon.add("Coca-Cola");
        pokemon.add("Bisharp");

        //Remove Coca-Cola from ArrayList
        pokemon.remove(3);

        //Display number of pokemon
        System.out.printf("You have %d pokemon.\n", pokemon.size());

        //Display the pokemon at index 1
        System.out.printf("Your second pokemon is %s.\n\n", pokemon.get(1));

        //Use for each loop to display all the pokemon
        for (String pokemons: pokemon) {
            System.out.println(pokemons);
        }

        //Create empty line for formatting purposes
        System.out.println();

        //Using for loop to display all the pokemon
        for(int i = 0; i < pokemon.size(); i++) {
            System.out.printf("Pokemon %d is %s.\n", (i+1), pokemon.get(i));
        }
    }
}