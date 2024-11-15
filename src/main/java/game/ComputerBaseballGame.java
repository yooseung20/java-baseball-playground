package game;

import java.util.List;

public class ComputerBaseballGame {
	private static final int STRIKE_FOR_WIN = 3;
	private final int computerNumber;
	private final int userNumber;

	public ComputerBaseballGame(int computerNumber, int userNumber) {
		this.computerNumber = computerNumber;
		this.userNumber = userNumber;
	}

	private Baseball generateBaseball() {
		int first = NumberUtil.getHundreds(this.computerNumber);
		int second = NumberUtil.getTens(this.computerNumber);
		int third = NumberUtil.getUnits(this.computerNumber);

		List<Ball> balls = generateBalls(first, second, third);
		return new Baseball(balls);

	}

	private List<Ball> generateBalls(int first, int second, int third) {
		Ball firstBall = new Ball(first, 1);
		Ball secondBall = new Ball(second, 2);
		Ball thirdBall = new Ball(third,3);
		return List.of(firstBall, secondBall, thirdBall);

	}

	public GameResult getResult() {
		int first = NumberUtil.getHundreds(this.userNumber);
		int second = NumberUtil.getTens(this.userNumber);
		int third = NumberUtil.getUnits(this.userNumber);

		BaseballGame baseballGame = new BaseballGame(generateBaseball(), generateBalls(first, second, third));
		return new GameResult(baseballGame.countNothing(), baseballGame.countBall(), baseballGame.countStrike());
	}

}
