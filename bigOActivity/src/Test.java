//**********************************************************************************************************************
// Names: Blaine Bailey and David Case
// Activity: Big O
// Date of Submission: 3/20/2023
//**********************************************************************************************************************
// This is the testing class for the BigO class. The program creates an instance of the BigO class, and then uses the
// class to call each of the three methods. The number 6 is passed into the printOnce method, which prints out the
// number 6 into the console. The number 4 is passed into the printNTimes method, which prints out "This method runs in
// O(n) time." 4 times. The number 3 is passed into the printNSquaredTimes method, which prints out "This method runs in
// O(n Squared) time." 9 times, because 3 squared is 9.
//**********************************************************************************************************************
public class Test {
    public static void main(String[] args) {
        //Create instance of BigO class
        BigO o = new BigO();

        //Call printOnce method with 6 as the argument
        o.printOnce(6);
        System.out.println();
        //Call printNTimes method with 4 as the argument
        o.printNTimes(4);
        System.out.println();
        //Call printNSquaredTimes method with 3 as the argument
        o.printNSquaredTimes(3);
    }
}
