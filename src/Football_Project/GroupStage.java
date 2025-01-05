package Football_Project;

public class GroupStage {
    private Group[] groups;
    private Team[] teams;
    public boolean isKnockout;

    public GroupStage(Team[] teams) {
        this.teams = teams;
        if (teams.length == 1) {
            System.out.printf("Winner is: %s%n", teams[0].getTeamName());

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

    private void createGroups() {
        shuffleTeams();
        char groupChar = 'A';
        for (int i = 0; i < groups.length; i++) {
            Team[] groupedTeams = new Team[isKnockout ? 2 : 4];
            for (int j = 0; j < (isKnockout ? 2 : 4); j++) {
                groupedTeams[j] = teams[i * (isKnockout ? 2 : 4) + j];
            }
            Group group = new Group(groupedTeams);
            groups[i] = group;
            if (!isKnockout) {
                System.out.println("           Group " + groupChar);
                System.out.println("--------------------------");
                group.printStandings();
                group.printMatches();
            }
            groupChar++;
        }
        new GroupStage(qualifiedTeams());
        while (true) {

        }
    }

    private void shuffleTeams() {
        for (int i = teams.length - 1; i > 0; i--) {
            int randomIndex = (int) (Math.random() * (i + 1));
            Team temp = teams[i];
            teams[i] = teams[randomIndex];
            teams[randomIndex] = temp;
        }
    }


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
