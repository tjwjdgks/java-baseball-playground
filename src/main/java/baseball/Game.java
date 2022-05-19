package baseball;

import java.io.IOException;

public class Game {
    public static int start() throws IOException {
        int strikeCount = 0;
        int ballCount =0;
        Balls computer = BallUtils.getRandomBalls();

        while(strikeCount != 3){
            Balls balls = InputView.BallInput();
            strikeCount = BallUtils.getStrikeCount(computer, balls);
            ballCount = BallUtils.getStrikeCount(computer,balls);
            OutputView.output(strikeCount,ballCount);
        }
        return InputView.flagInput();
    }
}
