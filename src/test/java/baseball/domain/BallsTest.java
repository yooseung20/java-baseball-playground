package baseball.domain;


import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class BallsTest {

	@Test
	void 스트라이크() {
		Balls balls = new Balls(Arrays.asList(1,2,3));
		Ball userBall = new Ball(1,1);

		assertThat(balls.compare(userBall)).isEqualTo(BallStatus.STRIKE);
	}

	@Test
	void 낫씽() {
		Balls balls = new Balls(Arrays.asList(1,2,3));
		Ball userBall = new Ball(4,1);

		assertThat(balls.compare(userBall)).isEqualTo(BallStatus.NOTHING);
	}

	@Test
	void 볼() {
		Balls balls = new Balls(Arrays.asList(1,2,3));
		Ball userBall = new Ball(2,1);

		assertThat(balls.compare(userBall)).isEqualTo(BallStatus.BALL);
	}

}