public class Pokemon {
    String name;
    private int hp, level, defense;

    public Pokemon() {
        this.name = "MissingNo.";
        this.hp = 100;
        this.level = 1;
        this.defense = 100;
    }

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
    public void
}
