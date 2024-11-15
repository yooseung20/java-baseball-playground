package game;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BaseballGameTest {
	private Baseball baseball;

	@BeforeEach
	void setUp() {
		Ball ball1 = new Ball(1,1);
		Ball ball2 = new Ball(2,2);
		Ball ball3 = new Ball(3,3);
		List<Ball> balls = List.of(ball1, ball2,ball3);
		this.baseball =  new Baseball(balls);
	}


	@Test
	void countNothing() {
		Ball firstBall = new Ball(4, 1);
		Ball secondBall = new Ball(5, 2);
		Ball thirdBall = new Ball(6, 3);
		List<Ball> userBalls = List.of(firstBall, secondBall, thirdBall);
		BaseballGame game = new BaseballGame(this.baseball, userBalls);

		int actual = game.countNothing();
		assertThat(actual).isEqualTo(3);
	}

	@Test
	void countBall() {
		Ball firstBall = new Ball(3, 1);
		Ball secondBall = new Ball(1, 2);
		Ball thirdBall = new Ball(6, 3);
		List<Ball> userBalls = List.of(firstBall, secondBall, thirdBall);
		BaseballGame game = new BaseballGame(this.baseball, userBalls);

		int actual = game.countBall();
		assertThat(actual).isEqualTo(2);
	}

	@Test
	void countStrike() {
		Ball firstBall = new Ball(1, 1);
		Ball secondBall = new Ball(5, 2);
		Ball thirdBall = new Ball(7, 3);
		List<Ball> userBalls = List.of(firstBall, secondBall, thirdBall);
		BaseballGame game = new BaseballGame(this.baseball, userBalls);

		int actual = game.countStrike();
		assertThat(actual).isEqualTo(1);
	}
}
