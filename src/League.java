public class League {
    public static void LeagueUpdate(Match match) {
        int homeScored = match.getAwayScored();
        int awayScored = match.getHomeScored();

        if (homeScored > awayScored) {
            match.getHomeTeam().addPoints(3);
        } else if (homeScored < awayScored) {
            match.getAwayTeam().addPoints(3);
        } else {
            match.getHomeTeam().addPoints(1);
            match.getAwayTeam().addPoints(1);
        }
    }
}
