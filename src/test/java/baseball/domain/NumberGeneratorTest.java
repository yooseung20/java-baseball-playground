package baseball.domain;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberGeneratorTest {

	@Test
	@DisplayName("3개의 숫자를 생성한다.")
	void create3Units() {
		List<Integer> numbers = NumberGenerator.createNumbers();
		assertThat(numbers.size()).isEqualTo(3);
	}

	@Test
	@DisplayName("각 숫자는 서로 다른 값을 가진다.")
	void compareUnits() {
		List<Integer> numbers = NumberGenerator.createNumbers();
		assertThat(numbers.get(0)).isNotEqualTo(numbers.get(1));
		assertThat(numbers.get(0)).isNotEqualTo(numbers.get(2));
		assertThat(numbers.get(2)).isNotEqualTo(numbers.get(1));
	}

	@Test
	@DisplayName("각각의 숫자는 1~9까지의 값을 가진다.")
	void betweenFrom1To9() {
		List<Integer> numbers = NumberGenerator.createNumbers();
		assertThat(numbers.get(0)).isBetween(1,9);
		assertThat(numbers.get(1)).isBetween(1,9);
		assertThat(numbers.get(2)).isBetween(1,9);
	}
}