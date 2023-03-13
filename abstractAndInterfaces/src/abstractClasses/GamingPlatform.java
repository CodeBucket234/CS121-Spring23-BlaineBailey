package abstractClasses;

public abstract class GamingPlatform {
    private int numGames, hoursPlayed;
    private String userName;

    public GamingPlatform(int num, int hours, String name) {
        this.numGames = num;
    }
}