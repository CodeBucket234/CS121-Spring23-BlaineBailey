package inheritance;
//**********************************************************************************************************************
// Activity 19: Inheritance Activity
// Name: Blaine Bailey
// Date of Submission: 3/13/2023
//**********************************************************************************************************************
// This is a subclass of the GamingPlatform superclass. This subclass inherits all the instance variables of the
// superclass in addition to a new instance variable: the PC_Type, which stores the PC that the user plays on.
// The constructor for the ComputerPlatform subclass uses the super keyword to call the constructor for the superclass
// to get its instance variables. In addition, it also sets a default value for the PC type. The subclass features
// getters and setters, as well as a modified version of the toString method to print out the current state of all the
// instance variables, including the PC type.
//**********************************************************************************************************************
public class ComputerPlatform extends GamingPlatform {
    //Declaring PC type variable
    String PC_Type;

    //Default constructor for the ComputerPlatform subclass
    public ComputerPlatform() {
        super();
        this.PC_Type = "default PC";
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
        return this.PC_Type;
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
        this.PC_Type = type;
    }

    //toString method
    @Override
    public String toString() {
        String string = String.format("%s is playing on a %s PC. %s has %d games and %d hours played.", getUser(), getType(), getUser(), getGames(), getHours());
        return string;
    }
}
