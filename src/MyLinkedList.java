public class MyLinkedList {
    private Node head;

    public MyLinkedList() {
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

    public void printPlayers() {
        Node current = head;
        int order = 1;
        while (current != null) {
            Player p = current.player;
            System.out.printf("%d. player's name: %s   ID: %s   position: %s   Goals: %d%n",
                    order, p.getPlayerName(), p.getPlayerID(), p.getPosition(), p.getScoredGoals());

            current = current.next;
        }
    }

}
