package Football_Project;

public class Queue {
    Node front;
    private Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void addToSchedule(Match match) {
        Node newNode = new Node(match);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public Match playNextMatch() {
        if (front == null) {
            return null;
        } else {
            Match match = front.match;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            return match;
        }
    }

    public boolean anyGames() {
        return front == null;
    }

    public void scheduledGames() {
        Node current = front;
        if (current == null) {
            System.out.println("No scheduled games.");
        } else {
            System.out.println(" These are the games scheduled: ");
            while (current != null) {
                System.out.println(current.match.getHomeTeam().getTeamName() + " vs "
                        + current.match.getAwayTeam().getTeamName());
                current = current.next;
            }
        }
    }
}
