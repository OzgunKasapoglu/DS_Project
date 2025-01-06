package Football_Project;

/**
 * Class: LinkedList
 * Description: A linked list that stores players, allowing operations like adding, deleting, and selecting players.
 */
public class LinkedList {

    /**
     * The head node of the linked list.
     */
    Node head;

    /**
     * Constructs an empty linked list.
     */
    public LinkedList() {
        this.head = null;
    }

    /**
     * Adds a player to the end of the linked list.
     *
     * @param player The player to be added to the list.
     */
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

    /**
     * Deletes a player from the linked list based on the player’s ID.
     *
     * @param playerID The ID of the player to be deleted.
     */
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

    /**
     * Selects and returns a player from the linked list based on the player's ID.
     *
     * @param playerID The ID of the player to be selected.
     * @return The player with the specified ID, or null if the player is not found.
     */
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

    /**
     * Prints all players in the linked list with their details.
     */
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

    /**
     * Returns the size of the linked list (the number of players).
     *
     * @return The number of players in the linked list.
     */
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
