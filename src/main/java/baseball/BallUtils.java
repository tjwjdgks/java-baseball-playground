package baseball;

import java.util.Random;

public class BallUtils {


    public static int getStrikeCount(Balls computer, Balls player) {
        int strikeCount =0;
        if(computer.first == player.first) strikeCount++;
        if(computer.second == player.second) strikeCount++;
        if(computer.third == player.third) strikeCount++;
        return strikeCount;
    }

    public static int getBallCount(Balls computer, Balls player) {
        int ballCount = 0;
        if(computer.first == player.second || computer.first == player.third) ballCount++;
        if(computer.second == player.first || computer.second == player.third) ballCount++;
        if(computer.third == player.second || computer.third == player.first) ballCount++;
        return ballCount;
    }

    public static Balls getRandomBalls() {
        Balls balls = new Balls(0,0,0);
        while(!balls.isRandom()){
            balls.first = new Random().nextInt(9)+1;
            balls.second = new Random().nextInt(9)+1;
            balls.third = new Random().nextInt(9)+1;
        }
        return balls;
    }
}
