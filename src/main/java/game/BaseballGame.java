package game;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BaseballGame {
	private final Baseball baseball;
	private final List<BallStatus> statuses;

	public BaseballGame(Baseball baseball, List<Ball> userBalls) {
		this.baseball = baseball;
		this.statuses = userBalls.stream()
			.map(this::compare)
			.collect(Collectors.toList());
	}
	private BallStatus compare(Ball ball) {
		return this.baseball.compare(ball);
	}

	private int countByBallStatus(BallStatus targetStatus) {
		return (int) this.statuses.stream()
			.filter(status -> status == targetStatus)
			.count();
	}

	public int countNothing() {
		return countByBallStatus(BallStatus.NOTHING);
	}

	public int countBall() {
		return countByBallStatus(BallStatus.BALL);
	}

	public int countStrike() {
		return countByBallStatus(BallStatus.STRIKE);
	}

}
