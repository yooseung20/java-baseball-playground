package baseball.domain;


import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class BallsTest {

	@Test
	void _1_스트라이크_1_볼() {
		Balls computer = new Balls(Arrays.asList(1,2,3));
		Balls user = new Balls(Arrays.asList(1,5,2));

		GameResult result = computer.compare(user);

		assertThat(result.countStrike()).isEqualTo(1);
		assertThat(result.countBall()).isEqualTo(1);
	}

	@Test
	void _3_낫씽() {
		Balls computer = new Balls(Arrays.asList(1,2,3));
		Balls user = new Balls(Arrays.asList(4,5,6));

		GameResult result = computer.compare(user);

		assertThat(result.countStrike()).isEqualTo(0);
		assertThat(result.countBall()).isEqualTo(0);
	}

	@Test
	void _3_스트라이크() {
		Balls computer = new Balls(Arrays.asList(1,2,3));
		Balls user = new Balls(Arrays.asList(1,2,3));

		GameResult result = computer.compare(user);

		assertThat(result.countStrike()).isEqualTo(3);
	}


}