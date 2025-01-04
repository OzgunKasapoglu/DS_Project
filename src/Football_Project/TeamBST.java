package Football_Project;

public class TeamBST {
    private BSTNode root;

    public TeamBST() {
        this.root = null;
    }

    public void insertTeam(Team team) {
        root = insertTeam(root, team);
    }

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

    public Team searchTeam(int teamID) {
        return searchTeamRec(root, teamID);
    }

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
