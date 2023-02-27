//**********************************************************************************************************************
// Activity 16: For Each and Multidimensional Arrays
// Name: Blaine Bailey
// Date of Submission: 2/26/2023
//**********************************************************************************************************************
// ArrayDemo2 makes a 4d array of numbers 82 through 162, and then go through the 4d array to print these contents.
// Click the green arrow, and then the program will give you a list of these numbers, and where they are in the 4d
// array.
//**********************************************************************************************************************
public class ArrayDemo2 {
    public static void main(String[] args) {
        //Creating another 4d array of new numbers
        int[][][][] numbers2 = new int[3][3][3][3];

        //Initializing the 4d array with all the numbers 82 through 162
        numbers2[0][0][0][0] = 82;
        numbers2[0][0][0][1] = 83;
        numbers2[0][0][0][2] = 84;

        numbers2[0][0][1][0] = 85;
        numbers2[0][0][1][1] = 86;
        numbers2[0][0][1][2] = 87;

        numbers2[0][0][2][0] = 88;
        numbers2[0][0][2][1] = 89;
        numbers2[0][0][2][2] = 90;

        numbers2[0][1][0][0] = 91;
        numbers2[0][1][0][1] = 92;
        numbers2[0][1][0][2] = 93;

        numbers2[0][1][1][0] = 94;
        numbers2[0][1][1][1] = 95;
        numbers2[0][1][1][2] = 96;

        numbers2[0][1][2][0] = 97;
        numbers2[0][1][2][1] = 98;
        numbers2[0][1][2][2] = 99;

        numbers2[0][2][0][0] = 100;
        numbers2[0][2][0][1] = 101;
        numbers2[0][2][0][2] = 102;

        numbers2[0][2][1][0] = 103;
        numbers2[0][2][1][1] = 104;
        numbers2[0][2][1][2] = 105;

        numbers2[0][2][2][0] = 106;
        numbers2[0][2][2][1] = 107;
        numbers2[0][2][2][2] = 108;

        numbers2[1][0][0][0] = 109;
        numbers2[1][0][0][1] = 110;
        numbers2[1][0][0][2] = 111;

        numbers2[1][0][1][0] = 112;
        numbers2[1][0][1][1] = 113;
        numbers2[1][0][1][2] = 114;

        numbers2[1][0][2][0] = 115;
        numbers2[1][0][2][1] = 116;
        numbers2[1][0][2][2] = 117;

        numbers2[1][1][0][0] = 118;
        numbers2[1][1][0][1] = 119;
        numbers2[1][1][0][2] = 120;

        numbers2[1][1][1][0] = 121;
        numbers2[1][1][1][1] = 122;
        numbers2[1][1][1][2] = 123;

        numbers2[1][1][2][0] = 124;
        numbers2[1][1][2][1] = 125;
        numbers2[1][1][2][2] = 126;

        numbers2[1][2][0][0] = 127;
        numbers2[1][2][0][1] = 128;
        numbers2[1][2][0][2] = 129;

        numbers2[1][2][1][0] = 130;
        numbers2[1][2][1][1] = 131;
        numbers2[1][2][1][2] = 132;

        numbers2[1][2][2][0] = 133;
        numbers2[1][2][2][1] = 134;
        numbers2[1][2][2][2] = 135;

        numbers2[2][0][0][0] = 136;
        numbers2[2][0][0][1] = 137;
        numbers2[2][0][0][2] = 138;

        numbers2[2][0][1][0] = 139;
        numbers2[2][0][1][1] = 140;
        numbers2[2][0][1][2] = 141;

        numbers2[2][0][2][0] = 142;
        numbers2[2][0][2][1] = 143;
        numbers2[2][0][2][2] = 144;

        numbers2[2][1][0][0] = 145;
        numbers2[2][1][0][1] = 146;
        numbers2[2][1][0][2] = 147;

        numbers2[2][1][1][0] = 148;
        numbers2[2][1][1][1] = 149;
        numbers2[2][1][1][2] = 150;

        numbers2[2][1][2][0] = 151;
        numbers2[2][1][2][1] = 152;
        numbers2[2][1][2][2] = 153;

        numbers2[2][2][0][0] = 154;
        numbers2[2][2][0][1] = 155;
        numbers2[2][2][0][2] = 156;

        numbers2[2][2][1][0] = 157;
        numbers2[2][2][1][1] = 158;
        numbers2[2][2][1][2] = 159;

        numbers2[2][2][2][0] = 160;
        numbers2[2][2][2][1] = 161;
        numbers2[2][2][2][2] = 162;

        //Using a for each loop to display all the values in the 4d array
        int i = 0;
        for (int[][][] dim1 : numbers2) {
            int j = 0;
            for (int[][] dim2 : dim1) {
                int k = 0;
                for (int[] dim3 : dim2) {
                    System.out.print("Position [  " + i + " ][  " + j + "  ][  " + k + " ]:");
                    System.out.print("\nNumbers  ( ");
                    int x = 0;
                    for (int dim4 : dim3) {

                        System.out.printf(" %d ", dim4);
                        x++;
                        // make sures the "," is placed after each value but not after the last value
                        if( x < 3) {
                            System.out.print(",");
                        }
                        //when x is 3 that means it has reached the end of the array and the closing parenthesis needs to be put in place.
                        else{
                            System.out.println(" )");
                        }
                    }

                    System.out.println();
                    k++;
                }
                j++;
            }
            i++;
        }
    }
}