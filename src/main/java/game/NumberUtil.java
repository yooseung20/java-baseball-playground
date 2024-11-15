package game;

import java.util.Random;


public class NumberUtil {

	private static int MIN = 1;
	private static int MAX = 8;
	private static final Random RANDOM = new Random();

	public static int generateNumber() {
		int first = generateRandomDigit();
		int second = generateRandomDigit();
		int third = generateRandomDigit();

		while(!isDiffDigit(first, second, third)) {
			first = generateRandomDigit();
			second = generateRandomDigit();
			third = generateRandomDigit();
		}

		return generateThreeDigitNumber(first, second, third);
	}

	private static int generateRandomDigit() {
		return RANDOM.nextInt(MAX) + MIN;
	}


	private static int generateThreeDigitNumber(int first, int second, int third) {
		return first * 100 + second * 10 + third;
	}

	private static boolean isDiffDigit(int first, int second, int third) {
		return  first != second && second != third && first != third;
	}

	public static int getHundreds(int number) {
		return number / 100;
	}

	public static int getTens(int number) {
		return number % 100 / 10;
	}

	public static int getUnits(int number) {
		return number % 10;
	}
}