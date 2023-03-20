public class BigO {
    public void printOnce(int num) {
        System.out.println(num);
    }
    public void printNTimes(int times) {
        for(int i = 0; i < times; i++) {
            System.out.println("This method runs in O(n) time.");
        }
    }
    public void printNSquaredTimes(int times) {
        for(int i = 0; i < times; i++) {
            for(int j = 0; j < times; j++) {
                System.out.println("This method runs in O(n Squared) time.");
            }
        }
    }
}