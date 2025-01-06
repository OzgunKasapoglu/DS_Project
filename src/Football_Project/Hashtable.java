package Football_Project;

/**
 * Class: Hashtable
 * Description: Implements a simple hash table to store and manage teams and players using custom hash functions.
 */
public class Hashtable {

    /**
     * Capacity of the hash table.
     */
    private final int capacity = 1000;

    /**
     * Array to store the hash table elements.
     */
    private final Object[] table;

    /**
     * Constructs an empty hash table with a predefined capacity.
     */
    public Hashtable() {
        this.table = new Object[capacity];

    }

    /**
     * Retrieves the entire hash table array.
     *
     * @return Array containing all elements in the hash table.
     */
    public Object[] getEntireArray() {
        return table;
    }

    /**
     * Retrieves an array of teams from the hash table.
     *
     * @return Array of teams stored in the hash table.
     */
    public Team[] getTeamArray() {

        Team[] teams = new Team[32];
        for (int i = 0; i < 32; i++) {
            if (table[i] != null) {
                teams[i] = (Team) table[i];
            }
        }
        return teams;
    }

    /**
     * Hash function for a player.
     *
     * @param player The player to hash.
     * @return Hash index for the player.
     */
    private int Hash(Player player) {
        int index = player.getPlayerID() + 99;
        if (index > capacity) return -1;
        else return index;
    }

    /**
     * Hash function for a team.
     *
     * @param team The team to hash.
     * @return Hash index for the team.
     */
    private int Hash(Team team) {
        int index = team.getTeamID() - 1;
        if (index > 99) return -1;
        else return index;
    }

    /**
     * Adds a team to the hash table. Resolves collisions by linear probing.
     *
     * @param team The team to add.
     */
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
            System.out.printf("Created team %s has its ID changed to %s due to collision.%n", team.getTeamName(), i + 1);
            team.setTeamID(i + 1);
        }
    }

    /**
     * Adds a player to the hash table. Resolves collisions by linear probing.
     *
     * @param player The player to add.
     */
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

    /**
     * Retrieves a team by its ID from the hash table.
     *
     * @param ID The ID of the team.
     * @return The team with the specified ID, or null if not found.
     */
    public Team getTeamWithID(int ID) {
        return (Team) (table[ID - 1]);
    }

    /**
     * Retrieves a player by its ID from the hash table.
     *
     * @param ID The ID of the player.
     * @return The player with the specified ID, or null if not found.
     */
    public Player getPlayerWithID(int ID) {
        return (Player) (table[ID + 100 - 1]);
    }

    /**
     * Removes a team from the hash table.
     *
     * @param team The team to remove.
     */
    public void remove(Team team) {
        int index = Hash(team);
        if (table[index] != null) {
            table[index] = null;
        } else {
            System.out.println("Team not found.");
        }
    }

    /**
     * Removes a player from the hash table.
     *
     * @param player The player to remove.
     */
    public void remove(Player player) {
        int index = Hash(player);
        if (table[index] != null) {
            table[index] = null;
        } else {
            System.out.println("Player not found.");
        }
    }

    /**
     * Prints the teams from the hash table.
     */
    public void printTable() {
        for (int i = 0; i < capacity; i++) {
            if (table[i] != null) {
                Team team = (Team) table[i];
                System.out.println(team.getTeamName());
            }
        }
    }
}

