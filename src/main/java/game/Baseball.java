package game;

import java.util.Collections;
import java.util.List;

public class Baseball {

	private final List<Ball> balls;

	public Baseball(List<Ball> balls) {
		this.balls = Collections.unmodifiableList(balls);
	}

	public int size() {
		return this.balls.size();
	}

	public BallStatus compare(Ball guess) {
		var result = BallStatus.NOTHING;

		for (Ball ball : this.balls) {
			var status = ball.compare(guess);
			if (status != BallStatus.NOTHING) {
				result = status;
			}
		}
		return result;
	}
}


