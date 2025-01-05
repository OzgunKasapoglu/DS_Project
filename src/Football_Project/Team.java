package Football_Project;

public class Team {
    private final LinkedList playerList;
    private final PlayerBST playerBST;
    private final TeamBST teamBST;
    private String teamName;
    private int teamID;
    private int totalPoints;
    private int goalDifference;

    public Team(String teamName, int teamID) {
        playerList = new LinkedList();
        playerBST = new PlayerBST();
        teamBST = new TeamBST();
        this.teamName = teamName;
        this.teamID = teamID;
        DataInitializer.allPlayersAndTeams.put(this);
        this.totalPoints = 0;
        this.goalDifference = 0;
    }

    public Team(String teamName) {
        playerList = new LinkedList();
        playerBST = new PlayerBST();
        teamBST = new TeamBST();
        this.teamName = teamName;
        this.teamID = 1;
        DataInitializer.allPlayersAndTeams.put(this);
        this.totalPoints = 0;
        this.goalDifference = 0;
    }

    public void addToLeague(League league) {
        league.insert(this);
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

    public void updateGoalDifference(int goalDifference) {
        this.goalDifference += goalDifference;
    }

    public int getPoints() {
        return totalPoints;
    }

    public void setPoints(int points) {
        this.totalPoints = points;
    }

    public void addPoints(int points) {
        this.totalPoints += points;
    }

    public LinkedList getPlayerList() {
        return playerList;
    }

    public PlayerBST getPlayerBST() {
        return playerBST;
    }

    public TeamBST getTeamBST() {
        return teamBST;
    }

    public void removePlayer(int playerID) {
        playerList.deletePlayer(playerID);
        // You will need to implement a remove method in the PlayerBST class
    }

    public void addPlayer(Player player) {
        playerList.addPlayer(player);
        playerBST.insertPlayer(player);
    }

    public void addTeam(Team team) {
        teamBST.insertTeam(team);
    }

    public Player searchPlayer(int playerID) {
        return playerBST.searchPlayer(playerID);
    }

    public int compareWith(Team team) {
        if (this.totalPoints != team.getPoints()) {
            return team.totalPoints < this.totalPoints ? -1 : 1;
        } else {
            if (team.goalDifference == this.goalDifference) return 0;
            else {
                return team.goalDifference < this.goalDifference ? -1 : 1;
            }
        }
    }
}
