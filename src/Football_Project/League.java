package Football_Project;

/**
 * Class: League
 * Description: Manages the league, including team and player ranking, adding teams and players, and displaying league standings.
 */
public class League {

    /**
     * Array to store teams participating in the league.
     */
    private final Team[] heapTeamArray;

    /**
     * Array to store players participating in the league.
     */
    private final Player[] heapPlayerArray;

    /**
     * Number of teams currently in the league.
     */
    private int sizeTeam;

    /**
     * Number of players currently in the league.
     */
    private int sizePlayer;

    /**
     * Constructs a League instance with predefined team and player arrays.
     */
    public League() {
        this.heapTeamArray = new Team[100];
        this.heapPlayerArray = new Player[1000];
        this.sizeTeam = 0;
        this.sizePlayer = 0;
    }

    /**
     * Starts the league with preset data, initializes players and teams, and displays rankings.
     */
    public void startLeague() {
        new DataInitializer();
        new GroupStage(DataInitializer.allPlayersAndTeams.getTeamArray());
        insertPresetTeams();
        insertPresetPlayers();
    }

    /**
     * Starts the league with a custom set of teams, and displays rankings.
     *
     * @param teams Array of teams to participate in the league.
     */
    public void startLeague(Team[] teams) {
        new DataInitializer();
        new GroupStage(teams);
        for (Team team : teams) {
            insert(team);
        }
        displayRankings();
    }

    /**
     * Returns the index of the parent node in the heap for a given index.
     *
     * @param i Index of the current node.
     * @return The index of the parent node.
     */
    private int parent(int i) {
        return (i - 1) / 2;
    }

    /**
     * Returns the index of the left child node in the heap for a given index.
     *
     * @param i Index of the current node.
     * @return The index of the left child node.
     */
    private int leftChild(int i) {
        return 2 * i + 1;
    }

    /**
     * Returns the index of the right child node in the heap for a given index.
     *
     * @param i Index of the current node.
     * @return The index of the right child node.
     */
    private int rightChild(int i) {
        return 2 * i + 2;
    }

    /**
     * Swaps two teams in the heap.
     *
     * @param i Index of the first team.
     * @param j Index of the second team.
     */
    private void swap(int i, int j) {
        Team temp = heapTeamArray[i];
        heapTeamArray[i] = heapTeamArray[j];
        heapTeamArray[j] = temp;
    }

    /**
     * Extracts and returns the team with the highest ranking in the league.
     *
     * @return The top-ranking team, or null if no teams exist.
     */
    public Team extractMaxTeam() {
        if (sizeTeam == 0) {
            return null;
        }
        Team maxTeam = this.heapTeamArray[0];
        this.heapTeamArray[0] = this.heapTeamArray[sizeTeam - 1];
        sizeTeam--;
        heapifyTeam(0);
        return maxTeam;
    }

    /**
     * Extracts and returns the player with the highest ranking in the league.
     *
     * @return The top-ranking player, or null if no players exist.
     */
    public Player extractMaxPlayer() {
        if (sizePlayer == 0) {
            return null;
        }
        Player maxPlayer = this.heapPlayerArray[0];
        this.heapPlayerArray[0] = this.heapPlayerArray[sizePlayer - 1];
        sizePlayer--;
        heapifyPlayer(0);
        return maxPlayer;
    }

    /**
     * Inserts a team into the league and reorders the heap accordingly.
     *
     * @param team The team to be inserted.
     */
    public void insert(Team team) {
        if (sizeTeam == heapTeamArray.length) {
            System.out.println("League is full. Can't add more teams!");
            return;
        }
        heapTeamArray[sizeTeam] = team;
        int current = sizeTeam++;
        while (current > 0 && heapTeamArray[current].compareWith(heapTeamArray[this.parent(current)]) > 0) {
            swap(current, parent(current));
            current = parent(current);
        }
        heapifyTeam(current);
    }

    /**
     * Inserts a player into the league and reorders the heap accordingly.
     *
     * @param player The player to be inserted.
     */
    public void insert(Player player) {
        if (sizePlayer == heapPlayerArray.length) {
            System.out.println("League is full. Can't add more players!");
            return;
        }
        heapPlayerArray[sizePlayer] = player;
        int current = sizePlayer;
        sizePlayer++;
        while (current > 0) {
            int parent = this.parent(current);
            if (heapPlayerArray[current].compareWith(heapPlayerArray[parent]) > 0) {
                Player swap = heapPlayerArray[current];
                heapPlayerArray[current] = heapPlayerArray[parent];
                heapPlayerArray[parent] = swap;
                current = parent;
            } else {
                break;
            }
        }
    }

    /**
     * Restores the heap property for the team array.
     *
     * @param rootIndex The index to start heapifying from.
     */
    private void heapifyTeam(int rootIndex) {
        int largest = rootIndex;
        int leftChild = leftChild(rootIndex);
        int rightChild = rightChild(rootIndex);

        if (leftChild < sizeTeam && heapTeamArray[leftChild].compareWith(heapTeamArray[largest]) > 0) {
            largest = leftChild;
        }

        if (rightChild < sizeTeam && heapTeamArray[rightChild].compareWith(heapTeamArray[largest]) > 0) {
            largest = rightChild;
        }

        if (largest != rootIndex) {
            Team swap = heapTeamArray[rootIndex];
            heapTeamArray[rootIndex] = heapTeamArray[largest];
            heapTeamArray[largest] = swap;

            heapifyTeam(largest);
        }
    }

