package Football_Project;

/**
 * Class: Team
 * Description: This class represents a football team, including its players, team details (name, ID), and the
 * points and goal difference the team has accumulated. It also includes methods for adding/removing players,
 * comparing teams, and interacting with data structures like linked lists and binary search trees (BSTs)
 * to manage player and team data.
 */
public class Team {

    /**
     * Linked list to hold the players of the team.
     */
    private final LinkedList playerList;

    /**
     * Binary Search Tree to store players for efficient searching.
     */
    private final PlayerBST playerBST;

    /**
     * Binary Search Tree to store teams for efficient searching.
     */
    private final TeamBST teamBST;

    /**
     * The name of the team.
     */
    private String teamName;

    /**
     * The unique ID of the team.
     */
    private int teamID;

    /**
     * The total points accumulated by the team.
     */
    private int totalPoints;

    /**
     * The goal difference of the team.
     */
    private int goalDifference;

    /**
     * Constructs a Team with the specified name and ID.
     * Initializes the player list, player BST, and team BST.
     *
     * @param teamName The name of the team.
     * @param teamID   The unique ID of the team.
     */
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

    /**
     * Constructs a Team with the specified name and a default team ID of 1.
     * Initializes the player list, player BST, and team BST.
     *
     * @param teamName The name of the team.
     */
    public Team(String teamName) {  // Yukarida zaten var ?
        playerList = new LinkedList();
        playerBST = new PlayerBST();
        teamBST = new TeamBST();
        this.teamName = teamName;
        this.teamID = 1;
        DataInitializer.allPlayersAndTeams.put(this);
        this.totalPoints = 0;
        this.goalDifference = 0;
    }

    /**
     * Adds this team to the specified league.
     *
     * @param league The league to which the team will be added.
     */
    public void addToLeague(League league) {
        league.insert(this);
    }

    /**
     * Updates the goal difference by adding the specified value.
     *
     * @param goalDifference The value to be added to the goal difference.
     */
    public void updateGoalDifference(int goalDifference) {
        this.goalDifference += goalDifference;
    }

    /**
     * Removes the player with the specified player ID from the team.
     *
     * @param playerID The ID of the player to be removed.
     */
    public void removePlayer(int playerID) {
        playerList.deletePlayer(playerID);
        // You will need to implement a remove method in the PlayerBST class
    }

    /**
     * Adds the specified player to the team.
     *
     * @param player The player to be added to the team.
     */
    public void addPlayer(Player player) {
        playerList.addPlayer(player);
    }

    /**
     * Adds the specified team to the team's BST.
     *
     * @param team The team to be added to the BST.
     */
    public void addTeam(Team team) {
        teamBST.insertTeam(team);
    }

    /**
     * Searches for a player by player ID in the team's player BST.
     *
     * @param playerID The ID of the player to be searched.
     * @return The player with the specified ID, or null if not found.
     */
    public Player searchPlayer(int playerID) {
        return playerBST.searchPlayer(playerID);
    }

    /**
     * Compares this team with another team based on their points and goal difference.
     *
     * @param team The team to be compared with.
     * @return A negative integer if this team has fewer points or a worse goal difference,
     * a positive integer if it has more points or a better goal difference,
     * or 0 if they are equal.
     */
    public int compareWith(Team team) {
        if (this.totalPoints != team.getPoints()) {
            return this.totalPoints < team.totalPoints ? -1 : 1;
        } else {
            if (team.goalDifference == this.goalDifference) return 0;
            else {
                return this.goalDifference < team.goalDifference ? -1 : 1;
            }
        }
    }

    /**
     * Below are getter-setter methods to reach private attributes.
     */
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
}
