package interfaces;
//**********************************************************************************************************************
// Activity 20: Abstract Class and Interface
// Name: Blaine Bailey
// Date of Submission: 3/13/2023
//**********************************************************************************************************************
// The Home class contains one instance variable, carValue, that keeps track of the value of the Home. The Home class
// implements the Value interface and uses the abstract method changeValue to appreciate the value of the Home. The Home
// class also uses the toString method to display the value of the home.
//**********************************************************************************************************************
public class Home implements Value {
    //Declaring the homeValue integer to store the value of the home
    int homeValue;

    //The constructor creates a Home object with an initial homeValue
    public Home(int value) {
        this.homeValue = value;
    }

    //Implementing abstract method changeValue from Value interface to calculate new value of a home
    //This method will appreciate the value of the home
    public void changeValue(int change) {
        this.homeValue += change;
    }

    //Using toString method to print out home value for test class
    public String toString() {
        return String.format("The value of this home is currently $%d.", this.homeValue);
    }
}
