package Football_Project;

public class Group {
    private final Team[] teams;
    private final Match[] matches;
    boolean isKnockout;

    public Group(Team[] teams, boolean isKnockout) {
        this.teams = teams;
        this.matches = new Match[teams.length * (teams.length-1)];
        this.isKnockout = isKnockout;
        scheduleMatches();
    }

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

    public void printStandings() {
        System.out.printf("%-20s %-10s %-10s %n", "Team", "Points", "Goal Diff");
        for (Team team : teams) {
            System.out.printf("%-22s %-10d %3d %n", team.getTeamName(), team.getPoints(), team.getGoalDifference());
        }
        System.out.println(" ");
    }

    public void printMatches() {
        for (Match match : matches) {
            System.out.println("Match played:");
            System.out.println(match.getHomeTeam().getTeamName() + " " + match.getHomeScored() +
                    " - " + match.getAwayScored() + " " + match.getAwayTeam().getTeamName());
            System.out.println(" ");
        }
    }

    private void swapTeams(int firstIndex, int secondIndex) {
        Team temp = teams[firstIndex];
        teams[firstIndex] = teams[secondIndex];
        teams[secondIndex] = temp;
    }

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

    public Team[] getTopTwoTeams() {
        sortTeams();
        return new Team[]{teams[0], teams[1]};
    }
}