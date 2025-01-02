package Football_Project;

public class PlayerManager {
    private final Hashtable playerTable;

    public PlayerManager() {
        this.playerTable = new Hashtable();
    }

    public void addPlayer(Player player) {
        playerTable.put(String.valueOf(player.getPlayerID()), player);
    }

    public Player getPlayerByID(int id) {
        return (Player) playerTable.get(String.valueOf(id));
    }

    public void removePlayerByID(int id) {
        playerTable.remove(String.valueOf(id));
    }
}