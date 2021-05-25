package game;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class NumberGenerateUtilTest {

	@Test
	void 세자리수_생성() {
		int number = NumberGenerateUtil.createThreeDigitNumber();
		assertThat(number).isGreaterThanOrEqualTo(100);
		assertThat(number).isLessThanOrEqualTo(999);
	}

	@Test
	void 세자리_숫자에서는_0이_존재할_수없다() {
		int number = NumberGenerateUtil.createThreeDigitNumber();
		int hundreds = number / 100;
		int tens = number % 100 / 10;
		int units = number % 10;

		assertThat(hundreds).isNotZero();
		assertThat(tens).isNotZero();
		assertThat(units).isNotZero();
	}

	@Test
	void 세자리는_모두_다른숫자로_구성된다() {
		int number = NumberGenerateUtil.createThreeDigitNumber();
		int hundreds = number / 100;
		int tens = number % 100 / 10;
		int units = number % 10;

		assertThat(hundreds).isNotEqualTo(tens);
		assertThat(tens).isNotEqualTo(units);
		assertThat(units).isNotEqualTo(hundreds);
	}
}
