package baseball.domain;

import static org.assertj.core.api.AssertionsForClassTypes.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BallPositionTest {

	@Test
	void equals() {
		BallPosition ballPosition = new BallPosition(1);
		assertThat(ballPosition).isEqualTo(new BallPosition(1));
	}

}