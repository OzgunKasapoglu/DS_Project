public class Main {

    public static void main(String[] args) {
        // Create teams and players (same as before)
        Team galatasaray = new Team("Galatasaray", 1);
//        Team fenerbahce = new Team("Fenerbahce", 2);
//        Team besiktas = new Team("Besiktas", 3);
//
//        // Create players and add to teams
        Player messi = new Player("Lionel Messi", 10, "Forward");
        galatasaray.addPlayer(messi);
//        Player ozil = new Player("Mesut Ozil", 20, "Midfielder");
//        fenerbahce.addPlayer(ozil);
//        Player kane = new Player("Harry Kane", 30, "Forward");
//        besiktas.addPlayer(kane);
//
//        // Create match scheduler and history stack
//        MyQueue scheduler = new MyQueue();
//        MyStack history = new MyStack();
//
//        // Schedule some matches
//        Match match1 = new Match(galatasaray, fenerbahce);
//        Match match2 = new Match(besiktas, fenerbahce);
//        scheduler.addToSchedule(match1);
//        scheduler.addToSchedule(match2);
//
//        // Display scheduled matches
//        scheduler.scheduledGames();
//
//        // Process and record the first match
//        Match matchProcessed1 = scheduler.removeFromSchedule();
//        System.out.println("Processing Match: " + matchProcessed1.getHomeTeam().getTeamName() +
//                " vs " + matchProcessed1.getAwayTeam().getTeamName());
//        history.addToHistory(matchProcessed1);
//
//        // Process and record the second match
//        Match matchProcessed2 = scheduler.removeFromSchedule();
//        System.out.println("Processing Match: " + matchProcessed2.getHomeTeam().getTeamName() +
//                " vs " + matchProcessed2.getAwayTeam().getTeamName());
//        history.addToHistory(matchProcessed2);
//
//        // Display match history (results)
//        history.matchHistory();
        galatasaray.getPlayerList().printPlayers();


    }

}
