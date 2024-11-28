package baseball.utils;


import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class NumberGeneratorTest {

	@Test
	void 하나의_숫자는_1부터_9까지의_숫자를_가진다() {
		List<Integer> numbers = NumberGenerator.createDiffNumbers();
		assertThat(numbers.get(0)).isBetween(1, 9);
		assertThat(numbers.get(1)).isBetween(1, 9);
		assertThat(numbers.get(2)).isBetween(1, 9);
	}

	@Test
	void _3개의_숫자를_만든다() {
		List<Integer> numbers = NumberGenerator.createDiffNumbers();
		assertThat(numbers.size()).isEqualTo(3);
	}

	@Test
	void _3개의_숫자는_각각_다른값을_가진다() {
		List<Integer> numbers = NumberGenerator.createDiffNumbers();

		assertThat(numbers.get(0)).isNotEqualTo(numbers.get(1));
		assertThat(numbers.get(0)).isNotEqualTo(numbers.get(2));
		assertThat(numbers.get(2)).isNotEqualTo(numbers.get(1));
	}

}