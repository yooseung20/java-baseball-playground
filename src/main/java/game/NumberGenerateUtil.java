package game;

import java.util.Random;

public class NumberGenerateUtil {
	private static int MIN=1;
	private static int MAX=9;

	public static int createThreeDigitNumber() {

		int hundreds = createUnits();
		int tens = createUnits();
		int units = createUnits();

		while(hundreds == tens || tens == units || hundreds == units) {
			hundreds = createUnits();
			tens = createUnits();
			units = createUnits();
		}

		return hundreds * 100 + tens * 10 + units;

	}

	private static int createUnits() {
		Random random = new Random();
		return MIN + random.nextInt(MAX);
	}
}
