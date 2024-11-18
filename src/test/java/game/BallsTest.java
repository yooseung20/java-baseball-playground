package game;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class BallsTest {

	@Test
	void isNothingWhenOneBallPlay() {
		Balls balls = new Balls(Arrays.asList(1,2,3));
		Ball ball = new Ball(7, 1);

		BallStatus status = balls.play(ball);
		assertThat(status).isEqualTo(BallStatus.NOTHING);

	}

	@Test
	void isBallWhenOneBallPlay() {
		Balls balls = new Balls(Arrays.asList(1,2,3));
		Ball ball = new Ball(3, 1);

		BallStatus status = balls.play(ball);
		assertThat(status).isEqualTo(BallStatus.BALL);

	}

	@Test
	void isStrikeWhenOneBallPlay() {
		Balls balls = new Balls(Arrays.asList(1,2,3));
		Ball ball = new Ball(1, 1);

		BallStatus status = balls.play(ball);
		assertThat(status).isEqualTo(BallStatus.STRIKE);

	}

	@Test
	void isNothing() {
		Balls balls = new Balls(Arrays.asList(1,2,3));
		GameResult result = balls.game(Arrays.asList(4,5,6));

		assertThat(result.countBall()).isZero();
		assertThat(result.countStrike()).isZero();
	}

	@Test
	void is_1ball_1strike() {
		Balls balls = new Balls(Arrays.asList(1,2,3));
		GameResult result = balls.game(Arrays.asList(1,5,2));

		assertThat(result.countBall()).isEqualTo(1);
		assertThat(result.countStrike()).isEqualTo(1);
	}

	@Test
	void is3strike() {
		Balls balls = new Balls(Arrays.asList(1,2,3));
		GameResult result = balls.game(Arrays.asList(1,2,3));

		assertThat(result.isGameEnd()).isTrue();
	}


}
