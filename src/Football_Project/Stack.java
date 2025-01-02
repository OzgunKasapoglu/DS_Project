package Football_Project;

public class Stack {
    private Node top;

    public Stack() {
        top = null;
    }

    public void addToHistory(Match match) {
        Node newNode = new Node(match);
        newNode.next = top;
        top = newNode;
    }

    public boolean noGames() {
        return top == null;
    }

    public void matchHistory() {
        Node current = top;
        if (current == null) {
            System.out.println("No games played.");
            return;
        }
        System.out.println(" These are the games played: ");
        while (current != null) {
            System.out.println(current.match.getHomeTeam().getTeamName() + " " + current.match.getHomeScored() +
                    " - " + current.match.getAwayScored() + " " + current.match.getAwayTeam().getTeamName());
            current = current.next;
        }
    }
}
