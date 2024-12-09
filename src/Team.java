public class Team {
    private final MyLinkedList playerList;
    private String teamName;
    private int teamID;
    private int points;
    private int goalDifference;

    public Team(String teamName, int teamID) {
        playerList = new MyLinkedList();
        this.teamName = teamName;
        this.teamID = teamID;
        this.points = 0;
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

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setGoalDifference(int goalDifference) {
        this.goalDifference = goalDifference;
    }

    public MyLinkedList getPlayerList() {
        return playerList;
    }

    public void addPoints(int points) {
        this.points += points;
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
        if (this.points != team.getPoints()) {
            return Integer.compare(team.points, this.points);
        } else {
            return Integer.compare(team.goalDifference, this.goalDifference);

        }

    }

}
