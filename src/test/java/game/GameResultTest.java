package game;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class GameResultTest {

	@Test
	void win() {
		GameResult result = new GameResult(0,0,3);
		boolean actual = result.win();
		assertThat(actual).isTrue();
	}
}
