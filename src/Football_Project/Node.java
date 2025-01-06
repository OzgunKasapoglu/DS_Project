package Football_Project;

/**
 * Class: Node
 * Description: This class represents a node in a data structure, such as a linked list or stack, containing
 * references to a Player, a Match, or Teams (Home and Away). It is used in different places to store relevant
 * information about players, matches, and teams.
 */
public class Node {

    /**
     * A reference to a Player object. Can be used in Player-related data structures.
     */
    public Player player;

    /**
     * A reference to a Match object. Can be used in Match-related data structures (e.g., Stack or Queue).
     */
    public Match match;

    /**
     * A reference to the next node in the data structure.
     */
    public Node next;

    /**
     * A reference to the home team in the match.
     */
    public Team teamHome;

    /**
     * A reference to the away team in the match.
     */
    public Team teamAway;

    /**
     * Constructs a Node with a reference to a Player.
     *
     * @param player The Player object that will be stored in this node.
     */
    public Node(Player player) {
        this.player = player;
        this.next = null;
    }

    /**
     * Constructs a Node with a reference to a Match.
     *
     * @param match The Match object that will be stored in this node.
     */
    public Node(Match match) {
        this.match = match;
        this.next = null;
    }

    /**
     * Constructs a Node with references to both the home and away teams.
     *
     * @param teamHome The home Team object.
     * @param teamAway The away Team object.
     */
    public Node(Team teamHome, Team teamAway) {
        this.teamHome = teamHome;
        this.teamAway = teamAway;
    }

    /**
     * Getter method for the Player object.
     *
     * @return The Player object.
     */
    public Player getPlayer() {
        return player;
    }
}
