//**********************************************************************************************************************
// Activity 14: Overloaded Constructors and Methods
// Name: Blaine Bailey
// Date of Submission: 2/19/2023
//**********************************************************************************************************************
// This is the pokemon class. This class features three overloaded constructors, a default constructor that makes a
// MissingNo. pokemon will 100 hp and defense at level 1. The overloaded constructor with only the name as the parameter
// creates a base pokemon with the base stats of 35 hp and 10 defense at level 1 with the chosen name. The final
// overloaded constructor creates a pokemon with all customized stats, such as a custom name, hp, level, and defense.
// This program uses getter and setter methods. Finally, this program uses two overloaded LevelUp methods. The default
// LevelUp method levels up the pokemon 1 time, adds 5 hp and 2 defense. The other LevelUp method levels up the pokemon
// the specified number of times, and adds 5 hp for every level. This LevelUp method also adds 2 defense for every
// level.
//**********************************************************************************************************************
public class Pokemon {
    //Declaring instance variables
    String name;
    private int hp, level, defense;

    //Overloaded constructors

    //Default constructor creates "MissingNo" pokemon
    public Pokemon() {
        this.name = "MissingNo.";
        this.hp = 100;
        this.level = 1;
        this.defense = 100;
    }

    //Creates base pokemon with chosen name
    public Pokemon(String name) {
        this.name = name;
        this.hp = 35;
        this.level = 1;
        this.defense = 10;
    }

    //Creates pokemon with custom stats
    public Pokemon(String name, int hp, int lvl, int def) {
        this.name = name;
        this.hp = hp;
        this.level = lvl;
        this.defense = def;
    }

    //Getters
    public String getName() {
        return this.name;
    }

    public int getHP() {
        return this.hp;
    }

    public int getLVL() {
        return this.level;
    }

    public int getDefense() {
        return this.defense;
    }

    //Setters
    public void rename(String newName) {
        this.name = newName;
    }

    public void changeHP(int newHealth) {
        this.hp = newHealth;
    }

    public void changeLVL(int newLVL) {
        this.level = newLVL;
    }

    public void changeDefense(int newDef) {
        this.defense = newDef;
    }

    //Overloaded method

    //Levels up pokemon once
    public void LevelUp() {
        this.changeLVL(this.getLVL()+1);
        this.changeHP(this.getHP()+5);
        this.changeDefense(this.getDefense()+2);
    }

    //Levels up the pokemon the number of times specified in the argument
    public void LevelUp(int newLevels) {
        this.changeLVL(this.getLVL()+newLevels);
        this.changeHP(this.getHP()+(newLevels*5));
        this.changeDefense(this.getDefense()+(newLevels*2));
    }
}
