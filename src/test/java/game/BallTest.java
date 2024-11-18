package game;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BallTest {

	@Test
	void isNothing() {
		Ball computerBall = new Ball(1,1);
		Ball userBall = new Ball(4,1);
		BallStatus ballStatus = computerBall.compare(userBall);
		assertThat(ballStatus).isEqualTo(BallStatus.NOTHING);
	}

	@Test
	void isStrike() {
		Ball computerBall = new Ball(1,1);
		Ball userBall = new Ball(1,1);
		BallStatus ballStatus = computerBall.compare(userBall);
		assertThat(ballStatus).isEqualTo(BallStatus.STRIKE);
	}


	@Test
	void isBall() {
		Ball computerBall = new Ball(1,1);
		Ball userBall = new Ball(1,2);
		BallStatus ballStatus = computerBall.compare(userBall);
		assertThat(ballStatus).isEqualTo(BallStatus.BALL);
	}

}
