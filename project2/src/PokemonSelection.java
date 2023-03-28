//Importing Scanner class
import java.util.Scanner;
//**********************************************************************************************************************
// Project 2: Pokemon Class
// Name: Blaine Bailey
// Date of Submission: 3/28/2023
//**********************************************************************************************************************
// This is the pokemonSelection class. This class has one instance variable, which is the input Scanner object that gets
// user input. The createPokemon method has no parameters, and it uses the input Scanner object to get user input for
// each pokemon stat. Then it calls the Pokemon constructor with each stat passed through the parameters. The
// assignPokemon method has no parameter and calls the createPokemon method for each of the two players. Then the method
// calls the displayPokemonStats method for each player's pokemon.
//**********************************************************************************************************************
public class PokemonSelection {

    //Creating Scanner object for input
    Scanner input = new Scanner(System.in);

    //Create a pokemon with user-defined values
    //Calls constructor from Pokemon class with inputted values
    public Pokemon createPokemon() {
        //Getting values from user
        System.out.print("Enter Name: ");
        String name = input.nextLine();
        System.out.print("Enter HP: ");
        int hp = Integer.parseInt(input.nextLine());
        System.out.print("Enter Move: ");
        String move = input.nextLine();
        System.out.print("Enter Move Power: ");
        int pow = Integer.parseInt(input.nextLine());
        System.out.print("Enter Attack Speed: ");
        int speed = Integer.parseInt(input.nextLine());

        //Call Pokemon constructor
        return new Pokemon(name, move, hp, pow, speed);
    }

    //Assigns two pokemon to two players using the createPokemon method
    public void assignPokemon() {
        //Prompt player 1 for stats of their pokemon
        System.out.println("Player 1: Select a Pokemon and enter its stats");
        Pokemon pokemon1 = createPokemon();

        //Empty line for formatting purposes
        System.out.println();

        //Prompt player 2 for stats of their pokemon
        System.out.println("Player 2: Select a Pokemon and enter its stats");
        Pokemon pokemon2 = createPokemon();

        //Empty line for formatting purposes
        System.out.println();

        //Display stats for player 1's pokemon
        System.out.println("Player 1 Pokemon");
        System.out.println(pokemon1.displayPokemonStats());

        //Empty line for formatting purposes
        System.out.println();

        //Display stats for player 2's pokemon
        System.out.println("Player 2 Pokemon");
        System.out.println(pokemon2.displayPokemonStats());

        input.close();
    }
}