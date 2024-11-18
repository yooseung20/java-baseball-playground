package game;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class GameResultTest {

	@Test
	void ballReport() {
		GameResult result = new GameResult();
		result.report(BallStatus.BALL);

		assertThat(result.countStrike()).isZero();
		assertThat(result.countBall()).isOne();
	}

	@Test
	void strikeReport() {
		GameResult result = new GameResult();
		result.report(BallStatus.STRIKE);

		assertThat(result.countStrike()).isOne();
		assertThat(result.countBall()).isZero();
	}

	@Test
	void nothingReport() {
		GameResult result = new GameResult();
		result.report(BallStatus.NOTHING);

		assertThat(result.countStrike()).isZero();
		assertThat(result.countBall()).isZero();
	}
}
