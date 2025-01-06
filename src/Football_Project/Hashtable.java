package Football_Project;

public class Hashtable {
    private final int capacity = 1000;
    private final Object[] table;

    public Hashtable() {
        this.table = new Object[capacity];

    }

    public Object[] getEntireArray() {
        return table;
    }

    public Team[] getTeamArray() {

        Team[] teams = new Team[32];
        for (int i = 0; i < 32; i++) {
            if (table[i] != null) {
                teams[i] = (Team) table[i];
            }
        }
        return teams;
    }

    private int Hash(Player player) {
        int index = player.getPlayerID() + 99;
        if (index > capacity) return -1;
        else return index;
    }

    private int Hash(Team team) {
        int index = team.getTeamID() - 1;
        if (index > 99) return -1;
        else return index;
    }

    public void put(Team team) {

        int index = Hash(team);
        int i = index;

        if (table[index] == null) {
            table[index] = team;
        } else {
            while (table[i] != null) {
                i++;
            }
            table[i] = team;
            System.out.printf("Created team %s has its ID changed to %s due to collision.%n", team.getTeamName(), i+1);
            team.setTeamID(i+1);
        }
    }


    public void put(Player player) {
        int index = Hash(player);
        if (table[index] == null) {
            table[index] = player;
        } else {
            int i = index;
            while (table[i] != null) {
                i++;
            }
            table[i] = player;
//            player.setPlayerID(i + 99);
        }
    }


    public Team getTeamWithID(int ID) {
        return (Team) (table[ID-1]);
    }

    public Player getPlayerWithID(int ID) {
        return (Player) (table[ID + 100 - 1]);
    }

    public void remove(Team team) {
        int index = Hash(team);
        if (table[index] != null) {
            table[index] = null;
        } else {
            System.out.println("Team not found.");
        }
    }

    public void remove(Player player) {
        int index = Hash(player);
        if (table[index] != null) {
            table[index] = null;
        } else {
            System.out.println("Player not found.");
        }
    }

    public void printTable() {
        for (int i = 0; i < capacity; i++) {
            if (table[i] != null) {
                Team team = (Team) table[i];
                System.out.println(team.getTeamName());
            }
        }
    }
}

