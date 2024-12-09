public class Match {
    private final Team homeTeam;
    private final Team awayTeam;
    private final int homeScored;
    private final int awayScored;

    public Match(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScored = (int) (Math.random() * 7);
        this.awayScored = (int) (Math.random() * 7);
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
