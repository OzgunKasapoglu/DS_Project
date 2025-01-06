package Football_Project;

/**
 * Class: BSTNode
 * Description: Represents a node in a binary search tree, which can store either a Player or a Team.
 */
public class BSTNode {
    private final Player player;
    private final Team team;
    private BSTNode left, right;

    /**
     * Constructs a BSTNode with a player.
     *
     * @param player The player to be stored in this node.
     */
    public BSTNode(Player player) {
        this.player = player;
        this.team = null;
        this.left = null;
        this.right = null;
    }

    /**
     * Constructs a BSTNode with a team.
     *
     * @param team The team to be stored in this node.
     */
    public BSTNode(Team team) {
        this.player = null;
        this.team = team;
        this.left = null;
        this.right = null;
    }

    /**
     * Below are getter-setter methods to reach private attributes.
     */
    public Player getPlayer() {
        return player;
    }

    public Team getTeam() {
        return team;
    }

    public BSTNode getLeft() {
        return left;
    }

    public void setLeft(BSTNode left) {
        this.left = left;
    }

    public BSTNode getRight() {
        return right;
    }

    public void setRight(BSTNode right) {
        this.right = right;
    }
}
