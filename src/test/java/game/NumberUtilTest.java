package game;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumberUtilTest {


	@Test
	@DisplayName("세자리 수인지 확인")
	void numberSize() {
		int actual = NumberUtil.generateNumber();
		int min = 100;
		int max = 999;
		assertThat(actual).isBetween(min, max);
	}

	@Test
	@DisplayName("세자리숫자가 1~9 까지의 숫자여야한다. 0은 존재할 수 없음")
	void betweenFromOneToNine(){
		int actual = NumberUtil.generateNumber();
		int hundreds = actual / 100;
		int tens = actual % 100 / 10;
		int units = actual % 10;

		assertThat(hundreds).isBetween(1,9);
		assertThat(tens).isBetween(1,9);
		assertThat(units).isBetween(1,9);
	}

	@Test
	@DisplayName("세자리 숫자는 각기 다른 숫자를 가져야한다.")
	void shouldDiffNumber() {
		int actual = NumberUtil.generateNumber();
		int hundreds = actual / 100;
		int tens = actual % 100 / 10;
		int units = actual % 10;

		assertThat(hundreds).isNotEqualTo(tens);
		assertThat(tens).isNotEqualTo(units);
		assertThat(units).isNotEqualTo(hundreds);
	}

	@Test
	void getHundreds() {
		int number = 123;
		int actual = NumberUtil.getHundreds(number);
		int expected = 1;

		assertThat(actual).isEqualTo(expected);
	}

	@Test
	void getTens() {
		int number = 123;
		int actual = NumberUtil.getTens(number);
		int expected = 2;

		assertThat(actual).isEqualTo(expected);
	}

	@Test
	void getUnits() {
		int number = 123;
		int actual = NumberUtil.getUnits(number);
		int expected = 3;

		assertThat(actual).isEqualTo(expected);
	}
}
