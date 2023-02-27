//**********************************************************************************************************************
// Activity 16: For Each and Multidimensional Arrays
// Name: Blaine Bailey
// Date of Submission: 2/26/2023
//**********************************************************************************************************************
// ArrayDemo1 makes a 4d array of numbers 1 through 81, and then go through the 4d array to print these contents.
// Click the green arrow, and then the program will give you a list of these numbers, and where they are in the 4d
// array.
//**********************************************************************************************************************
public class ArrayDemo1 {

    public static void main(String[] args)
    {
        //Creating 4d array of numbers
        int[][][][] numbers = new int[3][3][3][3];

        //Initializing the 4d array with all the numbers 1 through 81
        numbers[0][0][0][0] = 1;
        numbers[0][0][0][1] = 2;
        numbers[0][0][0][2] = 3;

        numbers[0][0][1][0] = 4;
        numbers[0][0][1][1] = 5;
        numbers[0][0][1][2] = 6;

        numbers[0][0][2][0] = 7;
        numbers[0][0][2][1] = 8;
        numbers[0][0][2][2] = 9;

        numbers[0][1][0][0] = 10;
        numbers[0][1][0][1] = 11;
        numbers[0][1][0][2] = 12;

        numbers[0][1][1][0] = 13;
        numbers[0][1][1][1] = 14;
        numbers[0][1][1][2] = 15;

        numbers[0][1][2][0] = 16;
        numbers[0][1][2][1] = 17;
        numbers[0][1][2][2] = 18;

        numbers[0][2][0][0] = 19;
        numbers[0][2][0][1] = 20;
        numbers[0][2][0][2] = 21;

        numbers[0][2][1][0] = 22;
        numbers[0][2][1][1] = 23;
        numbers[0][2][1][2] = 24;

        numbers[0][2][2][0] = 25;
        numbers[0][2][2][1] = 26;
        numbers[0][2][2][2] = 27;

        numbers[1][0][0][0] = 28;
        numbers[1][0][0][1] = 29;
        numbers[1][0][0][2] = 30;

        numbers[1][0][1][0] = 31;
        numbers[1][0][1][1] = 32;
        numbers[1][0][1][2] = 33;

        numbers[1][0][2][0] = 34;
        numbers[1][0][2][1] = 35;
        numbers[1][0][2][2] = 36;

        numbers[1][1][0][0] = 37;
        numbers[1][1][0][1] = 38;
        numbers[1][1][0][2] = 39;

        numbers[1][1][1][0] = 40;
        numbers[1][1][1][1] = 41;
        numbers[1][1][1][2] = 42;

        numbers[1][1][2][0] = 43;
        numbers[1][1][2][1] = 44;
        numbers[1][1][2][2] = 45;

        numbers[1][2][0][0] = 46;
        numbers[1][2][0][1] = 47;
        numbers[1][2][0][2] = 48;

        numbers[1][2][1][0] = 49;
        numbers[1][2][1][1] = 50;
        numbers[1][2][1][2] = 51;

        numbers[1][2][2][0] = 52;
        numbers[1][2][2][1] = 53;
        numbers[1][2][2][2] = 54;

        numbers[2][0][0][0] = 55;
        numbers[2][0][0][1] = 56;
        numbers[2][0][0][2] = 57;

        numbers[2][0][1][0] = 58;
        numbers[2][0][1][1] = 59;
        numbers[2][0][1][2] = 60;

        numbers[2][0][2][0] = 61;
        numbers[2][0][2][1] = 62;
        numbers[2][0][2][2] = 63;

        numbers[2][1][0][0] = 64;
        numbers[2][1][0][1] = 65;
        numbers[2][1][0][2] = 66;

        numbers[2][1][1][0] = 67;
        numbers[2][1][1][1] = 68;
        numbers[2][1][1][2] = 69;

        numbers[2][1][2][0] = 70;
        numbers[2][1][2][1] = 71;
        numbers[2][1][2][2] = 72;

        numbers[2][2][0][0] = 73;
        numbers[2][2][0][1] = 74;
        numbers[2][2][0][2] = 75;

        numbers[2][2][1][0] = 76;
        numbers[2][2][1][1] = 77;
        numbers[2][2][1][2] = 78;

        numbers[2][2][2][0] = 79;
        numbers[2][2][2][1] = 80;
        numbers[2][2][2][2] = 81;

        //Print out all the numbers using for loop
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                for(int k = 0; k < 3; k++) {
                    for(int l = 0; l < 3; l++) {
                        System.out.printf("Number at position (%d, %d, %d, %d): %d\n", i, j, k, l, numbers[i][j][k][l]);
                    }
                }
            }
        }
    }
}