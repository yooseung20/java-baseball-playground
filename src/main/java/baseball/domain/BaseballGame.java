package baseball.domain;

import java.util.List;

public class BaseballGame {

	private final Balls computer;
	private final Balls user;

	public BaseballGame(List<Integer> computer, List<Integer> user) {
		this.computer = new Balls(computer);
		this.user = new Balls(user);
	}

	public boolean start() {
		GameResult result = this.computer.compare(user);
		return result.isEnd();
	}

}
