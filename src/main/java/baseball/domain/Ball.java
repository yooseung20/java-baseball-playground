package baseball.domain;

public class Ball {
	private final int number;
	private final int position;

	public Ball(int number, int position) {
		this.number = number;
		this.position = position;
	}

	public BallStatus compare(Ball userBall) {
		if (isStrike(userBall)) {
			return BallStatus.STRIKE;
		}
		if (userBall.matchBallNumber(this.number)) {
			return BallStatus.BALL;
		}

		return BallStatus.NOTHING;
	}

	private boolean isStrike(Ball ball) {
		return equals(ball);
	}

	private boolean matchBallNumber(int ballNumber) {
		return this.number == ballNumber;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Ball)) {
			return false;
		}

		Ball otherBall = (Ball) obj;
		return this.number == otherBall.number && this.position == otherBall.position;
	}
}
