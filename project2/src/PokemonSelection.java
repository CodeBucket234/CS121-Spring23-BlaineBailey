import java.util.Scanner;

public class PokemonSelection {
    Scanner input = new Scanner(System.in);

    public Pokemon createPokemon() {
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

        return new Pokemon(name, move, hp, pow, speed);
    }

    public void assignPokemon() {
        System.out.println("Player 1: Select a Pokemon and enter its stats");
        Pokemon pokemon1 = createPokemon();

        System.out.println();

        System.out.println("Player 2: Select a Pokemon and enter its stats");
        Pokemon pokemon2 = createPokemon();

        System.out.println();

        System.out.println("Player 1 Pokemon");
        System.out.println(pokemon1.displayPokemonStats());

        System.out.println();

        System.out.println("Player 2 Pokemon");
        System.out.println(pokemon2.displayPokemonStats());
    }
}