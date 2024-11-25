package baseball;

import java.util.Scanner;

import baseball.domain.BallResult;

public class ResultView {

	public void printForContinue(BallResult result) {
		StringBuilder builder = new StringBuilder();
		if (result.countBall() > 0) {
			builder.append(result.countBall() + "볼 ");
		}
		if (result.countStrike() > 0) {
			builder.append(result.countStrike() + "스트라이크 ");
		}
		System.out.println(builder.toString());
	}

	public boolean end() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
		System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

		int input = scanner.nextInt();

		if (input == 1) {
			return false;
		}
		return true;
	}

}
