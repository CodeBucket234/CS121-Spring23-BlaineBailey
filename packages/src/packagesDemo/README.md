Activity 13 used encapsulation to limit access to private variables. Activity 13 has one class.

Pokemon.java has two public string variables: name and pokemon type, and three private variables: health, level, and defense. The constructor for the class creates a pokemon with a specified name, type, health, level, and defense. There are getters that return each of these variables, and setters that change their values. These getters and setters restrict access to the private variables as well as restrict how these variables are used.

TestClass.java creates an instance of the Pokemon class and uses the getters to display the stats for the pokemon. The setters are then called to change each of the values for the stats of the pokemon, and the stats are displayed again using the getters.
