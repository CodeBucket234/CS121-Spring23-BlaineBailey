//**********************************************************************************************************************
// Activity 36: StringBuilder Activity
// Name: Blaine Bailey
// Date of Submission: 4/21/2023
//**********************************************************************************************************************
// This is the Main class. This program creates an instance of the PokemonRecord class, and then adds three pokemon to
// the record. Finally, the program uses the record object to call the getAllPokemon method to return a StringBuilder
// object with the stats of all the pokemon in the record.
//**********************************************************************************************************************
public class Main {
    public static void main(String[] args) {
        //Creating instance of the PokemonRecord class
        PokemonRecord record = new PokemonRecord();

        //Adding 3 pokemon to the pokemon record
        record.addPokemon(new Pokemon("Charizard", "Fireball", 100, 20, 15));
        record.addPokemon(new Pokemon("Lopunny", "Bite", 75, 10, 35));
        record.addPokemon(new Pokemon("Magikarp", "Brine", 50, 50, 25));

        //Display all pokemon in record
        System.out.println(record.getAllPokemon());
    }
}