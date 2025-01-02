package Football_Project;

public class Main {

    public static void main(String[] args) {
        // Create teams and players (same as before)
        Team galatasaray = new Team("Galatasaray", 1);
        Team fenerbahce = new Team("Fenerbahce", 2);
        Team besiktas = new Team("Besiktas", 3);
////
////        // Create players and add to teams
//        Player messi = new Player("Lionel Messi", 10, "Forward");
//        galatasaray.addPlayer(messi);
////        Player ozil = new Player("Mesut Ozil", 20, "Midfielder");
////        fenerbahce.addPlayer(ozil);
////        Player kane = new Player("Harry Kane", 30, "Forward");
////        besiktas.addPlayer(kane);

        // Create match scheduler and history stack
        Queue scheduler = new Queue();
        Stack history = new Stack();

        // Schedule some matches
        Match match1 = new Match(galatasaray, fenerbahce);
        Match match2 = new Match(besiktas, fenerbahce);
        scheduler.addToSchedule(match1);
        scheduler.addToSchedule(match2);

        // Display scheduled matches
        scheduler.scheduledGames();

        // Process and record the first match
        Match matchProcessed1 = scheduler.playNextMatch();
        System.out.println("Processing Match: " + matchProcessed1.getHomeTeam().getTeamName() +
                " vs " + matchProcessed1.getAwayTeam().getTeamName());
        history.addToHistory(matchProcessed1);

        // Process and record the second match
        Match matchProcessed2 = scheduler.playNextMatch();
        System.out.println("Processing Match: " + matchProcessed2.getHomeTeam().getTeamName() +
                " vs " + matchProcessed2.getAwayTeam().getTeamName());
        history.addToHistory(matchProcessed2);

        // Display match history (results)
        history.matchHistory();
        galatasaray.getPlayerList().printPlayers();

        // Add teams to the heap
        League europaLeague = new League();
        europaLeague.insert(new Team("Team A", 1));
        europaLeague.insert(new Team("Team B", 2));
        europaLeague.insert(new Team("Team C", 3));
        europaLeague.insert(new Team("Team D", 4));

        // Display the rankings
        System.out.println("Initial Rankings:");
        europaLeague.displayRankings();

        // Extract the top-ranked team
        System.out.println("\nTop-ranked team:");
        Team topTeam = europaLeague.topTeam();
        System.out.println(topTeam.getTeamName() + " - Points: " + topTeam.getPoints() +
                ", Goal Difference: " + topTeam.getGoalDifference());

        // Display updated rankings
        System.out.println("\nUpdated Rankings:");
        europaLeague.displayRankings();
    }

}
