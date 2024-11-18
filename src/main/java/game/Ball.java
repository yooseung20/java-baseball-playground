package game;

public class Ball {

	private final BallNo ballNo;
	private final int position;

	public Ball(int ballNo, int position)  {
		this.ballNo = new BallNo(ballNo);
		this.position = position;
	}

	public BallStatus compare(Ball userBall) {
		if (userBall.equals(this)) {
			return BallStatus.STRIKE;
		}

		if (userBall.matchBallNo(this.ballNo)) {
			return BallStatus.BALL;
		}
		return BallStatus.NOTHING;
	}

	private boolean matchBallNo(BallNo ballNo) {
		return this.ballNo.equals(ballNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Ball)) {
			return false;
		}
		Ball other = (Ball) obj;
		// 공 번호와 위치가 같으면 동일한 공으로 간주
		return this.ballNo == other.ballNo && this.position == other.position;
	}

}
