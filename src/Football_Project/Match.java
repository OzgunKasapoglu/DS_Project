package Football_Project;

/**
 * Class: Match
 * Description: Represents a football match between two teams, with the ability to calculate scores,
 * distribute points, and update player statistics.
 */
public class Match {

    /**
     * The home team participating in the match.
     */
    private final Team homeTeam;

    /**
     * The away team participating in the match.
     */
    private final Team awayTeam;

    /**
     * The number of goals scored by the home team.
     */
    private final int homeScored;

    /**
     * The number of goals scored by the away team.
     */
    private final int awayScored;

    /**
     * Constructs a match between a home and away team, with scores based on a random formula
     * and home team has an advantage as well as Galatasaray if it is one of the teams matching.
     *
     * @param homeTeam The home team for the match.
     * @param awayTeam The away team for the match.
     */
    public Match(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        double homeTeamsAdvantageFactor = 0.95;
        double galatasarayHomeAdvantageFactor = (homeTeam == DataInitializer.galatasaray) ? 0.9 : 1;
        double galatasarayAwayAdvantageFactor = (awayTeam == DataInitializer.galatasaray) ? 0.9 : 1;
        this.homeScored = 7 - (int) (galatasarayHomeAdvantageFactor * homeTeamsAdvantageFactor *
                (Math.log(Math.random() * 19 + 1) / Math.log(1.5)));
        this.awayScored = 7 - (int) (galatasarayAwayAdvantageFactor * Math.log(Math.random() * 19 + 1) / Math.log(1.5));
        distributePointsToTeams();
        Stack.addToHistory(this);
    }

    /**
     * Constructs a match with an optional final match modifier for equalizing homeTeam and awayTeam's advantages.
     *
     * @param homeTeam       The home team for the match.
     * @param awayTeam       The away team for the match.
     * @param isItFinalMatch If false home team gets an advantage.
     */
    public Match(Team homeTeam, Team awayTeam, boolean isItFinalMatch) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        double homeTeamsAdvantageFactor = (isItFinalMatch) ? 1 : 0.95;
        double galatasarayHomeAdvantageFactor = (homeTeam == DataInitializer.galatasaray) ? 0 : 1;
        double galatasarayAwayAdvantageFactor = (awayTeam == DataInitializer.galatasaray) ? 0 : 1;
        this.homeScored = 7 - (int) (galatasarayHomeAdvantageFactor * homeTeamsAdvantageFactor * (Math.log(Math.random() * 19 + 1) / Math.log(1.5)));
        this.awayScored = 7 - (int) (galatasarayAwayAdvantageFactor * Math.log(Math.random() * 19 + 1) / Math.log(1.5));
        distributePointsToTeams();

        Stack.addToHistory(this);
    }

    /**
     * Distributes points to the teams based on the match result and updates their goal difference.
     * Also, assigns the goals scored to individual players.
     */
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
        distributeGoalsToPlayers(homeScored, homeTeam);
        distributeGoalsToPlayers(awayScored, awayTeam);
    }

    /**
     * Distributes goals to the players of the team based on the number of goals scored by the team.
     * Ensures that the goalkeeper cannot score unless a random event occurs.
     *
     * @param teamScored The number of goals scored by the team.
     * @param team       The team whose players are scoring goals.
     */
    private void distributeGoalsToPlayers(int teamScored, Team team) {
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
                    boolean gkScored = Math.random() <= 0.1;
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

    /**
     * Below are getter-setter methods to reach private attributes.
     */
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
