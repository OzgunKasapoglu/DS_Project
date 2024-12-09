public class Player {
    private String playerName;
    private final int playerID;
    private String position;
    private int goalsScored;

    public Player(String playerName, int playerID, String position) {
        this.playerName = playerName;
        this.playerID = playerID;
        this.position = position;
        this.goalsScored = 0;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerID() {
        return playerID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getScoredGoals() {
        return goalsScored;
    }

    public void addGoals(int scoredGoals) {
        this.goalsScored += scoredGoals;
    }
}
