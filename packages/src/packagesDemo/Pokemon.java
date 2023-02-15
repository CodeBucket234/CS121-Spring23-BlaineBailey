package packagesDemo;

public class Pokemon {
    String name, type;
    private int hp, level, defense;

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