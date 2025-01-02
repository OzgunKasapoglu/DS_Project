package Football_Project;

public class Main {

    public static void main(String[] args) {

        TeamManager teamManager = new TeamManager();
        PlayerManager playerManager = new PlayerManager();
        Team galatasaray = new Team("Galatasaray", 1);
        Team fenerbahce = new Team("Fenerbahce", 2);
        Team besiktas = new Team("Besiktaş JK", 3);
        Team tottenham = new Team("Tottenham Hotspur", 4);
        Team bilbao = new Team("Athletic Bilbao", 5);
        Team frankfurt = new Team("Eintracht Frankfurt", 6);
        Team roma = new Team("AS Roma", 7);
        Team lyon = new Team("Olympique Lyon", 8);
        Team nice = new Team("OGC Nice", 9);
        Team prag = new Team("SK Slavia Prag", 10);
        Team anderlecht = new Team("RSC Anderlecht", 11);
        Team paok = new Team("PAOK", 12);
        Team Midtjylland = new Team("FC Midtjylland", 13);
        Team gilloise = new Team("Union Saint-Gilloise", 14);
        Team twente = new Team("FC Twente Enschede", 15);
        Team plzen = new Team("FC Viktoria Plzen", 16);
        Team razgrad = new Team("Ludogorets Razgrad", 17);
        Team glint = new Team("Glint", 18);
        Team elfsborg = new Team("IF Elfsborg", 19);
        Team karabag = new Team("Qarabağ FK", 20);
        Team rfs = new Team("FC RFS", 21);
        Team manu = new Team("Manchester United", 22);
        Team sociedad = new Team("Real Sociedad", 23);
        Team porto = new Team("FC Porto", 24);
        Team lazio = new Team("SS Lazio", 25);
        Team ajax = new Team("Ajax Amsterdam", 26);
        Team hoffenheim = new Team("TSG 1899 Hoffenheim", 27);
        Team braga = new Team("SC Braga", 28);
        Team olympiacos = new Team("Olympiacos", 29);
        Team kiev = new Team("Dynamo Kiev", 30);
        Team rangers = new Team("Glasgov Rangers", 31);
        Team alkmaar = new Team("AZ Alkmaar", 32);
        Team ferencvaros = new Team("Ferencvaros", 33);
        Team fcsb = new Team("FCSB", 34);
        Team malmo = new Team("Malmö FF", 35);
        Team telaviv = new Team("Maccabi Tel Aviv", 36);

        League europaLeague = new League();
        europaLeague.insert(galatasaray);
        europaLeague.insert(fenerbahce);
        europaLeague.insert(besiktas);
        europaLeague.insert(tottenham);
        europaLeague.insert(bilbao);
        europaLeague.insert(frankfurt);
        europaLeague.insert(roma);
        europaLeague.insert(lyon);


        Queue scheduler = new Queue();
        Stack history = new Stack();


        Match match1 = new Match(galatasaray, fenerbahce);
        Match match2 = new Match(besiktas, tottenham);
        Match match3 = new Match(bilbao, frankfurt);
        Match match4 = new Match(roma, lyon);
        Match match5 = new Match(galatasaray, besiktas);
        Match match6 = new Match(fenerbahce, tottenham);
        Match match7 = new Match(bilbao, roma);
        Match match8 = new Match(lyon, frankfurt);

        scheduler.addToSchedule(match1);
        scheduler.addToSchedule(match2);
        scheduler.addToSchedule(match3);
        scheduler.addToSchedule(match4);
        scheduler.addToSchedule(match5);
        scheduler.addToSchedule(match6);
        scheduler.addToSchedule(match7);
        scheduler.addToSchedule(match8);

        System.out.println("\nPlanned Matches:");
        scheduler.scheduledGames();

        while (!scheduler.anyGames()) {
            Match playedMatch = scheduler.playNextMatch();
            System.out.println("\nPlaying Match: " + playedMatch.getHomeTeam().getTeamName() +
                    " vs " + playedMatch.getAwayTeam().getTeamName());

            history.addToHistory(playedMatch);

            System.out.println("\nUpdated Rankings:");
            europaLeague.displayRankings();
        }

        System.out.println("\nMatch History:");
        history.matchHistory();

        System.out.println("\nFinal Rankings:");
        europaLeague.displayRankings();
    }

}
