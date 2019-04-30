package udemy;

public class MoreOnMethods {

	public static void main(String[] args) {
		
		int highscore = calculateHighScorePosition(1500);
		displayHighScorePosition("John", highscore);
		
		highscore = calculateHighScorePosition(900);
		displayHighScorePosition("Joe", highscore);
		
		
		calculateHighScorePosition(900);
		calculateHighScorePosition(400);
		calculateHighScorePosition(50);
	}

	public static void displayHighScorePosition(String name, int position) {

		System.out.println(name + " managed to get into position " + position + " on the leaderboard");

	}

	public static int calculateHighScorePosition(int playerScore) {

		if (playerScore > 1000) {
			return 1;
		} else if (playerScore > 500 && playerScore < 1000) {
			return 2;
		} else if (playerScore > 100 && playerScore < 500) {
			return 3;
		} else {
			return 4;
		}
		
	}

}
