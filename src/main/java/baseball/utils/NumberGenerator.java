package baseball.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class NumberGenerator {
	private static final int DEFAULT_SIZE = 3;
	private static final int MIN = 1;
	private static final int MAX = 8;

	public static List<Integer> createDiffNumbers() {
		Set<Integer> numbers = new HashSet<>();

		while (numbers.size() < DEFAULT_SIZE) {
			numbers.add(createUnits());
		}
		return new ArrayList<>(numbers);
	}

	private static int createUnits() {
		Random random = new Random();
		return MIN + random.nextInt(MAX);
	}
}
