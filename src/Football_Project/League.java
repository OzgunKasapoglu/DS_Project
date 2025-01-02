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
            return t1.getPoints() - t2.getPoints();
        }
        return t1.getGoalDifference() - t2.getGoalDifference();
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

    private void heapify(int i) {
        int largest = i;
        int left = leftChild(i);
        int right = rightChild(i);

        if (left < size && compare(heap[left], heap[largest]) > 0) { // Hocanin kodunda <= yaziyordu bir kontrol et.
            largest = left;
        }
        if (right < size && compare(heap[right], heap[largest]) > 0) {
            largest = right;
        }

        if (largest != i) {
            swap(i, largest);
            heapify(largest);
        }
    }

    public Team topTeam() {
        if (size == 0) {
            System.out.println("League is empty.");
            return null;
        }
        Team max = heap[0];
        heap[0] = heap[--size];
        heapify(0);
        return max;
    }

    public void displayRankings() {
        System.out.println("League Rankings:");
        for (int i = 0; i < size; i++) {
            Team t = heap[i];
            System.out.println(t.getTeamName() + " - Points: " + t.getPoints() + ", Goal Difference: " + t.getGoalDifference());
        }
    }

}
