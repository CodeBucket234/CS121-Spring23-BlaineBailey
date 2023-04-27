Activity 19 uses inheritance to create child classes from a parent class. Activity 19 has 3 classes.

GamingPlatform.java is the parent class to the other two child classes. GamingPlatform has 3 instance variables: number of games, hours played, and the username. The constructor is a default constructor that creates a default user. This class has getters and setters, and a toString() method that prints out the state of a GamingPlatform object.

ConsolePlatform.java is a child class to GamingPlatform, and it features one additional instance variable: the console type. The constructor is a default constructor that calls the GamingPlatform default constructor and sets the console type to default console. The getters and setters are overridden, as well as the toString() method to include the console type.

ComputerPlatform.java is a child class to GamingPlatform, and it features one additional instance variable: the PC type. The constructor is a default constructor that calls the GamingPlatform default constructor and sets the console type to default PC. The getters and setters are overridden, as well as the toString() method to include the PC type.
