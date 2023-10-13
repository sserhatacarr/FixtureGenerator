public class Main {
    public static void main(String[] args) {
        FixtureGenerator fixtureGenerator = new FixtureGenerator();

        // Get teams from the user
        fixtureGenerator.getTeamsFromUser();

        // Generate fixtures and display them
        fixtureGenerator.generateFixtures();
    }
}
