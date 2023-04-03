//**********************************************************************************************************************
// Activity 30: HashMap Activity
// Name: Blaine Bailey
// Date of Submission: 4/2/2023
//**********************************************************************************************************************
// This is the Main class. This program creates an instance of the HashMapActivity class, then adds three key/value
// pairs to the hashmap that is meant to resemble usernames and passwords. Then the program displays all 3 key/value
// pairs. Then the program removes one key/value pair, and displays the remaining 2 key/value pairs.
//**********************************************************************************************************************
public class Main {
    public static void main(String[] args) {
        //Create instance of the HashMapActivity class
        HashMapActivity hashDemo = new HashMapActivity();

        //Add 3 key/value pairs
        hashDemo.addPair("RandomUser123", "Passw0rd");
        hashDemo.addPair("GoodCoderPerson10110", "s3cuR3-P45Sw0rD");
        hashDemo.addPair("ImaginaryPerson", "123456");

        //Display all 3 key/value pairs
        hashDemo.display("RandomUser123");
        hashDemo.display("GoodCoderPerson10110");
        hashDemo.display("ImaginaryPerson");

        //Empty line for formatting purposes
        System.out.println();

        //Remove a key/value pair
        hashDemo.removePair("ImaginaryPerson");

        //Display the remaining 2 key/value pairs
        hashDemo.display("RandomUser123");
        hashDemo.display("GoodCoderPerson10110");
    }
}