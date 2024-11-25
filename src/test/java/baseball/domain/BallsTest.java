package baseball.domain;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class BallsTest {

	@Test
	void playNothing() {
		List<Integer> computer = Arrays.asList(1,2,3);
		List<Integer> user = Arrays.asList(4,5,6);
		Balls balls = new Balls(computer);

		BallResult  result = balls.play(user);

		assertThat(result.countStrike()).isEqualTo(0);
		assertThat(result.countBall()).isEqualTo(0);
	}

	@Test
	void play_1ball_1strike() {
		List<Integer> computer = Arrays.asList(1,2,3);
		List<Integer> user = Arrays.asList(1,5,2);
		Balls balls = new Balls(computer);

		BallResult  result = balls.play(user);

		assertThat(result.countStrike()).isEqualTo(1);
		assertThat(result.countBall()).isEqualTo(1);
	}

	@Test
	void play_3strike() {
		List<Integer> computer = Arrays.asList(1,2,3);
		List<Integer> user = Arrays.asList(1,2,3);
		Balls balls = new Balls(computer);

		BallResult  result = balls.play(user);

		assertThat(result.isGameEnd()).isTrue();
	}

}