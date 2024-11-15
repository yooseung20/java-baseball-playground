package game;

public class GameResult {
	private static final int BALL_COUNT = 3;
	private final int nothingCount;
	private final int ballCount;
	private final int strikeCount;

	public GameResult(int nothingCount, int ballCount, int strikeCount) {
		this.nothingCount = nothingCount;
		this.ballCount = ballCount;
		this.strikeCount = strikeCount;
	}

	public boolean win() {
		return this.strikeCount == BALL_COUNT;
	}

	public int getBallCount() {
		return this.ballCount;
	}

	public int getStrikeCount() {
		return this.strikeCount;
	}



}
