package Football_Project;

/**
 * Class: Group
 * Description: Represents a group of teams in a tournament, handling matches and standings.
 */
public class Group {

    /**
     * Array of teams participating in the group.
     */
    private final Team[] teams;

    /**
     * Array of matches scheduled for the group.
     */
    private final Match[] matches;

    /**
     * Indicates whether the group is part of a knockout stage (Round of 16, QF, SF or Final).
     */
    boolean isKnockout;

    /**
     * Constructs a Group with the specified teams and knockout status.
     *
     * @param teams      Array of teams participating in the group.
     * @param isKnockout True if the group is part of a knockout stage, false otherwise.
     */
    public Group(Team[] teams, boolean isKnockout) {
        this.teams = teams;
        this.matches = new Match[teams.length * (teams.length - 1)];
        this.isKnockout = isKnockout;
        scheduleMatches();
    }

    /**
     * Schedules matches between all teams in the group.
     */
    private void scheduleMatches() {
        int index = 0;
        for (int i = 0; i < teams.length; i++) {
            for (int j = i + 1; j < teams.length; j++) {
                Match match1 = new Match(teams[i], teams[j]);
                Match match2 = new Match(teams[j], teams[i]);
                matches[index++] = match1;
                matches[index++] = match2;
            }
        }
    }

    /**
     * Prints the standings of teams in the group.
     */
    public void printStandings() {
        sortTeams();
        System.out.printf("%-20s %-10s %-10s %n", "Team", "Points", "Goal Diff");
        for (Team team : teams) {
            System.out.printf("%-22s %-10d %3d %n", team.getTeamName(), team.getPoints(), team.getGoalDifference());
        }
        System.out.println(" ");
    }

    /**
     * Prints the details of all matches played in the group.
     */
    public void printMatches() {
        for (Match match : matches) {
            System.out.println("Match played:");
            System.out.println(match.getHomeTeam().getTeamName() + " " + match.getHomeScored() +
                    " - " + match.getAwayScored() + " " + match.getAwayTeam().getTeamName());
            System.out.println(" ");
        }
    }

    /**
     * Swaps the positions of two teams in the group.
     *
     * @param firstIndex  Index of the first team.
     * @param secondIndex Index of the second team.
     */
    private void swapTeams(int firstIndex, int secondIndex) {
        Team temp = teams[firstIndex];
        teams[firstIndex] = teams[secondIndex];
        teams[secondIndex] = temp;
    }

    /**
     * Sorts teams in the group based on their performance.
     * If the group is a knockout stage, it considers aggregate scores.
     */
    private void sortTeams() {
        if (isKnockout) {
            if (matches[0].getHomeScored() + matches[1].getAwayScored() < matches[1].getHomeScored() + matches[0].getAwayScored()) {
                swapTeams(0, 1);
            }
        } else {
            for (int i = 0; i < teams.length; i++) {
                for (int j = i + 1; j < teams.length; j++) {
                    if (teams[i].compareWith(teams[j]) == -1) {
                        swapTeams(i, j);
                    }
                }
            }
        }
    }

    /**
     * Gets the top two teams in the group based on their performance.
     *
     * @return An array containing the top two teams.
     */
    public Team[] getTopTwoTeams() {
        return new Team[]{teams[0], teams[1]};
    }
}