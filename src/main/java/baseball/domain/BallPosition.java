package baseball.domain;

import java.util.Objects;

public class BallPosition {
	private final int position;

	public BallPosition(int position) {
		this.position = position;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object)
			return true;
		if (object == null || getClass() != object.getClass())
			return false;
		BallPosition that = (BallPosition)object;
		return position == that.position;
	}

	@Override
	public int hashCode() {
		return Objects.hash(position);
	}
}
