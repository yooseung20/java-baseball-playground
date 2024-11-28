package baseball.domain;

import java.util.ArrayList;
import java.util.List;

public class Balls {

	private List<Ball> balls;

	public Balls(List<Integer> numbers) {
		this.balls = mappingBalls(numbers);
	}

	private List<Ball> mappingBalls(List<Integer> userBalls) {
		List<Ball> balls = new ArrayList<>();
		for (int i = 0; i < userBalls.size(); i++) {
			balls.add(new Ball(userBalls.get(i), i + 1));
		}

		return balls;
	}

	private BallStatus compare(Ball userBall) {
		return this.balls
			.stream()
			.map(ball -> ball.compare(userBall))
			.filter(BallStatus::isNotNothing)
			.findAny()
			.orElseGet(() -> BallStatus.NOTHING);
	}

	public GameResult compare(Balls users) {
		GameResult result = new GameResult();
		for (Ball ball : users.balls) {
			result.report(compare(ball));
		}
		return result;
	}
}
