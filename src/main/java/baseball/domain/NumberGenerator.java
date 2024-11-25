package baseball.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class NumberGenerator {
	private static int DEFAULT_SIZE=3;
	private static int MIN=1;
	private static int MAX=8;

	public static List<Integer> createNumbers() {
		Set<Integer> numbers = new HashSet<>();

		while (numbers.size() < DEFAULT_SIZE) {
			numbers.add(createNumber());
		}

		return new ArrayList<>(numbers);
	}

	private static int createNumber() {
		Random random = new Random();
		return MIN + random.nextInt(MAX);
	}
}
