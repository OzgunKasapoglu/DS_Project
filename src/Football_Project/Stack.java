package Football_Project;

public class Stack {
    public static int size;
    private static Node top;

    public Stack() {
    }

    public static void addToHistory(Match match) {
        Node newNode = new Node(match);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        size++;
    }

    public Match popFromHistory() {
        if (top == null) {
            return null;
        } else {
            Match match = top.match;
            top = top.next;
            return match;
        }
    }

    public void clearHistory() {
        top = null;
    }

    public boolean isHistoryEmpty() {
        return (top == null);
    }

    private String findOrdinalNumberSuffix(int a) {
        switch (((a > 10) && (a < 14) ? a + 5 : a) % 10) {
            case 1:
                return "st";
            case 2:
                return "nd";
            case 3:
                return "rd";
            default:
                return "th";
        }
    }

    public void lastMatch() {
        if (top == null) {
            System.out.println("No games played.");
            return;
        }
        Match match = top.match;
        System.out.printf("%d%s match on match history:%n%s %d - %d %s%nFinal Goal differences:%n%-20s: %d%n%-20s: %d%n", size, findOrdinalNumberSuffix(size), match.getHomeTeam().getTeamName(), match.getHomeScored(), match.getAwayScored(), match.getAwayTeam().getTeamName(), match.getHomeTeam().getTeamName(), match.getHomeTeam().getGoalDifference(), match.getAwayTeam().getTeamName(), match.getAwayTeam().getGoalDifference());
    }

    public void matchHistory() {
        Node current = top;
        if (current == null) {
            System.out.println("No games played.");
            return;
        }
        System.out.printf("%n%25s%n****************************************%n", "Match history");
        int i = size;
        while (current != null) {
            System.out.println(i + findOrdinalNumberSuffix(i) + " Match: " + current.match.getHomeTeam().getTeamName() + " " + current.match.getHomeScored() + " - " + current.match.getAwayScored() + " " + current.match.getAwayTeam().getTeamName());
            current = current.next;
            i--;
        }
        System.out.println("****************************************");
    }
}
