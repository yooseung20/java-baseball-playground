package baseball;

import java.util.List;

import baseball.domain.BallResult;
import baseball.domain.Balls;
import baseball.domain.NumberGenerator;

public class Application {
	public static void main(String[] args) {
		InputView inputView = new InputView();
		ResultView resultView = new ResultView();

		boolean gameEnd = false;
		List<Integer> computer = NumberGenerator.createNumbers();

		while (!gameEnd) {
			BallResult result = playGame(computer, inputView.start());
			computer = regenerateNumbers(result, computer);
			gameEnd = processGameEnd(result, resultView);
		}

	}

	private static List<Integer> regenerateNumbers(BallResult ballResult, List<Integer> computer) {
		if (!ballResult.isGameEnd()) {
			return computer;
		}
		return NumberGenerator.createNumbers();
	}

	private static boolean processGameEnd(BallResult ballResult, ResultView resultView) {
		if (!ballResult.isGameEnd()) {
			resultView.printForContinue(ballResult);
			return false;
		}

		return resultView.end();

	}

	private static BallResult playGame(List<Integer> computer, List<Integer> user) {
		Balls computerBalls = new Balls(computer);
		return computerBalls.play(user);
	}

}
