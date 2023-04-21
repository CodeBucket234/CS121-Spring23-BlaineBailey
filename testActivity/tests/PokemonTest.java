import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
//**********************************************************************************************************************
// Activity 35: Testing Activity
// Name: Blaine Bailey
// Date of Submission: 4/21/2023
//**********************************************************************************************************************
// This is the PokemonTest class under the tests testing folder. This folder uses JUnit5 as specified in the directions,
// and this testing class tests two methods from the Pokemon class: getHitPoints, and displayPokemonStats. getHitPoints
// should return an integer that represents the amount of hit points the pokemon has, while displayPokemonStats should
// return a formatted string containing all the information about the Pokemon. These two tests use an instance of the
// Pokemon class, and they show the correct conditions that proves that these methods work as intended, while the
// incorrect conditions are commented out.
//**********************************************************************************************************************
class PokemonTest {
    //Create instance of Pokemon Class for testing purposes
    Pokemon testPokemon = new Pokemon("Charizard", "Fireball", 100, 15, 10);

    //Testing getHitPoints with correct conditions
    @Test
    void getHitPoints() {
        //assertEquals(100, testPokemon.getHitPoints()); --> Incorrect condition
        assertEquals(100, testPokemon.getHitPoints());
    }

    //Testing displayPokemonStats with correct conditions
    @Test
    void displayPokemonStats() {
        //assertEquals("Name: Lopunny Hit Points: 75 Move: Bite Move Power: 10 Attack Speed: 30", testPokemon.displayPokemonStats()); --> Incorrect condition
        assertEquals("Name: Charizard\nHit Points: 100\nMove: Fireball\nMove Power: 15\nAttack Speed: 10", testPokemon.displayPokemonStats());
    }
}