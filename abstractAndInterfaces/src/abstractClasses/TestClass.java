package abstractClasses;
//**********************************************************************************************************************
// Activity 20: Abstract Class and Interface
// Name: Blaine Bailey
// Date of Submission: 3/13/2023
//**********************************************************************************************************************
// This test class creates Stacy the console player. Then it tests the abstract method changeDevice for Stacy, which
// the device she plays on from an Xbox One to an Xbox One Series X. The abstract toString method then is used to
// display the results from the changeDevice abstract method. Then the test class also creates a PC player Kyle. The
// abstract method changeDevice is used to change Kyle's PC from an Omen PC to a RTX 9000 RGB PC. The abstract method
// toString is used to display Kyle's results from the changeDevice abstract method.
//**********************************************************************************************************************
public class TestClass {
    public static void main(String[] args) {
        ConsolePlayer Stacy = new ConsolePlayer(15, 3000, "ZestyRabbit1305", "Xbox One");

        //Testing abstract method
        Stacy.changeDevice("Xbox One Series X");

        //Using toString method to print results. The abstract method changes the console.
        System.out.println(Stacy);

        //End of Testing Console Player

        //Testing Computer Player
        ComputerPlayer Kyle = new ComputerPlayer(10, 1500, "XxShadow666BoyxX", "Omen");

        //Testing abstract method
        Kyle.changeDevice("RTX 9000 RGB");

        //Using toString method to print results. The abstract method changes the PC.
        System.out.println(Kyle);
    }
}
