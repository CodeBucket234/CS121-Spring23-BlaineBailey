//**********************************************************************************************************************
// Activity 21: Static Keyword in Class
// Name: Blaine Bailey
// Date of Submission: 3/14/2023
//**********************************************************************************************************************
// The Person class has three instance variables: age, yearlyIncome, and address. In addition, there is a static
// variable: numPeople, which keeps track of the number of the instances of the Person class. The constructor
// initializes the instance variables and increments numPeople. The getNumPeople method returns the value of the
// numPeople static variable.
//**********************************************************************************************************************
public class Person {
    //Declaring instance variables
    private int age, yearlyIncome;
    private String address;

    //Declaring numPeople static variable and initializing it with value of 0
    private static int numPeople = 0;

    //Constructor that initializes instance variables and increments numPeople static variable
    public Person(int age, int income, String address) {
        this.age = age;
        this.yearlyIncome = income;
        this.address = address;
        numPeople++;
    }

    //Returns value of numPeople
    public int getNumPeople() {
        return numPeople;
    }
}
