package Football_Project;

/**
 * Class: Queue
 * Description: This class represents a Queue data structure for managing scheduled football matches.
 * Matches are added to the queue in pairs of teams, and matches can be played in the order they are scheduled.
 */
public class Queue {

    /**
     * The front node of the queue, representing the first scheduled match.
     */
    Node front;

    /**
     * The rear node of the queue, representing the last scheduled match.
     */
    private Node rear;

    /**
     * Constructs an empty Queue.
     */
    public Queue() {
        this.front = null;
        this.rear = null;
    }

    /**
     * Adds a match to the schedule by adding a pair of teams to the queue.
     *
     * @param team1 The first team of the match.
     * @param team2 The second team of the match.
     */
    public void addToSchedule(Team team1, Team team2) {
        Node newNode = new Node(team1, team2);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    /**
     * Plays the next scheduled match from the front of the queue.
     * The match is played, and the teams' scores and goal differences are updated.
     * The match is then removed from the queue.
     */
    public void playNextMatch() {
        if (noGames()) {
            System.out.println("There are no matches in this queue to play");
        } else {
            Match match = new Match(front.teamHome, front.teamAway);
            Node temp = front;
            front = front.next;
            temp = null;

            if (front == null) {
                rear = null;
            }
        }
    }

    /**
     * Checks if there are no matches left in the queue.
     *
     * @return True if there are no matches in the queue, otherwise false.
     */
    public boolean noGames() {
        return front == null;
    }

    /**
     * Displays all scheduled games in the queue.
     * It prints the names of the teams that are scheduled to play against each other.
     */
    public void scheduledGames() {
        Node current = front;
        if (current == null) {
            System.out.println("There are no matches in this queue.");
        } else {
            System.out.println(" These are the games scheduled from first to last: ");
            while (current != null) {
                System.out.println(current.teamHome.getTeamName() + "   vs   "
                        + current.teamAway.getTeamName());
                current = current.next;
            }
        }
    }
}
