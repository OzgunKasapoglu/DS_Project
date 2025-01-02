package Football_Project;

public class Node {
    public Player player;
    public Match match;
    public Node next;

    public Node(Player player) {
        this.player = player;
        this.next = null;
    }

    public Node(Match match) {
        this.match = match;
        this.next = null;
    }

    public Player getPlayer() {
        return player;
    }
}
