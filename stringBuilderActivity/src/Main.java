public class Main {
    public static void main(String[] args) {
        PokemonRecord record = new PokemonRecord();

        record.addPokemon(new Pokemon("Charizard", "Fireball", 100, 20, 15));
        record.addPokemon(new Pokemon("Lopunny", "Bite", 75, 10, 35));
        record.addPokemon(new Pokemon("Magikarp", "Brine", 50, 50, 25));

        System.out.println(record.getAllPokemon());
    }
}