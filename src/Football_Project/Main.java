package Football_Project;

public class Main {

    public static void main(String[] args) {

        TeamManager teamManager = new TeamManager();
        PlayerManager playerManager = new PlayerManager();

        DataInitializer dataInitializer = new DataInitializer();

        dataInitializer.galatasaray.getPlayerList().printPlayers();
        dataInitializer.fenerbahce.getPlayerList().printPlayers();
        dataInitializer.besiktas.getPlayerList().printPlayers();
        League europaLeague = new League();
//        europaLeague.insert(galatasaray);
//        europaLeague.insert(fenerbahce);
//        europaLeague.insert(besiktas);
//        europaLeague.insert(tottenham);
//        europaLeague.insert(bilbao);®
//        europaLeague.insert(frankfurt);
//        europaLeague.insert(roma);
//        europaLeague.insert(lyon);
//
//
//        Queue scheduler = new Queue();
//        Stack history = new Stack();
//
//
//        Match match1 = new Match(galatasaray, fenerbahce);
//        Match match2 = new Match(besiktas, tottenham);
//        Match match3 = new Match(bilbao, frankfurt);
//        Match match4 = new Match(roma, lyon);
//        Match match5 = new Match(galatasaray, besiktas);
//        Match match6 = new Match(fenerbahce, tottenham);
//        Match match7 = new Match(bilbao, roma);
//        Match match8 = new Match(lyon, frankfurt);
//
//        scheduler.addToSchedule(match1);
//        scheduler.addToSchedule(match2);
//        scheduler.addToSchedule(match3);
//        scheduler.addToSchedule(match4);
//        scheduler.addToSchedule(match5);
//        scheduler.addToSchedule(match6);
//        scheduler.addToSchedule(match7);
//        scheduler.addToSchedule(match8);
//
//        System.out.println("\nPlanned Matches:");
//        scheduler.scheduledGames();
//
//        while (!scheduler.anyGames()) {
//            Match playedMatch = scheduler.playNextMatch();
//            System.out.println("\nPlaying Match: " + playedMatch.getHomeTeam().getTeamName() +
//                    " vs " + playedMatch.getAwayTeam().getTeamName());
//
//            history.addToHistory(playedMatch);
//
//            System.out.println("\nUpdated Rankings:");
//            europaLeague.displayRankings();
//        }
//
//        System.out.println("\nMatch History:");
//        history.matchHistory();
//
//        System.out.println("\nFinal Rankings:");
//        europaLeague.displayRankings();
    }

}
