package Football_Project;

public class GroupStage {
    private Group[] groups;
    private Team[] teams;
    public boolean isKnockout;
    private static int round;

    public GroupStage(Team[] teams) {
        this.teams = teams;
        if (teams.length == 1) {
            System.out.printf("Winner is: %s%n%n%n", teams[0].getTeamName());
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
        for (int i = 0; i < groups.length; i++) {
            Team[] groupedTeams = new Team[isKnockout ? 2 : 4];
            for (int j = 0; j < (isKnockout ? 2 : 4); j++) {
                groupedTeams[j] = teams[i * (isKnockout ? 2 : 4) + j];
            }
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
