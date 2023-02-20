//**********************************************************************************************************************
// Activity 14: Overloaded Constructors and Methods
// Name: Blaine Bailey
// Date of Submission: 2/19/2023
//**********************************************************************************************************************
// To use this program, click the green arrow. This program uses the Pokemon class to create three pokemon using each of
// the overloaded constructors. The secondary pokemon is used to test the overloaded method, which is the LevelUp
// method. The secondary pokemon's starting stats are shown, then it is leveled up. The new stats for the secondary
// pokemon are shown after leveling up once. Then the secondary pokemon is leveled up four times using the overloaded
// method. The final stats are shown at the end.
//**********************************************************************************************************************
public class Main {
    public static void main(String[] args) {

        //Creating three pokemon to call each of the overloaded constructors.
        Pokemon primary = new Pokemon();
        Pokemon secondary = new Pokemon("Pikachu");
        Pokemon tertiary = new Pokemon("Lucario", 60, 6, 20);

        //Showing the base stats of the secondary pokemon
        System.out.printf("\nThe secondary pokemon's starting name is %s.\n", secondary.getName());
        System.out.printf("The secondary pokemon's starting health is %d.\n", secondary.getHP());
        System.out.printf("The secondary pokemon's starting level is %d.\n", secondary.getLVL());
        System.out.printf("The secondary pokemon's starting defense is %d.\n", secondary.getDefense());

        //Leveling up the secondary pokemon with the first instance of the overloaded method.
        secondary.LevelUp();

        //Showing the new stats of the secondary pokemon after leveling it up
        System.out.println("\nAfter leveling up once, here is the new stats for the secondary pokemon:");
        System.out.printf("The secondary pokemon's name is %s.\n", secondary.getName());
        System.out.printf("The secondary pokemon's new health is %d.\n", secondary.getHP());
        System.out.printf("The secondary pokemon's new level is %d.\n", secondary.getLVL());
        System.out.printf("The secondary pokemon's new defense is %d.\n\n", secondary.getDefense());

        //Using the other overloaded method to level up the secondary pokemon 4 times.
        secondary.LevelUp(4);

        //Showing the result of using both overloaded methods.
        System.out.println("\nAfter leveling up four more times, here is the final stats for the secondary pokemon:");
        System.out.printf("The secondary pokemon's ending name is %s.\n", secondary.getName());
        System.out.printf("The secondary pokemon's ending health is %d.\n", secondary.getHP());
        System.out.printf("The secondary pokemon's ending level is %d.\n", secondary.getLVL());
        System.out.printf("The secondary pokemon's ending defense is %d.\n", secondary.getDefense());
    }
}