    /**
     * Restores the heap property for the player array.
     *
     * @param rootIndex The index to start heapifying from.
     */
    private void heapifyPlayer(int rootIndex) {
        int largest = rootIndex;
        int leftChild = leftChild(rootIndex);
        int rightChild = rightChild(rootIndex);

        if (leftChild < sizePlayer && heapPlayerArray[leftChild].compareWith(heapPlayerArray[largest]) > 0) {
            largest = leftChild;
        }

        if (rightChild < sizePlayer && heapPlayerArray[rightChild].compareWith(heapPlayerArray[largest]) > 0) {
            largest = rightChild;
        }

        if (largest != rootIndex) {
            Player swap = heapPlayerArray[rootIndex];
            heapPlayerArray[rootIndex] = heapPlayerArray[largest];
            heapPlayerArray[largest] = swap;
            heapifyPlayer(largest);
        }
    }

    /**
     * Inserts preset players into the league from a predefined list of teams.
     */
    public void insertPresetPlayers() {
        Team[] teams = {DataInitializer.galatasaray, DataInitializer.fenerbahce, DataInitializer.besiktas,
                DataInitializer.tottenham, DataInitializer.bilbao, DataInitializer.frankfurt,
                DataInitializer.roma, DataInitializer.lyon, DataInitializer.nice, DataInitializer.prag,
                DataInitializer.anderlecht, DataInitializer.paok, DataInitializer.Midtjylland,
                DataInitializer.gilloise, DataInitializer.twente, DataInitializer.plzen,
                DataInitializer.razgrad, DataInitializer.glint, DataInitializer.elfsborg,
                DataInitializer.karabag, DataInitializer.rfs, DataInitializer.manu,
                DataInitializer.sociedad, DataInitializer.porto, DataInitializer.lazio,
                DataInitializer.ajax, DataInitializer.hoffenheim, DataInitializer.braga,
                DataInitializer.olympiacos, DataInitializer.kiev, DataInitializer.rangers,
                DataInitializer.alkmaar};

        for (Team team : teams) {
            Node current = team.getPlayerList().head;
            while (current != null) {
                insert(current.player);
                current = current.next;
            }
        }
    }

    /**
     * Inserts preset teams into the league from a predefined list.
     */
    public void insertPresetTeams() {
        Team[] teams = {DataInitializer.galatasaray, DataInitializer.fenerbahce, DataInitializer.besiktas,
                DataInitializer.tottenham, DataInitializer.bilbao, DataInitializer.frankfurt,
                DataInitializer.roma, DataInitializer.lyon, DataInitializer.nice, DataInitializer.prag,
                DataInitializer.anderlecht, DataInitializer.paok, DataInitializer.Midtjylland,
                DataInitializer.gilloise, DataInitializer.twente, DataInitializer.plzen,
                DataInitializer.razgrad, DataInitializer.glint, DataInitializer.elfsborg,
                DataInitializer.karabag, DataInitializer.rfs, DataInitializer.manu,
                DataInitializer.sociedad, DataInitializer.porto, DataInitializer.lazio,
                DataInitializer.ajax, DataInitializer.hoffenheim, DataInitializer.braga,
                DataInitializer.olympiacos, DataInitializer.kiev, DataInitializer.rangers,
                DataInitializer.alkmaar};

        for (Team team : teams) {
            insert(team);
        }
    }

    /**
     * Displays the current rankings of teams in the league based on their performance.
     */
    public void displayRankings() {
        heapifyTeam(sizePlayer);
        System.out.println("--------------------------------------------------------");
        System.out.printf("%50s%n", "Total Points and Goal Difference Rankings");
        System.out.println("--------------------------------------------------------");
        System.out.printf("%-5s %-20s %-10s %-20s%n", "#", "Team Name", "Points", "Goal Difference");
        System.out.println("--------------------------------------------------------");
        int rank = 1;
        while (sizeTeam > 0) {
            Team topTeam = extractMaxTeam();
            System.out.printf("%-5d %-20s %-10d %-20d%n", rank, topTeam.getTeamName(), topTeam.getPoints(), topTeam.getGoalDifference());
            rank++;
        }
        System.out.println("-------------------------------------------");
    }

    /**
     * Prints the top scorers in the league, limited by the specified number.
     *
     * @param numScorers The number of top scorers to display.
     */
    public void printTopScorers(int numScorers) {
        if (numScorers > sizePlayer) {
            System.out.println("There aren't more than " + sizePlayer + " top scorers in the league.");
            numScorers = sizePlayer;
        }
        System.out.println("-------------------------------------------");
        System.out.printf("%27s%n", "Top Scorers");
        System.out.println("-------------------------------------------");
        System.out.printf("%-5s %-20s %-10s%n", "#", "Player Name", "Goals");
        System.out.println("-------------------------------------------");
        for (int i = 0; i < numScorers; i++) {
            Player player = extractMaxPlayer();
            if (player == null) {
                break;
            }
            System.out.printf("%-5d %-20s %-10d%n", i + 1, player.getPlayerName(), player.getScoredGoals());
            heapifyPlayer(0);
        }
        System.out.println("-------------------------------------------");
    }
}