package Football_Project;

public class TeamManager {
    private final Hashtable idTable;

    public TeamManager() {
        this.idTable = new Hashtable();

    }

    public void addTeam(Team team) {
        idTable.put(String.valueOf(team.getTeamID()), team);

    }

    public Team getTeamByID(int id) {
        return (Team) idTable.get(String.valueOf(id));
    }


    public void removeTeamByID(int id) {
        Team team = (Team) idTable.get(String.valueOf(id));
        if (team != null) {

            idTable.remove(String.valueOf(id));
        }
    }


}