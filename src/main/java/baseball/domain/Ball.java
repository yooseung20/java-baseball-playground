package baseball.domain;

import java.util.List;

public class Ball {
	private final BallNumber number;
	private final BallPosition position;

	public Ball(int number, int position) {
		this.number = new BallNumber(number);
		this.position = new BallPosition(position);
	}

	public BallStatus compare(Ball other) {
		// 숫자가 다르면 낫씽
		if (!other.equalsNumber(this.number)) {
			return BallStatus.NOTHING;
		}

		//숫자가 같지만 위치가 다르면 볼
		if (!other.equalsPosition(this.position)) {
			return BallStatus.BALL;
		}

		return BallStatus.STRIKE;
	}

	private boolean equalsNumber(BallNumber number) {
		return this.number.equals(number);
	}

	private boolean equalsPosition(BallPosition position) {
		return this.position.equals(position);
	}

}
