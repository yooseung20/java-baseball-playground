package study;

import static org.assertj.core.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BaseballGameTest {

	private BaseballGame baseballGame;

	@BeforeEach
	void setUp() {
		this.baseballGame = new BaseballGame();

	}
	@Test
	@DisplayName("unique 3자리수 만들기")
	void generateUniqueNumber() {
		int actual = baseballGame.generateUniqueNumbers();
		String[] split = String.valueOf(actual).split("");
		assertThat(split).hasSize(3);
		assertThat(split[0]).isNotEqualTo(split[1]);
		assertThat(split[0]).isNotEqualTo(split[2]);
		assertThat(split[1]).isNotEqualTo(split[2]);
	}


}