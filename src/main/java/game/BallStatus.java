package game;

public enum BallStatus {
	STRIKE, BALL, NOTHING;

	public boolean isNothing() {
		return this == NOTHING;
	}
}
