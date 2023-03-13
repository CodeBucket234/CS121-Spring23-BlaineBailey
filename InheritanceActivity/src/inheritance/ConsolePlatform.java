package inheritance;
//**********************************************************************************************************************
// Activity 19: Inheritance Activity
// Name: Blaine Bailey
// Date of Submission: 3/12/2023
//**********************************************************************************************************************
// This is a subclass of the GamingPlatform superclass. This subclass inherits all the instance variables of the
// superclass in addition to a new instance variable: the consoleType, which stores the console that the user plays on.
// The constructor for the ConsolePlatform subclass uses the super keyword to call the constructor for the superclass to
// get its instance variables. In addition, it also sets a default value for the console type. The subclass features
// getters and setters, as well as a modified version of the toString method to print out the current state of all the
// instance variables, including the console type.
//**********************************************************************************************************************
public class ConsolePlatform extends GamingPlatform {
    //Declaring Console type variable
    String consoleType;

    //Default constructor for ConsolePlatform subclass
    public ConsolePlatform() {
        super();
        consoleType = "default console";
    }

    //Getters
    @Override
    public int getGames() {
        return this.numGames;
    }

    @Override
    public int getHours() {
        return this.hoursPlayed;
    }

    @Override
    public String getUser() {
        return this.userName;
    }

    public String getType() {
        return this.consoleType;
    }

    //Setters
    @Override
    public void setNumGames(int num) {
        this.numGames = num;
    }

    @Override
    public void setHours(int hours) {
        this.hoursPlayed = hours;
    }

    @Override
    public void setUser(String name) {
        this.userName = name;
    }

    public void setType(String type) {
        this.consoleType = type;
    }

    //toString method
    @Override
    public String toString() {
        String string = String.format("%s plays on the %s console. %s has %d games and %d hours played.", getUser(), getType(), getUser(), getGames(), getHours());
        return string;
    }
}
