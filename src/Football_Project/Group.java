package Football_Project;

public class Group {
    private final Team[] teams;
    private final Match[] matches;

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
                Match match1 = new Match(homeTeam, awayTeam);
                Match match2 = new Match(awayTeam, homeTeam);
                matches[index++] = match1;
                matches[index++] = match2;
            }
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