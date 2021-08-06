package revision;

public class R_2_Method {
    public static void main(String[] args) {

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + "managed to get into position " + highScorePosition + " on the high score table");
    }

    public static int calculatedHighScorePosition(int playerScore) {
        if (playerScore >= 100) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 100) {
            return 2;
        } else if (playerScore > 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
