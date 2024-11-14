package study;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class SetTest {
	private Set<Integer> numbers;

	@BeforeEach
	void setUp()  {
		this.numbers = new HashSet<>();
		this.numbers.add(1);
		this.numbers.add(1);
		this.numbers.add(2);
		this.numbers.add(3);
	}

	@Test
	void size() {
		int actual = this.numbers.size();
		int expected = 3;

		assertThat(actual).isEqualTo(expected);
	}

	@Test
	void contains() {
		assertThat(this.numbers.contains(1)).isTrue();
		assertThat(this.numbers.contains(2)).isTrue();
		assertThat(this.numbers.contains(3)).isTrue();
	}

	@ParameterizedTest
	@ValueSource(ints = {1,2,3})
	void containsUsingValueSource(int number) {
		assertThat(this.numbers.contains(number)).isTrue();
	}

	@ParameterizedTest
	@CsvSource(value = {
		"1,true",
		"2,true",
		"3,true",
		"4,false",
		"5,false"
	})
	void containsUsingCsvSource(int number, boolean expected) {
		assertEquals(this.numbers.contains(number), expected);
	}
}
