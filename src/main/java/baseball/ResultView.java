package baseball;

import baseball.domain.GameResult;

public class ResultView {

	private static final int MIN = 0;

	public void printContinue(GameResult result) {
		StringBuilder builder = new StringBuilder();

		if (result.countBall() > MIN) {
			builder.append(result.countBall() + "볼 ");
		}

		if(result.countStrike() > MIN) {
			builder.append(result.countStrike() + "스트라이크 ");
		}

		System.out.println(builder);

	}

	public void printEnd() {
		System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
	}
}
