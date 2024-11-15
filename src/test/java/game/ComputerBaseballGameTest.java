package game;

import static org.assertj.core.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ComputerBaseballGameTest {

	@Test
	void validResult() {
		ComputerBaseballGame game = new ComputerBaseballGame(123,234);
		GameResult result = game.getResult();
		int ballCount = result.getBallCount();
		int strikeCount = result.getStrikeCount();

		assertThat(ballCount).isEqualTo(2);
		assertThat(strikeCount).isEqualTo(0);
	}

	@Test
	void printResultWhenFailed() {
		ComputerBaseballGame game = new ComputerBaseballGame(123,234);

	}
}
