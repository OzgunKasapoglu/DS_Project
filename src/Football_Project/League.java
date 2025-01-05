package Football_Project;

public class League {
    private final int capacity;
    private final Team[] heapArray; // Array to store teams
    private final LinkedList leagueGroups = new LinkedList();
    private int size;

    public League() {
        this.capacity = 32;
        this.heapArray = new Team[capacity];
        this.size = 0;
    }

    public static void leagueUpdate(Match match) {
        Team homeTeam = match.getHomeTeam();
        Team awayTeam = match.getAwayTeam();
        int homeScored = match.getHomeScored();
        int awayScored = match.getAwayScored();

        homeTeam.updateGoalDifference(homeScored - awayScored);
        awayTeam.updateGoalDifference(awayScored - homeScored);

        if (homeScored > awayScored) {
            homeTeam.addPoints(3);
        } else if (homeScored < awayScored) {
            awayTeam.addPoints(3);
        } else {
            homeTeam.addPoints(1);
            awayTeam.addPoints(1);
        }

        for (int i = homeScored; i > 0; i--) {
            int idOfTheScoredPlayer = homeTeam.getTeamID() * 11 - (int) (Math.random() * 11);
            Player scoredPlayer = homeTeam.getPlayerList().selectPlayer(idOfTheScoredPlayer);

            if (!(scoredPlayer.getPosition().equals("Goalkeeper"))) {
                scoredPlayer.addGoals(1);
            } else {
                boolean gkScored = Math.random() <= 0.15;
                if (gkScored) {
                    scoredPlayer.addGoals(1);
                } else {
                    scoredPlayer = homeTeam.getPlayerList().selectPlayer(idOfTheScoredPlayer + ((int) (Math.random() * 10) + 1));
                    scoredPlayer.addGoals(1);
                }
            }
        }

        for (int i = awayScored; i > 0; i--) {
            int idOfTheScoredPlayer = awayTeam.getTeamID() * 11 - (int) (Math.random() * 11);
            Player scoredPlayer = awayTeam.getPlayerList().selectPlayer(idOfTheScoredPlayer);

            if (!(scoredPlayer.getPosition().equals("Goalkeeper"))) {
                scoredPlayer.addGoals(1);
            } else {
                boolean gkScored = Math.random() <= 0.15;
                if (gkScored) {
                    scoredPlayer.addGoals(1);
                } else {
                    scoredPlayer = awayTeam.getPlayerList().selectPlayer(idOfTheScoredPlayer + ((int) (Math.random() * 10) + 1));
                    scoredPlayer.addGoals(1);
                }
            }
        }
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
        Team temp = heapArray[i];
        heapArray[i] = heapArray[j];
        heapArray[j] = temp;
    }

    public Team extractMaxTeam() {
        Team maxTeam = this.heapArray[0];
        this.heapArray[0] = this.heapArray[size-1];
        size--;
        heapify(0);
        return maxTeam;
    }

    public void insert(Team team) {
        if (size == capacity) {
            System.out.println("League is full. Can't add more teams!");
            return;
        }
        heapArray[size] = team;
        int current = size++;
        while (current > 0 && heapArray[current].compareWith(heapArray[this.parent(current)]) < 0) {
            swap(current, parent(current));
            current = parent(current);
        }
        heapify(current);
    }

    private void heapify(int rootIndex) {
        int largest = rootIndex;
        int leftChild = leftChild(rootIndex);
        int rightChild = rightChild(rootIndex);

        if (leftChild < size && heapArray[leftChild].compareWith(heapArray[largest]) < 0) {
            largest = leftChild;
        }

        if (rightChild < size && heapArray[rightChild].compareWith(heapArray[largest]) < 0) {
            largest = rightChild;
        }

        if (largest != rootIndex) {
            Team swap = heapArray[rootIndex];
            heapArray[rootIndex] = heapArray[largest];
            heapArray[largest] = swap;

            heapify(largest);
        }
    }

    public void displayRankings() {
        System.out.println("League Rankings");
        System.out.printf("%-20s %-10s %-20s%n", "Team Name", "Points", "Goal Difference");
        System.out.println("-----------------------------------------------");
        int rank = 1;
        while (size > 0) {
            Team topTeam = extractMaxTeam();
            System.out.printf("%-20s %-10d %-20d%n", topTeam.getTeamName(), topTeam.getPoints(), topTeam.getGoalDifference());
            rank++;
        }
    }

//    public Team extractMax() {
//        Team max = heapArray[0];
//        heapArray[0] = heapArray[size - 1];
//        size--;
//        heapify(heapArray, size, 0);
//        return max;
//    }
//    public void displayRankings() {
//        Team[] tempHeap = new Team[size];
//        for (int i = 0; i < size; i++) {
//            tempHeap[i] = heapArray[i];
//        }
//        int tempSize = size;
//
//        System.out.println("League Rankings:");
//        for (int i = tempSize / 2 - 1; i >= 0; i--) {
//            heapify(tempHeap, tempSize, i);
//        }
//
//        System.out.printf("%-20s %-10s %-20s%n", "Team Name", "Points", "Goal Difference");
//        System.out.println("-----------------------------------------------");
//        for (int i = 0; i < size; i++) {
//            Team team = heapArray[i];
//            System.out.printf("%-20s %-10d %-20d%n", team.getTeamName(), team.getPoints(), team.getGoalDifference());
//        }
//
//    }

//
//    // prints the heap
//    public void printHeap() {
//        for (int i = 0; i <= currentSize ; i++) {
//            System.out.print(heap[i] + " ");
//        }
//        System.out.println();
//    }
}
//Doğum günün kutlu olsun kral 👑
