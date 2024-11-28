package baseball;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {
	private final Scanner scanner = new Scanner(System.in);

	public List<Integer> start() {
		System.out.print("숫자를 입력해 주세요 : ");
		return toIntegerList(scanner.nextLine());
	}

	private List<Integer> toIntegerList(String userBall) {
		validateStart(userBall);

		return Arrays.stream(userBall.split(""))
			.map(Integer::parseInt)
			.collect(Collectors.toList());

	}

	private void validateStart(String input) {
		char[] charArray = input.toCharArray();

		if (charArray.length > 3) {
			throw new IllegalArgumentException("세자리 숫자를 입력하세요.");
		}

		for (char s : charArray) {
			if (!Character.isDigit(s)) {
				throw new IllegalArgumentException("숫자만 입력하세요.");
			}
		}
	}

	public boolean restart() {
		System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
		return isRestart(scanner.nextInt());
	}

	private boolean isRestart(int input) {
		validateRestart(input);

		if (input == 1) {
			return true;
		}
		return false;

	}

	private void validateRestart(int input) {
		if (input !=1 && input !=2) {
			throw new IllegalArgumentException("1 또는 2를 입력하세요.");
		}
	}

}
