package baseball;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {

	public List<Integer> start() {
		Scanner scanner = new Scanner(System.in);

		List<Integer> numbers = new ArrayList<>();
		System.out.print("숫자를 입력해 주세요. : ");
		String[] input = scanner.nextLine().split("");

		for (String number: input) {
			numbers.add(Integer.valueOf(number));
		}

		return numbers;

	}
}
