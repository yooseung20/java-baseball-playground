package game;


import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BallTest {


	@Test
	void nothing() {
		Ball actual = new Ball(1,1);
		Ball guess = new Ball(2, 1);
		BallStatus ballStatus = actual.compare(guess);
		assertThat(ballStatus).isEqualTo(BallStatus.NOTHING);
	}

	@Test
	void strike() {
		Ball actual = new Ball(1,1);
		Ball guess = new Ball(1,1);
		BallStatus ballStatus = actual.compare(guess);
		assertThat(ballStatus).isEqualTo(BallStatus.STRIKE);
	}

	@Test
	void ball() {
		//숫자는 맞았지만 위치가 다름
		Ball actual = new Ball(1,1);
		Ball guess = new Ball(1,3);
		BallStatus ballStatus = actual.compare(guess);
		assertThat(ballStatus).isEqualTo(BallStatus.BALL);
	}
}
