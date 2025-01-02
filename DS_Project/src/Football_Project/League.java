package Football_Project;

public class League {
    private final int capacity;
    private final Team[] heap; // Array to store teams
    private int size;

    public League() {
        this.capacity = 32;
        this.heap = new Team[capacity];
        this.size = 0;
    }

    public static void leagueUpdate(Match match) {
        int homeScored = match.getHomeScored();
        int awayScored = match.getAwayScored();

        Team homeTeam = match.getHomeTeam();
        Team awayTeam = match.getAwayTeam();

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
        Team temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    private int compare(Team t1, Team t2) {
        if (t1.getPoints() != t2.getPoints()) {
            return t2.getPoints() - t1.getPoints();
        }
        return t2.getGoalDifference() - t1.getGoalDifference();
    }

    public void insert(Team team) {
        if (size == capacity) {
            System.out.println("League is full. Can`t add more teams!");
            return;
        }
        heap[size] = team;
        int current = size++;
        while (current > 0 && compare(heap[current], heap[parent(current)]) > 0) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    private void heapify(Team[] heap, int size, int rootIndex) {
        int largest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;

        if (leftChild < size && heap[leftChild].compareWith(heap[largest]) < 0) {
            largest = leftChild;
        }

        if (rightChild < size && heap[rightChild].compareWith(heap[largest]) < 0) {
            largest = rightChild;
        }

        if (largest != rootIndex) {
            Team swap = heap[rootIndex];
            heap[rootIndex] = heap[largest];
            heap[largest] = swap;

            heapify(heap, size, largest);
        }
    }

//    public Team topTeam() {
//        if (size == 0) {
//            System.out.println("League is empty.");
//            return null;
//        }
//        Team max = heap[0];
//        heap[0] = heap[--size];
//        heapify(0);
//        return max;
//    }

    public void displayRankings() {
        Team[] tempHeap = new Team[size];
        System.arraycopy(heap, 0, tempHeap, 0, size);
        int tempSize = size;

        System.out.println("League Rankings:");
        for (int i = tempSize / 2 - 1; i >= 0; i--) {
            heapify(tempHeap, tempSize, i);
        }

        int rank = 1;
        while (tempSize > 0) {
            Team topTeam = tempHeap[0];
            System.out.println(rank + ". " + topTeam.getTeamName() + " - Points: " + topTeam.getPoints() +
                    ", Goal Difference: " + topTeam.getGoalDifference());
            rank++;
            tempHeap[0] = tempHeap[tempSize - 1];
            tempSize--;
            heapify(tempHeap, tempSize, 0);
        }
    }


}
