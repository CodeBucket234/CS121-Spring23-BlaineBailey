import java.util.*;
//**********************************************************************************************************************
// Activity 30: HashMap Activity
// Name: Blaine Bailey
// Date of Submission: 4/2/2023
//**********************************************************************************************************************
// This is the HashMapActivity class. This class has one instance variable, which is a hashmap. This class features a
// method to add a key/value pair, remove a key/value pair based on the key, get a value from a key/value pair based on
// the key, and a method to display an entire key/value pair based on the key.
//**********************************************************************************************************************
public class HashMapActivity {
    //Declare empty hashmap for each instance of the class
    private HashMap<String, String> hash = new HashMap<>();

    //Add a key/value pair based on key
    public void addPair(String key, String value) {
        hash.put(key, value);
    }

    //Remove a key/value pair
    public void removePair(String key) {
        hash.remove(key);
    }

    //Get a value from a key/value pair based on key
    public String getValue(String key) {
        return hash.get(key);
    }

    //Display key/value pair based on key
    public void display(String key) {
        System.out.printf("(%s, %s)\n", key, getValue(key));
    }
}
