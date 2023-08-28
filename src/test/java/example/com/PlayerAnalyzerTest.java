package example.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class PlayerAnalyzerTest {

    @Test
    void testCalculateScoreMethodForNormalPlayer() {
        List<Player> players = new ArrayList<>();

        Player player = createPlayer(25,5,2);

        players.add(player);

        PlayerAnalyzer analyzer = new PlayerAnalyzer();
        double result = analyzer.calculateScore(players);

        Assertions.assertEquals(250.0, result);
    }

    @Test
    void testCalculateScoreMethodForJuniorPlayer() {
        List<Player> players = new ArrayList<>();

        Player player = createPlayer(15,3,3);
        players.add(player);

        PlayerAnalyzer analyzer = new PlayerAnalyzer();
        double result = analyzer.calculateScore(players);

        Assertions.assertEquals(67.5, result);
    }

    @Test
    void testCalculateScoreMethodForSeniorPlayer() {
        List<Player> players = new ArrayList<>();

        Player player = createPlayer(35,15,4);

        players.add(player);

        PlayerAnalyzer analyzer = new PlayerAnalyzer();
        double result = analyzer.calculateScore(players);

        Assertions.assertEquals(2520, result);
    }

    @Test
    void testCalculateScoreMethodForMultiplePlayers() {
        List<Player> players = new ArrayList<>();

        Player firstPlayer = createPlayer(19,2,2);
        Player secondPlayer = createPlayer(25,4,3);
        Player thirdPlayer = createPlayer(41, 14, 4);

        players.add(firstPlayer);
        players.add(secondPlayer);
        players.add(thirdPlayer);

        PlayerAnalyzer analyzer = new PlayerAnalyzer();
        double result = analyzer.calculateScore(players);

        Assertions.assertEquals(3131.2, result);
    }

    @Test
    void testCalculateScoreMethodForPlayerWithNullAsSkills() {
        List<Player> players = new ArrayList<>();

        Player player = new Player();
        player.setAge(18);
        player.setExperience(2);
        player.setSkills(null);

        players.add(player);
        PlayerAnalyzer analyzer = new PlayerAnalyzer();

        Assertions.assertThrows(NullPointerException.class, () -> {
            analyzer.calculateScore(players);
        });
    }

    @Test
    void testCalculateScoreMethodForEmptyArray() {
        List<Player> players = new ArrayList<>();

        PlayerAnalyzer analyzer = new PlayerAnalyzer();

        double result = analyzer.calculateScore(players);

        Assertions.assertEquals(0, result);
    }

    private Player createPlayer(int age, int experience, int skill) {
        Player player = new Player();
        player.setAge(age);
        player.setExperience(experience);

        List<Integer> skills = new ArrayList<>();
        skills.add(skill);
        skills.add(skill);
        skills.add(skill);
        player.setSkills(skills);

        return player;
    }
}