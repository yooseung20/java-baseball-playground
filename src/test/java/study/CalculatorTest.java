package study;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	void test() {
		String[] inputs = "2 + 3 * 4 / 2".split(" ");
		int actual = Calculator.calculate(inputs);
		int expected = 10;

		assertThat(actual).isEqualTo(expected);
	}

	@Test
	void plus() {
		String[] inputs = "2 + 3".split(" ");
		int actual = Calculator.calculate(inputs);
		int expected = 5;

		assertThat(actual).isEqualTo(expected);
	}

	@Test
	void minus() {
		String[] inputs = "3 - 2".split(" ");
		int actual = Calculator.calculate(inputs);
		int expected = 1;

		assertThat(actual).isEqualTo(expected);
	}

	@Test
	void multiply() {
		String[] inputs = "2 * 3".split(" ");
		int actual = Calculator.calculate(inputs);
		int expected = 6;

		assertThat(actual).isEqualTo(expected);
	}

	@Test
	void divide() {
		String[] inputs = "4 / 2".split(" ");
		int actual = Calculator.calculate(inputs);
		int expected = 2;

		assertThat(actual).isEqualTo(expected);
	}





}
