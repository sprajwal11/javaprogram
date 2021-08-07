package revision;

public class R_2_Method {
    public static void main(String[] args) {
        int highScorePosition=calculatedHighScorePosition(1500);
        displayHighScorePosition("Prajwal ", highScorePosition);
        highScorePosition=calculatedHighScorePosition(600);
        displayHighScorePosition("Prajwal ", highScorePosition);
        highScorePosition=calculatedHighScorePosition(400);
        displayHighScorePosition("Prajwal ", highScorePosition);
        highScorePosition=calculatedHighScorePosition(50);
        displayHighScorePosition("Prajwal ", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + "managed to get into position " + highScorePosition + " on the high score table");
    }

    public static int calculatedHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore <= 1000) {
            return 2;
        } else if (playerScore > 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
