package Football_Project;

public class PlayerManager {
    public final Hashtable playerTable;

    public PlayerManager() {
        this.playerTable = new Hashtable();
    }

    public Player getPlayerByID(int id) {
        return (Player) playerTable.get(String.valueOf(id));
    }

    public void removePlayerByID(int id) {
        playerTable.remove(String.valueOf(id));
    }
}