public class Pokemon {
    private String name, move;
    private int hitPoints, movePower, attackSpeed;

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
