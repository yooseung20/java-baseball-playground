package game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class NumberGenerateUtil {
	private static int DEFAULT_SIZE =3;
	private static int MIN=1;
	private static int MAX=9;

	public static List<Integer> createThreeDigitNumber() {
		Set<Integer> numbers = new HashSet<>();

		while(numbers.size() < DEFAULT_SIZE) {
			numbers.add(createUnits());
		}

		return new ArrayList<>(numbers);
	}

	private static int createUnits() {
		Random random = new Random();
		return MIN + random.nextInt(MAX);
	}
}
