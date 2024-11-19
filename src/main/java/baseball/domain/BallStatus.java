package baseball.domain;

public enum BallStatus {
	STRIKE, BALL, NOTHING;


	public boolean isNothing() {
		return this == NOTHING;
	}

	public boolean isStrike() {
		return this == STRIKE;
	}

	public boolean isBall() {
		return this == BALL;
	}

	public boolean isNotNothing() {
		return isStrike() || isBall();
	}
}
