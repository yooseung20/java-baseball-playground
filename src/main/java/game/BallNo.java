package game;

public class BallNo {
	private int ballNo;

	public BallNo(int ballNo) {
		this.ballNo = ballNo;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof BallNo)) {
			return false;
		}
		BallNo other = (BallNo) obj;
		return this.ballNo == other.ballNo;
	}
}
