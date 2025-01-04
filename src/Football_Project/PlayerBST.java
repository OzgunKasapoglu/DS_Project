package Football_Project;

public class PlayerBST {
    private BSTNode root;

    public PlayerBST() {
        this.root = null;
    }

    public void insertPlayer(Player player) {
        root = insertPlayer(root, player);
    }

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

    public Player searchPlayer(int playerID) {
        return searchPlayer(root, playerID);
    }

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
