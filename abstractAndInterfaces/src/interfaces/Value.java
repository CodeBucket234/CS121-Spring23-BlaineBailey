package interfaces;
//**********************************************************************************************************************
// Activity 20: Abstract Class and Interface
// Name: Blaine Bailey
// Date of Submission: 3/13/2023
//**********************************************************************************************************************
// This is the interface that contains one abstract method, the changeValue method, which will be used in the Car and
// Home classes to calculate the value for a Car and a Home respectively based on a change passed as an argument.
//**********************************************************************************************************************
public interface Value {
    //Abstract method to calculate new value
    void changeValue(int change);
}
