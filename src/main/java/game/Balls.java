package game;

import java.util.ArrayList;
import java.util.List;

public class Balls {
	private List<Ball> balls = new ArrayList<>();
	
	
	public Balls(List<Integer> ballNumbers) {
		this.balls = mapBalls(ballNumbers);
	}

	public GameResult game(List<Integer> userBallNumbers) {
		GameResult result = new GameResult();
		List<Ball> userBalls = mapBalls(userBallNumbers);

		for (Ball ball : userBalls) {
			result.report(play(ball));
		}
		return result;
	}

	private List<Ball> mapBalls(List<Integer> ballNumbers) {
		List<Ball> balls = new ArrayList<>();

		for(int i =0; i < ballNumbers.size(); i++){
			Ball ball = new Ball(ballNumbers.get(i), i + 1);
			balls.add(ball);
		}
		return balls;
	}


	public BallStatus play(Ball userBall) {
		return this.balls
			.stream()
			.map(ball -> ball.compare(userBall))
			.filter(status -> !status.isNothing())
			.findFirst()
			.orElse(BallStatus.NOTHING);
	}
}
