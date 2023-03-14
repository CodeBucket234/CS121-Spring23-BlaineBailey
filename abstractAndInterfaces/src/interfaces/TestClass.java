package interfaces;
//**********************************************************************************************************************
// Activity 20: Abstract Class and Interface
// Name: Blaine Bailey
// Date of Submission: 3/13/2023
//**********************************************************************************************************************
// This test class creates a car called a Jeep that starts with a value of $40000. The changeValue abstract method is
// then used to depreciate the value of the Jeep car by $15000. The toString method is used to display the new value of
// the Jeep. Then a new Home object, called LargeHome, is created with an initial value of $500000. The abstract method
// changeValue is used to appreciate the value of the home by $50000. Then the toString method is called to display the
// new value of the LargeHome.
//**********************************************************************************************************************
public class TestClass {
    public static void main(String[] args) {
        //Testing Car Class
        Car Jeep = new Car(40000);

        //Testing abstract method changeValue from Value interface.
        Jeep.changeValue(15000);

        //Using toString method to print out current value of Jeep after changeValue method.
        System.out.println(Jeep);
        //End testing for Car class

        //Begin testing Home class
        Home LargeHome = new Home(500000);

        //Testing abstract method changeValue from Value interface.
        LargeHome.changeValue(50000);

        //Using toString method to print out current value of LargeHome after changeValue method.
        System.out.println(LargeHome);
    }
}
