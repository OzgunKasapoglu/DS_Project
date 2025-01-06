package Football_Project;

/**
 * Class: GroupStage
 * Description: Manages the group stage of a tournament, including team grouping, match scheduling and knockout stages.
 */
public class GroupStage {

    /**
     * Tracks the current round in the knockout stage.
     */
    private static int round;
    /**
     * Indicates whether the current stage is a knockout stage.
     */
    public boolean isKnockout;
    /**
     * Array of groups in the group stage.
     */
    private Group[] groups;
    /**
     * Array of all teams participating in the group stage.
     */
    private final Team[] teams;

    /**
     * Constructs a GroupStage with the specified teams.
     * If the number of teams is 1 or 2, determines the winner directly.
     * Otherwise, creates groups and schedules matches.
     *
     * @param teams Array of teams participating in the group stage.
     */
    public GroupStage(Team[] teams) {
        this.teams = teams;
        if (teams.length == 1) {
            System.out.printf("Winner is: %s%n%n%n", teams[0].getTeamName());
            return;
        } else if (teams.length == 2) {
            isKnockout = true;
            Match finalMatch = new Match(teams[0], teams[1], true);
            matchStagePrint();
            System.out.println("Final match played:");
            System.out.println(finalMatch.getHomeTeam().getTeamName() + " " + finalMatch.getHomeScored() +
                    " - " + finalMatch.getAwayScored() + " " + finalMatch.getAwayTeam().getTeamName());
            System.out.println(" ");
            System.out.printf("Winner is: %s%n%n%n", finalMatch.getHomeScored() >= finalMatch.getAwayScored() ? teams[0].getTeamName() : teams[1].getTeamName());
            return;
        } else if (teams.length <= 16) {
            isKnockout = true;
            this.groups = new Group[teams.length / 2];
        } else {
            isKnockout = false;
            this.groups = new Group[teams.length / 4];
        }
        createGroups();
    }

    /**
     * Creates groups of teams and schedules matches for each group.
     */
    private void createGroups() {
        shuffleTeams();
        char groupChar = 'A';
        matchStagePrint();
        for (int i = 0; i < groups.length; i++) {
            Team[] groupedTeams = new Team[isKnockout ? 2 : 4];
            System.arraycopy(teams, i * (isKnockout ? 2 : 4) + 0, groupedTeams, 0, (isKnockout ? 2 : 4));
            Group group = new Group(groupedTeams, isKnockout);
            groups[i] = group;
            if (!isKnockout) {
                System.out.println("-------------------------------------------");
                System.out.printf("%28s%n", "Group " + groupChar + " Results");
                System.out.println("-------------------------------------------");
                group.printStandings();
                group.printMatches();
                groupChar++;
            } else {
                group.printMatches();
            }
        }
        new GroupStage(qualifiedTeams());
    }

    /**
     * Randomly shuffles the teams to ensure fair grouping.
     */
    private void shuffleTeams() {
        for (int i = teams.length - 1; i > 0; i--) {
            int randomIndex = (int) (Math.random() * (i + 1));
            Team temp = teams[i];
            teams[i] = teams[randomIndex];
            teams[randomIndex] = temp;
        }
    }

    /**
     * Prints the stage of the tournament (e.g., Round of 16, Quarter-Final).
     */
    private void matchStagePrint() {
        if (isKnockout) {
            if (round == 0) {
                System.out.println("-------------------------------------------");
                System.out.printf("%25s%n", "Round of 16 ");
                System.out.println("-------------------------------------------");
                round = 1;
            } else if (round == 1) {
                System.out.println("-------------------------------------------");
                System.out.printf("%25s%n", "Quarter-Final ");
                System.out.println("-------------------------------------------");
                round = 2;
            } else if (round == 2) {
                System.out.println("-------------------------------------------");
                System.out.printf("%25s%n", "Semi-Final ");
                System.out.println("-------------------------------------------");
                round = 3;
            } else if (round == 3) {
                System.out.println("-------------------------------------------");
                System.out.printf("%25s%n", "Final ");
                System.out.println("-------------------------------------------");
                round = 0;
            }
        }
    }

    /**
     * Determines the teams that qualify for the next stage.
     *
     * @return An array of teams that qualify for the next stage.
     */
    public Team[] qualifiedTeams() {
        Team[] qualifiedTeams = new Team[teams.length / 2];
        int index = 0;
        for (Group group : groups) {
            if (isKnockout) {
                qualifiedTeams[index++] = group.getTopTwoTeams()[0];
            } else {
                qualifiedTeams[index++] = group.getTopTwoTeams()[0];
                qualifiedTeams[index++] = group.getTopTwoTeams()[1];
            }
        }
        return qualifiedTeams;
    }

}
