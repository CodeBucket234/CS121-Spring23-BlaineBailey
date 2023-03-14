//**********************************************************************************************************************
// Activity 21: Static Keyword in Class
// Name: Blaine Bailey
// Date of Submission: 3/14/2023
//**********************************************************************************************************************
// This Main class creates three instances of the Person class: Sara, Sebastian, and Sylvia. The Main class uses each of
// these instances to call the getNumPeople method to display the number of people.
//**********************************************************************************************************************
public class Main {
    public static void main(String[] args) {
        Person Sara = new Person(24, 75000, "18456 Cherry St.");
        Person Sebastian = new Person(36, 90000, "90562 Silver Rd.");
        Person Sylvia = new Person(15, 0, "90562 Silver Rd.");

        System.out.printf("Sara counts %d people.\n", Sara.getNumPeople());
        System.out.printf("Sebastian counts %d people.\n", Sebastian.getNumPeople());
        System.out.printf("Sylvia counts %d people.", Sylvia.getNumPeople());
    }
}