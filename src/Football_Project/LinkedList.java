package Football_Project;

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addPlayer(Player player) {
        Node newNode = new Node(player);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void deletePlayer(int playerID) {
        if (this.head == null) {
            return;
        }
        if (head.player.getPlayerID() == playerID) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.player.getPlayerID() == playerID) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public Player selectPlayer(int playerID) {
        if (this.head == null) {
            return null;
        }
        if (head.player.getPlayerID() == playerID) {
            return head.player;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.player.getPlayerID() == playerID) {
                return current.next.player;
            }
            current = current.next;
        }
        return null;
    }

    public void printPlayers() {
        Node current = head;
        int order = 1;
        while (current != null) {
            Player p = current.player;
            System.out.printf("%-2d. player's name: %-20s   ID: %-2s   position: %-11s   Goals: %d%n",
                    order, p.getPlayerName(), p.getPlayerID(), p.getPosition(), p.getScoredGoals());
            order++;
            current = current.next;
        }
    }

    public double size() {
        Node current = head;
        double size = 0;
        while (current != null) {
            current = current.next;
            size++;
        }
        return size;
    }
}
