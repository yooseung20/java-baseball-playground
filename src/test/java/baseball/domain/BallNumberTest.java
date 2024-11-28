package baseball.domain;

import static org.assertj.core.api.Assertions.*;


import org.junit.jupiter.api.Test;

class BallNumberTest {

	@Test
	void equals() {
		BallNumber actual = new BallNumber(1);
		assertThat(actual).isEqualTo(new BallNumber(1));
	}

}