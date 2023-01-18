package WeekOne;
import java.util.Scanner;
public class MathMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1st Integer: ");
        int x = input.nextInt();
        System.out.print("2nd Integer: ");
        int y = input.nextInt();
        System.out.print("Double value: ");
        double z = input.nextDouble();

        System.out.printf("Max value of x and y: %d\n", Math.max(x, y));
        System.out.printf("Min value of x and y: %d\n", Math.min(x, y));
        System.out.printf("Square root of z: %.3f\n", Math.sqrt(z));
        System.out.printf("x to the power of y: %.0f\n", Math.pow(x, y));
        System.out.printf("Ceiling of z: %.0f\n", Math.ceil(z));
        System.out.printf("Floor of z: %.0f\n", Math.floor(z));
        System.out.printf("z rounded: %d\n", Math.round(z));
        System.out.printf("Absolute value of x: %d\n", Math.abs(-x));
    }
}
