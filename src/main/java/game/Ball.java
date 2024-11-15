package game;

public class Ball {

	private final int digit;
	private final int position;

	public Ball(int digit, int position) {
		this.digit = digit;
		this.position = position;
	}

	public BallStatus compare(Ball ball) {
		if(this.equals(ball)) {
			return BallStatus.STRIKE;
		}

		if (isEqualDigit(ball)) {
			return BallStatus.BALL;
		}

		return BallStatus.NOTHING;
	}

	public boolean isEqualDigit(Ball ball) {
		return this.digit == ball.getDigit();
	}


	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Ball)) {
			return false;
		}

		Ball ball = (Ball) obj;
		return this.position == ball.getPosition() && this.digit == ball.getDigit();
	}

	private int getPosition() {
		return this.position;
	}

	private int getDigit() {
		return this.digit;
	}

}
