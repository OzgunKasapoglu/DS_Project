package Football_Project;

public class BSTNode {
    private Player player;
    private Team team;
    private BSTNode left, right;

    public BSTNode(Player player) {
        this.player = player;
        this.team = null;
        this.left = null;
        this.right = null;
    }

    public BSTNode(Team team) {
        this.player = null;
        this.team = team;
        this.left = null;
        this.right = null;
    }

    public Player getPlayer() {
        return player;
    }

    public Team getTeam() {
        return team;
    }

    public BSTNode getLeft() {
        return left;
    }

    public BSTNode getRight() {
        return right;
    }

    public void setLeft(BSTNode left) {
        this.left = left;
    }

    public void setRight(BSTNode right) {
        this.right = right;
    }
}
