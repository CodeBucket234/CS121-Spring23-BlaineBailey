package abstractClasses;
//**********************************************************************************************************************
// Activity 20: Abstract Class and Interface
// Name: Blaine Bailey
// Date of Submission: 3/13/2023
//**********************************************************************************************************************
// This is a subclass for the Gamer abstract class. This introduces one new variable that belongs to this subclass: the
// console, which stores the console the ConsolePlayer plays on. The constructor calls the constructor for the Gamer
// abstract class with three variables, as well as initializes the console that the console player plays on. This
// subclass implements the abstract method changeDevice from the Gamer abstract class, which changes the console the
// player plays on. This subclass also implements the toString method to display the current state of the console player
// in a string format.
//**********************************************************************************************************************
public class ConsolePlayer extends Gamer {
    //Declaring new instance variable
    private String console;

    //Constructor creates a new PC player with a specified number of games, hours played, username, and console
    public ConsolePlayer(int num, int hours, String name, String device) {
        super(num, hours, name);
        this.console = device;
    }

    //Implementing changeDevice abstract method from Gamer abstract class to change the console
    @Override
    public void changeDevice(String device) {
        this.console = device;
    }

    //Implementing toString abstract method to display current info for the computer player
    @Override
    public String toString() {
        return String.format("%s plays on the %s console. %s has %d games and %d hours played.", getUserName(), this.console, getUserName(), getGames(), getHours());
    }
}
