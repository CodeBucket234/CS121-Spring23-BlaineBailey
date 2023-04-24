package applicationOfKnowledge;

public class Main {
    public static void main(String[] args) {
        //Create instance of makeArray class
        makeArray userArray = new makeArray();

        //Create an array
        int[] array = userArray.createArray();

        //Empty line for formatting purposes
        System.out.println();

        //Create instance of findRepeatNum class
        findRepeatNum findNum = new findRepeatNum();

        //Print out the repeating number or print that there is no repeating number
        findNum.printResults(array);
    }
}