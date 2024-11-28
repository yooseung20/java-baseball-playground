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

			if (result.isEnd() && !inputView.restart()) {
				break;
			}

			if (result.isEnd()) {
				computer = NumberGenerator.createDiffNumbers();
			}
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
