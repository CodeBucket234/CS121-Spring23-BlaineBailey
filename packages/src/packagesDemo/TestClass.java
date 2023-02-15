package packagesDemo;

public class TestClass {
    public static void main(String[] args) {
        Pokemon pokemon1 = new Pokemon("Pikachu", "Electric", 35, 1, 40);
        System.out.printf("The pokemon is called %s.\n", pokemon1.getName());
        System.out.printf("The pokemon's type is %s.\n", pokemon1.getType());
        System.out.printf("The pokemon's HP is %d.\n", pokemon1.getHP());
        System.out.printf("The pokemon's level is %d.\n", pokemon1.getLevel());
        System.out.printf("The pokemon's defense is %d.\n", pokemon1.getDefense());

        pokemon1.rename("Lucario");
        pokemon1.changeType("Physical");
        pokemon1.changeHP(80);
        pokemon1.changeLVL(5);
        pokemon1.changeDef(60);
    }
}
