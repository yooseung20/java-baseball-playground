package game;

public class GameResult {
	private static int GAME_OVER = 3;
	private int ball;
	private int strike;

	public GameResult() {
		this.ball = 0;
		this.strike = 0;
	}

	public void report(BallStatus status) {
		if (status.isStrike()) {
			this.strike++;
		}
		if (status.isBall()) {
			this.ball++;
		}
	}

	public int countBall() {
		return this.ball;
	}

	public int countStrike() {
		return this.strike;
	}

	public boolean isGameEnd() {
		return this.strike == GAME_OVER;
	}
}
