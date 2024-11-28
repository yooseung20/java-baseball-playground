package baseball.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GameResultTest {

	@Test
	void 스트라이크() {
		GameResult result = new GameResult();
		result.report(BallStatus.STRIKE);

		assertThat(result.countStrike()).isEqualTo(1);
	}

	@Test
	void 볼() {
		GameResult result = new GameResult();
		result.report(BallStatus.BALL);

		assertThat(result.countBall()).isEqualTo(1);
	}

	@Test
	void 낫씽() {
		GameResult result = new GameResult();
		result.report(BallStatus.NOTHING);

		assertThat(result.countBall()).isEqualTo(0);
		assertThat(result.countStrike()).isEqualTo(0);
	}

	@Test
	void 게임_끝() {
		GameResult result = new GameResult();
		result.report(BallStatus.STRIKE);
		result.report(BallStatus.STRIKE);
		result.report(BallStatus.STRIKE);

		assertThat(result.isEnd()).isEqualTo(true);
	}

	@Test
	void 게임_계속진행() {
		GameResult result = new GameResult();
		result.report(BallStatus.BALL);
		result.report(BallStatus.STRIKE);
		result.report(BallStatus.STRIKE);
		assertThat(result.isEnd()).isEqualTo(false);
	}

}