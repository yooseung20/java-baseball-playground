package baseball.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BallTest {

	@Test
	void nothing() {
		Ball ball = new Ball(1,1);
		Ball userBall = new Ball(2,3);

		BallStatus ballStatus = ball.compare(userBall);
		assertThat(ballStatus).isEqualTo(BallStatus.NOTHING);
	}

	@Test
	void strike() {
		Ball ball = new Ball(1,1);
		Ball userBall = new Ball(1,1);

		BallStatus ballStatus = ball.compare(userBall);
		assertThat(ballStatus).isEqualTo(BallStatus.STRIKE);
	}

	@Test
	void ball() {
		Ball ball = new Ball(1,1);
		Ball userBall = new Ball(1,3);

		BallStatus ballStatus = ball.compare(userBall);
		assertThat(ballStatus).isEqualTo(BallStatus.BALL);
	}

}