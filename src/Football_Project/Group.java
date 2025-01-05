package Football_Project;

public class Group {
    private final Team[] teams;
    private final Match[] matches;

    private int tempHomePoints;
    private int tempAwayPoints;

    public Group(Team[] teams) {
        this.teams = teams;
        this.matches = new Match[teams.length * (teams.length-1)];
        scheduleMatches();
    }

    private void scheduleMatches() {
        int index = 0;
        for (int i = 0; i < teams.length; i++) {
            for (int j = i + 1; j < teams.length; j++) {
                Team homeTeam = teams[i];
                Team awayTeam = teams[j];
                tempHomePoints = homeTeam.getPoints();
                tempAwayPoints = awayTeam.getPoints();
//                homeTeam.setPoints(0);
//                awayTeam.setPoints(0);
                Match match1 = new Match(homeTeam, awayTeam);
                Match match2 = new Match(awayTeam, homeTeam);
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
            System.out.println("Games played:");
            System.out.println(match.getHomeTeam().getTeamName() + " " + match.getHomeScored() + " - " + match.getAwayScored() + " " + match.getAwayTeam().getTeamName());
            System.out.println(" ");
        }
    }

    private void sortTeams() {

        for (int i = 0; i < teams.length; i++) {
            for (int j = i + 1; j < teams.length; j++) {
                if (teams[i].getPoints() < teams[j].getPoints()) {
                    Team temp = teams[i];
                    teams[i] = teams[j];
                    teams[j] = temp;
                }
            }
        }
    }

    public Team[] getTopTwoTeams() {
        sortTeams();
        return new Team[]{teams[0], teams[1]};
    }
}