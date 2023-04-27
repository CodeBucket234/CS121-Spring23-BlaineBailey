Activity 35 uses JUnit5 to test methods from a class. Activity 36 has two classes.

Pokemon.java comes from project 2 and creates pokemon objects. The constructor creates a custom pokemon with a specified name, move, hitPoints, movePower, and attackSpeed. The class also has getters and setters, and well as a displayPokemonStats method that returns a formatted string with all the stats of the pokemon.

PokemonTest.java uses JUnit5 to test two methods from Pokemon.java. The PokemonTest class creates an instance of the Pokemon class, then uses it to test both the getHitPoints and displayPokemonStats methods using assertEquals.
