package Football_Project;


public class League {
    private final Team[] heapTeamArray;
    private final Player[] heapPlayerArray;
    private final LinkedList leagueGroups = new LinkedList();
    private int sizeTeam;
    private int sizePlayer;

    public League() {
        this.heapTeamArray = new Team[100];
        this.heapPlayerArray = new Player[1000];
        this.sizeTeam = 0;
        this.sizePlayer = 0;
    }

    public void startLeague() {
        new DataInitializer();
        new GroupStage(DataInitializer.allPlayersAndTeams.getTeamArray());
        insertPresetTeams();
        insertPresetPlayers();
        displayRankings();
    }

    public void startLeague(Team[] teams) {
        new DataInitializer();
        new GroupStage(teams);
        for (Team team : teams) {
            insert(team);
        }
        displayRankings();
    }

    private int parent(int i) {
        return (i - 1) / 2;
    }

    private int leftChild(int i) {
        return 2 * i + 1;
    }

    private int rightChild(int i) {
        return 2 * i + 2;
    }

    private void swap(int i, int j) {
        Team temp = heapTeamArray[i];
        heapTeamArray[i] = heapTeamArray[j];
        heapTeamArray[j] = temp;
    }

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

    public void printTopScorers(int numScorers) {
        System.out.println("-------------------------------------------");
        System.out.printf("%35s%n", "Top Scorers:");
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
        if (numScorers > 352) {
            System.out.println("There aren't more than 352 top scorers in the league.");}
    }


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

    public void displayRankings() {
        heapifyTeam(sizePlayer);
        System.out.println("-------------------------------------------");
        System.out.printf("%35s%n", "League Rankings:");
        System.out.println("-------------------------------------------");
        System.out.printf("%-5s %-20s %-10s %-20s%n", "#", "Team Name", "Points", "Goal Difference");
        System.out.println("-------------------------------------------");
        int rank = 1;
        while (sizeTeam > 0) {
            Team topTeam = extractMaxTeam();
            System.out.printf("%-5d %-20s %-10d %-20d%n", rank, topTeam.getTeamName(), topTeam.getPoints(), topTeam.getGoalDifference());
            rank++;
        }
        System.out.println("-------------------------------------------");
    }
}

//Doğum günün kutlu olsun kral 👑