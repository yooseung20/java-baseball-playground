package study;

import java.util.Random;
import java.util.Scanner;


public class BaseballGame {

	public static void main(String[] args) {
		// 3자리로된 숫지 생성(겹치는 숫자가 없음)
		int randomNumber = generateUniqueNumbers();
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		gameStart(scanner, randomNumber, input);
	}

	public static void gameStart(Scanner scanner, int randomNumber, String input) {
		String[] values = String.valueOf(randomNumber).split("");
		String[] digits = input.split("");

		while (isContinue(randomNumber, input, scanner)) {
			int ball = 0;
			int strike = 0;

			//입력한값 123
			for (int i = 0; i < digits.length; i++) {
				int digit = Integer.parseInt(digits[i]);
				//랜덤으로 생성 된 값
				for (int j = 0; j < values.length; j++) {
					int target = Integer.parseInt(values[j]);

					if (i == j && digit == target) {
						strike += 1;
						continue;
					}
					if (digit == target) {
						ball += 1;
					}
				}
			}
			if (strike > 0)
				System.out.print(strike + "스트라이크 ");
			if (ball > 0)
				System.out.print(ball + "볼");

		}
	}


	private static boolean isContinue(int randomNumber, String input, Scanner scanner) {
		if (randomNumber != Integer.valueOf(input)) {
			return true;
		}
		System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
		return isEndless(scanner);

	}

	private static boolean isEndless(Scanner scanner) {
		System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
		int input = scanner.nextInt();
		if (input == 1)
			return false;
		return true;
	}

	public static int generateUniqueNumbers() {
		Random random = new Random();
		int randomNumber;

		while (true) {
			randomNumber = 100 + random.nextInt(900); // 100부터 999까지 랜덤 숫자 생성
			int hundreds = randomNumber / 100; // 백의 자리 숫자
			int tens = (randomNumber / 10) % 10; // 십의 자리 숫자
			int units = randomNumber % 10; // 일의 자리 숫자

			// 각 자리 숫자가 모두 다를 경우에만 반환
			if (hundreds != tens && hundreds != units && tens != units) {
				return randomNumber;
			}
		}
	}
}
