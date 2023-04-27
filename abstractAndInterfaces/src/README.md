Activity 20 uses abstract classes and interfaces. Activity 20 has 2 packages, each with 4 classes.

The abstractClasses package contains one abstract parent class, two child classes, and the test class.

Gamer.java is the abstract parent class with 3 private instance variables: number of games, hours played, and username. The constructor creates a gamer with a specified number of games, hours played, and username. Gamer.java also features getters, and two abstract methods, changeDevice(String device) and toString().

Both ConsolePlayer.java and ComputerPlayer.java are child classes to Gamer.java. Their constructors call the Gamer constructor, and they also set the device to a specified device. They override the changeDevice(String device) method to change the device and toString() method to display all the information about the player.

TestClass.java from the abstractClasses package creates instances of both the ConsolePlayer and ComputerPlayer classes, as well as using the changeDevice methods to change the devices. The toString() method is also used to display the information of the players.

The interfaces package contains one interface, two classes, and a test class.

Value.java is an interface that contains one method that will be used to calculate the value of something based on the change over time, the changeValue(int change) method.

Both Car.java and Home.java implement the Value interface. They both have constructors that create either a car or home object with a specified value. Both classes override the changeValue(int change) method. The Car class depreciates the value of a car object based on the change to the value, while the Home class appreciates the value of a Home object depending on the change to the value. They also both use a toString method to display the current state of the object.

TestClass.java from the interfaces package create instances of the Car and Home classes, and then call on their changeValue methods. The toString method is used to print the results.
