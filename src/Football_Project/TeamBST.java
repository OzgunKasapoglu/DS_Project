package Football_Project;

/**
 * Class: TeamBST
 * Description: This class represents a Binary Search Tree (BST) for managing teams.
 * It supports insertion of teams into the tree and searching for a team by its unique ID.
 * The tree is organized in a way that each node stores a team, and teams are inserted
 * based on their team ID.
 */
public class TeamBST {

    /**
     * The root node of the binary search tree.
     */
    private BSTNode root;

    /**
     * Constructs an empty TeamBST.
     */
    public TeamBST() {
        this.root = null;
    }

    /**
     * Inserts a team into the binary search tree.
     * The tree is organized based on the team ID in ascending order.
     *
     * @param team The team to be inserted into the tree.
     */
    public void insertTeam(Team team) {
        root = insertTeam(root, team);
    }

    /**
     * Recursively inserts a team into the binary search tree.
     * This method helps maintain the tree structure by placing teams
     * in the correct position based on their team ID.
     *
     * @param root The root of the current subtree.
     * @param team The team to be inserted.
     * @return The new root node after the insertion.
     */
    private BSTNode insertTeam(BSTNode root, Team team) {
        if (root == null) {
            root = new BSTNode(team);
            return root;
        }
        if (team.getTeamID() < root.getTeam().getTeamID()) {
            root.setLeft(insertTeam(root.getLeft(), team));
        } else if (team.getTeamID() > root.getTeam().getTeamID()) {
            root.setRight(insertTeam(root.getRight(), team));
        }
        return root;
    }

    /**
     * Searches for a team in the binary search tree by its team ID.
     *
     * @param teamID The unique ID of the team to search for.
     * @return The team with the specified ID, or null if not found.
     */
    public Team searchTeam(int teamID) {
        return searchTeamRec(root, teamID);
    }

    /**
     * Recursively searches for a team in the binary search tree by its team ID.
     *
     * @param root   The root of the current subtree.
     * @param teamID The team ID to search for.
     * @return The team with the specified ID, or null if not found.
     */
    private Team searchTeamRec(BSTNode root, int teamID) {
        if (root == null || root.getTeam() == null) {
            return null;
        }
        if (root.getTeam().getTeamID() == teamID) {
            return root.getTeam();
        }
        if (root.getTeam().getTeamID() > teamID) {
            return searchTeamRec(root.getLeft(), teamID);
        }
        return searchTeamRec(root.getRight(), teamID);
    }
}
