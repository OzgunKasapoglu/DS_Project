package Football_Project;

/**
 * Class: PlayerBST
 * Description: This class represents a Binary Search Tree (BST) specifically for storing and managing players.
 * The players are stored in the BST based on their unique player ID.
 */
public class PlayerBST {

    /**
     * The root node of the binary search tree.
     */
    private BSTNode root;

    /**
     * Constructs an empty PlayerBST.
     */
    public PlayerBST() {
        this.root = null;
    }

    /**
     * Inserts a player into the binary search tree.
     * If the player with the same ID exists, it will not be added again.
     *
     * @param player The player to be inserted into the BST.
     */
    public void insertPlayer(Player player) {
        root = insertPlayer(root, player);
    }

    /**
     * Recursively inserts a player into the binary search tree.
     *
     * @param root   The root of the current subtree.
     * @param player The player to be inserted.
     * @return The root of the modified subtree.
     */
    private BSTNode insertPlayer(BSTNode root, Player player) {
        if (root == null) {
            root = new BSTNode(player);
            return root;
        }
        if (player.getPlayerID() < root.getPlayer().getPlayerID()) {
            root.setLeft(insertPlayer(root.getLeft(), player));
        } else if (player.getPlayerID() > root.getPlayer().getPlayerID()) {
            root.setRight(insertPlayer(root.getRight(), player));
        }
        return root;
    }

    /**
     * Searches for a player by their unique player ID.
     *
     * @param playerID The unique ID of the player to search for.
     * @return The player object if found, or null if no player exists with the given ID.
     */
    public Player searchPlayer(int playerID) {
        return searchPlayer(root, playerID);
    }

    /**
     * Recursively searches for a player by their unique player ID.
     *
     * @param root     The root of the current subtree.
     * @param playerID The unique ID of the player to search for.
     * @return The player object if found, or null if no player exists with the given ID.
     */
    private Player searchPlayer(BSTNode root, int playerID) {
        if (root == null || root.getPlayer() == null) {
            return null;
        }
        if (root.getPlayer().getPlayerID() == playerID) {
            return root.getPlayer();
        }
        if (root.getPlayer().getPlayerID() > playerID) {
            return searchPlayer(root.getLeft(), playerID);
        }
        return searchPlayer(root.getRight(), playerID);
    }
}
