package baseball.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BallTest {

	@Test
	void 낫싱() {
		Ball ball = new Ball(2, 1);
		Ball other = new Ball(1, 1);
		assertThat(ball.compare(other)).isEqualTo(BallStatus.NOTHING);
	}

	@Test
	void 스트라이크() {
		Ball ball = new Ball(1, 1);
		Ball other = new Ball(1, 1);
		assertThat(ball.compare(other)).isEqualTo(BallStatus.STRIKE);
	}

	@Test
	void 볼() {
		Ball ball = new Ball(1, 1);
		Ball other = new Ball(1, 2);
		assertThat(ball.compare(other)).isEqualTo(BallStatus.BALL);
	}


}