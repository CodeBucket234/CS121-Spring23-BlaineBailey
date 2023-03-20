//**********************************************************************************************************************
// Names: Blaine Bailey and David Case
// Activity: Big O
// Date of Submission: 3/20/2023
//**********************************************************************************************************************
// The BigO class contains three methods. The printOnce method prints out the number that was passed into the function,
// and runs in O(1) time. The printNTimes method prints out the phrase "This method runs in O(n) time." the number of
// times passed into the function, and it runs in O(n) time. The printNSquaredTimes method prints out the phrase "This
// method runs in O(n Squared) time." the number of times passed into the function squared, and it runs in O(n Squared)
// time.
//**********************************************************************************************************************
public class BigO {
    //Prints out the value passed into the method
    //Runs in O(1) time
    public void printOnce(int num) {
        System.out.println(num);
    }

    //Prints out a statement the number of times passed into the method
    //Runs in O(n) time
    public void printNTimes(int times) {
        for(int i = 0; i < times; i++) {
            System.out.println("This method runs in O(n) time.");
        }
    }

    //Prints out a statement the number of times passed into the method squared
    //Runs in O(n Squared) times
    public void printNSquaredTimes(int times) {
        for(int i = 0; i < times; i++) {
            for(int j = 0; j < times; j++) {
                System.out.println("This method runs in O(n Squared) time.");
            }
        }
    }
}