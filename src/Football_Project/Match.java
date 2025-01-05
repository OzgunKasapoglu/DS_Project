package Football_Project;

public class Match {
    private final Team homeTeam;
    private final Team awayTeam;
    private final int homeScored;
    private final int awayScored;
    private int tempHomeGoalDifference;
    private int tempAwayGoalDifference;

    public Match(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.tempHomeGoalDifference = homeTeam.getGoalDifference();
        this.tempAwayGoalDifference = awayTeam.getGoalDifference();
        homeTeam.setGoalDifference(0);
        awayTeam.setGoalDifference(0);

        double homeTeamsAdvantageFactor = 0.95;
        this.homeScored = 7 - (int)( homeTeamsAdvantageFactor * (Math.log(Math.random()*19+1) / Math.log(1.5)) );
        this.awayScored = 7 - (int)( Math.log(Math.random()*19+1) / Math.log(1.5) );
        League.leagueUpdate(this);
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
