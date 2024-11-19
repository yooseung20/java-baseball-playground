package baseball.domain;

import java.util.ArrayList;
import java.util.List;

public class Balls {

	private final List<Ball> computerBalls;

	public Balls(List<Integer> numbers) {
		this.computerBalls = convertBallList(numbers);
	}

	private List<Ball> convertBallList(List<Integer> numbers) {
		ArrayList<Ball> balls = new ArrayList<>();
		for(int i=0; i < numbers.size(); i++) {
			Ball ball = new Ball(numbers.get(i), i);
			balls.add(ball);
		}
		return balls;
	}

	public BallResult play(List<Integer> userNumbers) {
		BallResult ballResult = new BallResult();

		for (int index =0; index < userNumbers.size(); index ++) {
			Ball ball = new Ball(userNumbers.get(index), index);
			ballResult.report(compare(ball));
		}

		return ballResult;

	}
	private BallStatus compare(Ball userBall) {
		return this.computerBalls.stream()
			.map(ball -> ball.compare(userBall))
			.filter(BallStatus::isNotNothing)
			.findFirst()
			.orElseGet(() -> BallStatus.NOTHING);
	}
}
