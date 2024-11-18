package game;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

public class NumberGenerateUtilTest {

	@Test
	void 세자리수_생성() {
		List<Integer> numbers = NumberGenerateUtil.createThreeDigitNumber();
		assertThat(numbers.size()).isEqualTo(3);
	}

	@Test
	void 세자리_숫자에서는_0이_존재할_수없다() {
		List<Integer> numbers = NumberGenerateUtil.createThreeDigitNumber();

		assertThat(numbers.get(0)).isNotZero();
		assertThat(numbers.get(1)).isNotZero();
		assertThat(numbers.get(2)).isNotZero();
	}

	@Test
	void 세자리는_모두_다른숫자로_구성된다() {
		List<Integer> numbers = NumberGenerateUtil.createThreeDigitNumber();
		int first = numbers.get(0);
		int second = numbers.get(1);
		int third = numbers.get(2);

		assertThat(first).isNotEqualTo(second);
		assertThat(second).isNotEqualTo(third);
		assertThat(first).isNotEqualTo(third);
	}
}
