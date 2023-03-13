package inheritance;
//**********************************************************************************************************************
// Activity 19: Inheritance Activity
// Name: Blaine Bailey
// Date of Submission: 3/13/2023
//**********************************************************************************************************************
// This is the superclass with three instance variables: numGames, which stores the number of games, hoursPlayed, which
// stores the number of hours played, and userName, which stores the name of the user playing on a gaming platform. The
// superclass has a default constructor, features getters to get all the variables, and setters to set the values of
// each individual variable. The superclass also contains a toString method to get the current state of each variable in
// string format.
//**********************************************************************************************************************
public class GamingPlatform {
//Declaring instance variables
    int numGames;
    int hoursPlayed;
    String userName;

    //Default constructor fot the GamingPlatform superclass
    public GamingPlatform() {
        this.numGames = 0;
        this.hoursPlayed = 0;
        this.userName = "default-user";
    }

    //Getters
    public int getGames() {
        return this.numGames;
    }

    public int getHours() {
        return this.hoursPlayed;
    }

    public String getUser() {
        return this.userName;
    }

    //Setters
    public void setNumGames(int num) {
        this.numGames = num;
    }

    public void setHours(int hours) {
        this.hoursPlayed = hours;
    }

    public void setUser(String name) {
        this.userName = name;
    }

    //toString method
    public String toString() {
        String string = String.format("%s has %d games and has %d hours played.", getUser(), getGames(), getHours());
        return string;
    }
}