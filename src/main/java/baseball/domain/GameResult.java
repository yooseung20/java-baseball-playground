package baseball.domain;

public class GameResult {
	private int ENDABLE = 3;

	private int strike = 0;
	private int ball = 0;

	public int countStrike() {
		return this.strike;
	}

	public int countBall() {
		return this.ball;
	}

	public void report(BallStatus ballStatus) {
		if (ballStatus.isStrike()) {
			this.strike++;
		}

		if (ballStatus.isBall()) {
			this.ball++;
		}
	}

	public boolean isEnd() {
		return this.strike == ENDABLE;
	}
}
