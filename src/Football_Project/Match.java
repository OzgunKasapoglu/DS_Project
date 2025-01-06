package Football_Project;

public class Match {
    private final Team homeTeam;
    private final Team awayTeam;
    private final int homeScored;
    private final int awayScored;

    public Match(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        double homeTeamsAdvantageFactor = 0.95;
        this.homeScored = 7 - (int) (homeTeamsAdvantageFactor * (Math.log(Math.random() * 19 + 1) / Math.log(1.5)));
        this.awayScored = 7 - (int) (Math.log(Math.random() * 19 + 1) / Math.log(1.5));
        distributePointsToTeams();

        Stack.addToHistory(this);
    }

    public void distributePointsToTeams() {
        homeTeam.updateGoalDifference(homeScored - awayScored);
        awayTeam.updateGoalDifference(awayScored - homeScored);

        if (homeScored > awayScored) {
            homeTeam.addPoints(3);
        } else if (homeScored < awayScored) {
            awayTeam.addPoints(3);
        } else {
            homeTeam.addPoints(1);
            awayTeam.addPoints(1);
        }
        distributePointsToPlayers(homeScored, homeTeam);
        distributePointsToPlayers(awayScored, awayTeam);
    }

    private void distributePointsToPlayers(int teamScored, Team team) {
        if (team.getPlayerList().size() > 0) {
            int idOfTheScoredPlayer = 0;
            Player scoredPlayer = null;
            for (int i = teamScored; i > 0; i--) {
                while (scoredPlayer == null) {
                    idOfTheScoredPlayer = team.getTeamID() * 11 - (int) (Math.random() * 11);
                    scoredPlayer = team.getPlayerList().selectPlayer(idOfTheScoredPlayer);
                }

                if (!(scoredPlayer.getPosition().equals("Goalkeeper"))) {
                    scoredPlayer.addGoals(1);
                } else {
                    boolean gkScored = Math.random() <= 0.15;
                    if (gkScored) {
                        scoredPlayer.addGoals(1);
                    } else {
                        scoredPlayer = team.getPlayerList().selectPlayer(idOfTheScoredPlayer + ((int) (Math.random() * 10) + 1));
                        scoredPlayer.addGoals(1);
                    }
                }
            }
        }
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public int getHomeScored() {
        return homeScored;
    }

    public int getAwayScored() {
        return awayScored;
    }
}
