import java.util.ArrayList;
//**********************************************************************************************************************
// Activity 36: StringBuilder Activity
// Name: Blaine Bailey
// Date of Submission: 4/21/2023
//**********************************************************************************************************************
// This is the PokemonRecord class. This class has one instance variable: an arrayList called allPokemon used to hold
// all the pokemon within the record. The method addPokemon adds a pokemon to the record. The method getAllPokemon uses
// StringBuilder to return the stats for all the pokemon in the record.
//**********************************************************************************************************************
public class PokemonRecord {
    //Declaring instance arrayList to hold all pokemon in record
    private ArrayList<Pokemon> allPokemon = new ArrayList<>();

    //Adds pokemon to the record
    public void addPokemon(Pokemon pokemon) {
        allPokemon.add(pokemon);
    }

    //Uses StringBuilder to return all the stats for all the pokemon in the record
    public String getAllPokemon() {
        StringBuilder strBuilder = new StringBuilder();
        for(Pokemon pokemon : allPokemon) {
            strBuilder.append(pokemon.displayPokemonStats());
        }
        return strBuilder.toString();
    }
}