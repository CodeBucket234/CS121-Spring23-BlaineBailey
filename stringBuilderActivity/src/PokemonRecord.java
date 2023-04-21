import java.util.ArrayList;

public class PokemonRecord {
    private ArrayList<Pokemon> allPokemon = new ArrayList<>();

    public void addPokemon(Pokemon pokemon) {
        allPokemon.add(pokemon);
    }

    public StringBuilder getAllPokemon() {
        StringBuilder strBuilder = new StringBuilder();
        for(Pokemon pokemon : allPokemon) {
            strBuilder.append(pokemon.displayPokemonStats() + "\n\n");
        }
        return strBuilder;
    }
}