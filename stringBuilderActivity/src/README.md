Activity 36 uses StringBuilder to perform string concatenation. Activity 36 has three classes.

Pokemon.java comes from project 2 and creates pokemon objects. The constructor creates a custom pokemon with a specified name, move, hitPoints, movePower, and attackSpeed. The class also has getters and setters, and well as a displayPokemonStats method that returns a formatted string with all the stats of the pokemon.

PokemonRecord.java uses an array list to store multiple pokemon objects. The addPokemon method adds a pokemon object to the array list, and getAllPokemon uses a stringBuilder object to get all the stats for all the pokemon in the array list and concatenate them. The string builder object is converted to a string and returned.

Main.java creates an instance of the PokemonRecord class, and adds three Pokemon objects to the record. Then, the getAllPokemon method is used to get all the pokemon in the record and print their stats.
