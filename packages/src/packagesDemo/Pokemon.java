package packagesDemo;
//**********************************************************************************************************************
// Activity 13: Fields, Methods, and Encapsulation
// Name: Blaine Bailey
// Date of Submission: 2/17/2023
//**********************************************************************************************************************
// This is the Pokémon class. This Pokémon class has 5 instance variables, two public and three private. The public
// instance variables are the strings name and type. The private instance variables are the integers hp, level, and
// defense. This class also has getter methods which return the instance variables, and setter methods that change their
// instances of the instance variables.
//**********************************************************************************************************************
public class Pokemon {

    //Declaring variables
    //Name and type will be public
    //HP, level, and defense will be private
    String name, type;
    private int hp, level, defense;

    //This constructor will take in name, type, hp, base level, and defense
    //Creates new Pokémon based on values of parameters
    public Pokemon(String name, String type, int health, int baseLevel, int def) {
        this.name = name;
        this.type = type;
        this.hp = health;
        this.level = baseLevel;
        this.defense = def;
    }

    //Getters
    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public int getHP() {
        return this.hp;
    }

    public int getLevel() {
        return this.level;
    }

    public int getDefense() {
        return this.defense;
    }

    //Setters
    public void rename(String newName) {
        this.name = newName;
    }

    public void changeType(String newType) {
        this.type = newType;
    }

    public void changeHP(int newHP) {
        this.hp = newHP;
    }

    public void changeLVL(int newLVL) {
        this.level = newLVL;
    }

    public void changeDef(int newDef) {
        this.defense = newDef;
    }
}