package Football_Project;

public class Main {

    public static void main(String[] args) {

        League europaLeague = new League();
        europaLeague.startLeague();
        europaLeague.displayRankings();
        europaLeague.printTopScorers(15);
        Player hagi = new Player("Gheorge Hagi", 353, "Winger");
        europaLeague.insert(hagi);


        /*
         * These are some test cases below to test the functionality of the program, show what happens when we add
         * players with the same ID etc.
         */

        // Step 1: Initialize Teams and Players

        Queue matchSchedule = new Queue();
        Stack matchHistory = new Stack();
        matchHistory.clearHistory();

        Team efsane1 = new Team("Team Mario", 33);
        Team efsane2 = new Team("Team Hagi", 34);
        Team efsane3 = new Team("Team Baros", 35);
        Team efsane4 = new Team("Team Kewell", 36);

        Player jardel = new Player("Super Mario Jardel", 55, "Forward");
        Player hagiG = new Player("Gheorghe Hagi", 354, "Midfielder");
        Player baros = new Player("Milan Baros", 20, "Forward");
        Player kewell = new Player("Harry Kewell", 356, "Midfielder");


        System.out.println("Teams and players created successfully!");
        System.out.println();

        // Step 2: Schedule Matches with Queue

        System.out.println("--- Scheduling Matches ---");
        matchSchedule.addToSchedule(efsane1, efsane3);
        matchSchedule.addToSchedule(efsane2, efsane4);
        matchSchedule.scheduledGames();
        System.out.println();

        // Step 3: Play Matches and Display Results
        matchSchedule.playNextMatch(); // Plays Galatasaray vs Fenerbahce
        matchSchedule.playNextMatch(); // Plays Besiktas vs Tottenham
        System.out.println();

        // Step 4: Show Match History

        System.out.println("--- Match History ---");
        matchHistory.matchHistory();
        System.out.println();

        // Step 5: Create a League and Insert Teams
        System.out.println("--- Starting the League ---");
        League efsanelerLigi = new League();
        efsanelerLigi.insert(efsane1);
        efsanelerLigi.insert(efsane2);
        efsanelerLigi.insert(efsane3);
        efsanelerLigi.insert(efsane4);

        efsanelerLigi.displayRankings();
        System.out.println();

        // Step 6: Group Stage Simulation
        System.out.println("--- Group Stage ---");
        Team[] groupTeams = {efsane1, efsane2, efsane3, efsane4};
        GroupStage groupStage = new GroupStage(groupTeams);

        // Step 7: Play Group Stage Matches
        System.out.println("===== Thank you for using the Europa League System! =====");


    }
}


