package abstractClasses;
//**********************************************************************************************************************
// Activity 20: Abstract Class and Interface
// Name: Blaine Bailey
// Date of Submission: 3/13/2023
//**********************************************************************************************************************
// This is the abstract class that has three instance variables: numGames, hoursPlayed, and userName. The constructor
// initializes a gamer with a specified number of games, hours played, and a username. This constructor is called in the
// ComputerPlayer and ConsolePlayer subclasses. This class has two abstract methods, changeDevice, and toString. The
// changeDevice method is the main abstract method for this activity, and it changes the device the player is playing
// on. The other abstract method, toString, will be used to print out the current state of either the console gamer or
// the PC gamer, depending on which class the gamer object belongs to. The getters are used by the subclasses to access
// the private variables for their toString methods.
//**********************************************************************************************************************
public abstract class Gamer {
    //Declaring private instance variables
    private int numGames, hoursPlayed;
    private String userName;

    //This constructor initializes the three instance variables
    //This constructor is used by the subclasses ComputerPlayer and ConsolePlayer
    public Gamer(int num, int hours, String name) {
        this.numGames = num;
        this.hoursPlayed = hours;
        this.userName = name;
    }

    //Abstract method implemented in the subclasses
    public abstract void changeDevice(String device);

    //Getters used for the abstract method toString
    public int getGames() {
        return this.numGames;
    }

    public int getHours() {
        return this.hoursPlayed;
    }

    public String getUserName() {
        return this.userName;
    }

    //Abstract toString method to display current states of the objects belonging to the subclasses
    public abstract String toString();
}