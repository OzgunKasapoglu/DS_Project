package Football_Project;

public class Team {
    private final LinkedList playerList;
    private String teamName;
    private int teamID;
    private int totalPoints;
    private int goalDifference;

    public Team(String teamName, int teamID) {
        playerList = new LinkedList();
        this.teamName = teamName;
        this.teamID = teamID;
        this.totalPoints = 0;
        this.goalDifference = 0;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

    public int getGoalDifference() {
        return goalDifference;
    }

    public void setGoalDifference(int goalDifference) {
        this.goalDifference = goalDifference;
    }

    public int getPoints() {
        return totalPoints;
    }

    public void setPoints(int points) {
        this.totalPoints = points;
    }

    public LinkedList getPlayerList() {
        return playerList;
    }

    public void addPoints(int points) {
        this.totalPoints += points;
    }

    public void updateGoalDifference(int goalDifference) {
        this.goalDifference += goalDifference;
    }

    public void addPlayer(Player player) {
        playerList.addPlayer(player);
    }

    public void removePlayer(int playerID) {
        playerList.deletePlayer(playerID);
    }

    public int compareWith(Team team) {
        if (this.totalPoints != team.getPoints()) {
            return Integer.compare(team.totalPoints, this.totalPoints);
        } else {
            return Integer.compare(team.goalDifference, this.goalDifference);

        }
        //Bu method silinebilir, benzerini League clasinda yazdik.
    }

}
