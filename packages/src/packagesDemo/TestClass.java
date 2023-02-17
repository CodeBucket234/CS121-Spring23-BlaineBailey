package packagesDemo;
//**********************************************************************************************************************
// Activity 13: Fields, Methods, and Encapsulation
// Name: Blaine Bailey
// Date of Submission: 2/17/2023
//**********************************************************************************************************************
// To use this program, click the green arrow. A new Pokémon will be created, with the stats of their name being
// Pikachu, their type being electric, their HP being 35, their level being 1, and their defense being 40. These stats
// will be printed to the console. Then the Pokémon's stats will change. Their new name will be Lucario, their new type
// will be physical, their new HP will be 80, their new level will be 5, and their new defense will be 60. These new
// stats will be printed into the console.
//**********************************************************************************************************************
public class TestClass {
    public static void main(String[] args) {
        //Showing initial stats
        Pokemon pokemon1 = new Pokemon("Pikachu", "Electric", 35, 1, 40);
        System.out.printf("The pokemon is called %s.\n", pokemon1.getName());
        System.out.printf("The pokemon's type is %s.\n", pokemon1.getType());
        System.out.printf("The pokemon's HP is %d.\n", pokemon1.getHP());
        System.out.printf("The pokemon's level is %d.\n", pokemon1.getLevel());
        System.out.printf("The pokemon's defense is %d.\n", pokemon1.getDefense());

        //Setting new stats
        pokemon1.rename("Lucario");
        pokemon1.changeType("Physical");
        pokemon1.changeHP(80);
        pokemon1.changeLVL(5);
        pokemon1.changeDef(60);

        //Putting a new blank line
        System.out.println();

        //Showing new stats
        System.out.printf("The pokemon is called %s.\n", pokemon1.getName());
        System.out.printf("The pokemon's type is %s.\n", pokemon1.getType());
        System.out.printf("The pokemon's HP is %d.\n", pokemon1.getHP());
        System.out.printf("The pokemon's level is %d.\n", pokemon1.getLevel());
        System.out.printf("The pokemon's defense is %d.\n", pokemon1.getDefense());
    }
}
