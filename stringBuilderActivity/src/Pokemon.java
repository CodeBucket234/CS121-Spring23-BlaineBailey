//**********************************************************************************************************************
// Activity 36: Pokemon Class
// Name: Blaine Bailey
// Date of Submission: 4/21/2023
//**********************************************************************************************************************
// This is the pokemon class. This pokemon class has 5 instance variables: name, move, hitPoints, movePower, and
// attackSpeed. These instance variables correspond to the stats for the pokemon. This class also has a constructor with
// parameters for each stat, and the constructor creates a pokemon object with initialized stats. This class has getters
// and setters, as well as a displayPokemonStats method that returns a formatted string with all the stats of the
// pokemon.
//**********************************************************************************************************************
public class Pokemon {
    //Private instance variables for the pokemon
    private String name, move;
    private int hitPoints, movePower, attackSpeed;

    //Pokemon constructor to create a pokemon with defined stats
    public Pokemon(String name, String move, int pts, int pow, int speed) {
        this.name = name;
        this.move = move;
        this.hitPoints = pts;
        this.movePower = pow;
        this.attackSpeed = speed;
    }

    //Getters
    public String getName() {
        return this.name;
    }

    public String getMove() {
        return this.move;
    }

    public int getHitPoints() {
        return this.hitPoints;
    }

    public int getMovePower() {
        return this.movePower;
    }

    public int getAttackSpeed() {
        return this.attackSpeed;
    }

    //Setters
    public void setName(String newName) {
        this.name = newName;
    }

    public void setMove(String newMove) {
        this.move = newMove;
    }

    public void setHitPoints(int points) {
        this.hitPoints = points;
    }

    public void setMovePower(int power) {
        this.movePower = power;
    }

    public void setAttackSpeed(int speed) {
        this.attackSpeed = speed;
    }

    //display stats
    public String displayPokemonStats() {
        return String.format("Name: %s\nHit Points: %d\nMove: %s\nMove Power: %d\nAttack Speed: %d", getName(), getHitPoints(), getMove(), getMovePower(), getAttackSpeed());
    }
}
