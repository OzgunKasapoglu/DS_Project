package Football_Project;

/**
 * Class: Stack
 * Description: This class represents a Stack data structure used for maintaining the history of football matches.
 * Matches are added to the stack and can be retrieved in reverse order of addition (last in, first out).
 */
public class Stack {
    /**
     * The size of the stack, representing the number of matches stored in the history.
     */
    public static int size;
    /**
     * The top node of the stack, representing the most recent match added to the history.
     */
    private static Node top;

    /**
     * Constructs an empty Stack.
     */
    public Stack() {
    }

    /**
     * Adds a match to the stack (match history).
     *
     * @param match The match to be added to the history.
     */
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

    /**
     * Removes and returns the most recent match from the history (top of the stack).
     *
     * @return The most recent match from the history, or null if the history is empty.
     */
    public Match popFromHistory() {
        if (top == null) {
            return null;
        } else {
            Match match = top.match;
            top = top.next;
            return match;
        }
    }

    /**
     * Clears the match history by setting the stack to be empty.
     */
    public void clearHistory() {
        top = null;
    }

    /**
     * Checks if the match history stack is empty.
     *
     * @return True if the history is empty, otherwise false.
     */
    public boolean isHistoryEmpty() {
        return (top == null);
    }

    /**
     * Finds the ordinal suffix for a given number (e.g., 1st, 2nd, 3rd, etc.).
     *
     * @param a The number for which the ordinal suffix is required.
     * @return The ordinal suffix (e.g., "st", "nd", "rd", "th").
     */
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

    /**
     * Displays the last match played in the match history, including the teams, scores, and goal differences.
     */
    public void lastMatch() {
        if (top == null) {
            System.out.println("No games played.");
            return;
        }
        Match match = top.match;
        System.out.printf("%d%s match on match history:%n%s %d - %d %s%nFinal Goal differences:%n%-20s: %d%n%-20s: %d%n", size, findOrdinalNumberSuffix(size), match.getHomeTeam().getTeamName(), match.getHomeScored(), match.getAwayScored(), match.getAwayTeam().getTeamName(), match.getHomeTeam().getTeamName(), match.getHomeTeam().getGoalDifference(), match.getAwayTeam().getTeamName(), match.getAwayTeam().getGoalDifference());
    }

    /**
     * Displays the entire match history, showing all past matches with their scores and teams.
     */
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
