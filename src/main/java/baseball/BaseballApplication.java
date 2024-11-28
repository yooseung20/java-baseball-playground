package baseball;

import java.util.List;

import baseball.domain.BaseballGame;
import baseball.domain.GameResult;
import baseball.utils.NumberGenerator;

public class BaseballApplication {
	public static void main(String[] args) {
		InputView inputView = new InputView();

		List<Integer> computer = NumberGenerator.createDiffNumbers();

		while (true) {
			List<Integer> user = inputView.start();
			GameResult result = play(computer, user);
			printResult(result);

			terminate(result, inputView);
			computer = restart(result, computer);
		}
	}

	private static List<Integer> restart(GameResult result, List<Integer> computer) {
		if (result.isEnd()) {
			return NumberGenerator.createDiffNumbers();
		}
		return computer;
	}

	private static void terminate(GameResult result, InputView inputView) {
		if (result.isEnd() && !inputView.restart()) {
			System.exit(0);
		}
	}

	private static GameResult play(List<Integer> computer, List<Integer> user) {
		BaseballGame game = new BaseballGame(computer, user);
		GameResult result = game.start();

		return result;
	}

	private static void printResult(GameResult result) {
		ResultView resultView = new ResultView();

		if (!result.isEnd()) {
			resultView.printContinue(result);
			return;
		}

		resultView.printEnd();
	}

}
