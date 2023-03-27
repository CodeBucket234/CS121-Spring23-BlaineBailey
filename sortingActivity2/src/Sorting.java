import java.util.Scanner;
public class Sorting {
    Scanner input = new Scanner(System.in);
    public int[] getArray() {
        System.out.print("Enter integer 1: ");
        int i1 = Integer.parseInt(input.nextLine());
        System.out.print("Enter integer 2: ");
        int i2 = Integer.parseInt(input.nextLine());
        System.out.print("Enter integer 3: ");
        int i3 = Integer.parseInt(input.nextLine());
        System.out.print("Enter integer 4: ");
        int i4 = Integer.parseInt(input.nextLine());
        System.out.print("Enter integer 5: ");
        int i5 = Integer.parseInt(input.nextLine());

        int integers[] = {i1, i2, i3, i4, i5};

        return integers;
    }

    public int[] sortArray() {

    }
}
