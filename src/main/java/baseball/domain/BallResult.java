package baseball.domain;

public class BallResult {
	private static int MAX_STRIKE  = 3;
	private int stike = 0;
	private int ball = 0;

	public BallResult() {
	}

	public int countStrike() {
		return this.stike;
	}

	public int countBall() {
		return this.ball;
	}

	public void report(BallStatus status) {
		if (status.isStrike()) {
			this.stike++;
		}
		if (status.isBall()) {
			this.ball++;
		}
	}

	public boolean isGameEnd() {
		return this.stike == MAX_STRIKE;
	}
}
