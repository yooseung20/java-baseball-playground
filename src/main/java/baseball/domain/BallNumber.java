package baseball.domain;

import java.util.Objects;

public class BallNumber {
	private final int number;

	public BallNumber(int number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object)
			return true;
		if (object == null || getClass() != object.getClass())
			return false;
		BallNumber that = (BallNumber)object;
		return number == that.number;
	}

	@Override
	public int hashCode() {
		return Objects.hash(number);
	}
}
