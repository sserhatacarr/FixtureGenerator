import java.util.ArrayList;
import java.util.Scanner;

public class FixtureGenerator {
    private ArrayList<String> teams;

    FixtureGenerator() {
        this.teams = new ArrayList<>();
    }

    // Method to get teams from the user
    public void getTeamsFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many teams will you enter? : ");
        int numTeams = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the teams:");
        for (int i = 0; i < numTeams; i++) {
            System.out.print("Team " + (i + 1) + ": ");
            String team = sc.nextLine();
            teams.add(team);
        }
    }

    // Method to generate fixtures
    public void generateFixtures() {
        ArrayList<String> fixtures = new ArrayList<>();

        if (teams.size() % 2 != 0) {
            teams.add("Bye");
        }

        int numWeeks = teams.size() - 1;
        int halfSize = teams.size() / 2;

        for (int week = 0; week < numWeeks; week++) {
            System.out.println("Round " + (week + 1));

            for (int i = 0; i < halfSize; i++) {
                String homeTeam = teams.get(i);
                String awayTeam = teams.get(teams.size() - 1 - i);

                if (!homeTeam.equals("Bye") && !awayTeam.equals("Bye")) {
                    System.out.println(homeTeam + " vs " + awayTeam);
                } else {
                    System.out.println(homeTeam + "(Bye)");
                }
            }

            String lastTeam = teams.remove(teams.size() - 1);
            teams.add(1, lastTeam);
        }
    }

    // Method to add a team
    public void addTeam(String teamName) {
        teams.add(teamName);
    }
}

