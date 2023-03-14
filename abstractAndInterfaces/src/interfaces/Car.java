package interfaces;
//**********************************************************************************************************************
// Activity 20: Abstract Class and Interface
// Name: Blaine Bailey
// Date of Submission: 3/13/2023
//**********************************************************************************************************************
// The Car class contains one instance variable, carValue, that keeps track of the value of the car. The Car class
// implements the Value interface and uses the abstract method changeValue to depreciate the value of the car. The Car
// class also uses the toString method to display the value of the car.
//**********************************************************************************************************************
public class Car implements Value {
    //Declaring the homeValue integer to store the value of the car
    int carValue;

    //The constructor creates a Car object with an initial carValue
    public Car(int value) {
        this.carValue = value;
    }

    //Implementing abstract method changeValue from Value interface to calculate new value of a car
    //This method will depreciate the value of the car
    public void changeValue(int change) {
        this.carValue -= change;
    }

    //Using toString method to print out car value for test class
    public String toString() {
        return String.format("The value of this car is currently $%d.", this.carValue);
    }
}
