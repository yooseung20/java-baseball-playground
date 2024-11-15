package game;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BaseballTest {

	@Test
	@DisplayName("볼은 3개가 한세트이다.")
	void size() {
		Baseball baseball = createBaseball(1, 2, 3);
		assertThat(baseball.size()).isEqualTo(3);
	}

	@Test
	void matchNothing() {
		Baseball baseball = createBaseball(1, 2, 3);
		Ball ball = new Ball(4, 1);
		BallStatus status = baseball.compare(ball);

		assertThat(status).isEqualTo(BallStatus.NOTHING);
	}

	@Test
	void matchBall() {
		Baseball baseball = createBaseball(1, 2, 3);
		Ball ball = new Ball(1, 3);
		BallStatus status = baseball.compare(ball);

		assertThat(status).isEqualTo(BallStatus.BALL);
	}

	@Test
	void matchStrike() {
		Baseball baseball = createBaseball(1, 2, 3);
		Ball ball = new Ball(1, 1);
		BallStatus status = baseball.compare(ball);

		assertThat(status).isEqualTo(BallStatus.STRIKE);
	}

	private static Baseball createBaseball(int first, int second, int third) {
		Ball ball1 = new Ball(first,1);
		Ball ball2 = new Ball(second,2);
		Ball ball3 = new Ball(third,3);
		List<Ball> balls = List.of(ball1, ball2,ball3);
		return new Baseball(balls);
	}
}
