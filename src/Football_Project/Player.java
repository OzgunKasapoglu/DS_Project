package Football_Project;

/**
 * Class: Player
 * Description: Represents a football player, with attributes such as name, ID, position, and goals scored.
 * The class allows for updating goals scored and comparing players based on their performance.
 */
public class Player {

    /**
     * The name of the player.
     */
    private String playerName;

    /**
     * The unique ID assigned to the player.
     */
    private int playerID;

    /**
     * The position of the player on the field (e.g., Forward, Midfielder, Goalkeeper).
     */
    private String position;

    /**
     * The number of goals scored by the player.
     */
    private int goalsScored;

    /**
     * Constructs a player with the specified name, ID, and position.
     * This constructor also adds the player to the global player list.
     *
     * @param playerName The name of the player.
     * @param playerID   The unique ID of the player.
     * @param position   The position of the player (e.g., Forward, Midfielder, Goalkeeper).
     */

    public Player(String playerName, int playerID, String position) {
        this.playerName = playerName;
        this.playerID = playerID;
        DataInitializer.allPlayersAndTeams.put(this);
        this.position = position;
        this.goalsScored = 0;
    }

    /**
     * Adds a specified number of goals to the player's total goals scored.
     *
     * @param scoredGoals The number of goals to add.
     */
    public void addGoals(int scoredGoals) {
        this.goalsScored += scoredGoals;
    }

    /**
     * Compares this player with another player based on their goals scored.
     * If goals are the same, the player names are compared alphabetically.
     *
     * @param other The other player to compare with.
     * @return A positive number if this player has more goals,
     * a negative number if the other player has more goals,
     * or zero if they have the same number of goals (based on name if tied).
     */
    public int compareWith(Player other) {
        if (this.getScoredGoals() > other.getScoredGoals()) {
            return 1;
        } else if (this.getScoredGoals() < other.getScoredGoals()) {
            return -1;
        } else {
            return this.getPlayerName().compareTo(other.getPlayerName());
        }
    }

    /**
     * Below are getter-setter methods to reach private attributes.
     */
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
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
}
