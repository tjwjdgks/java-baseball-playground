package baseball;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class BaseBallTest {

    @Test
    void isAllRandom(){
        Balls ball = new Balls(1,1,2);
        assertThat(ball.isRandom()).isFalse();
    }
    @Test
    void allRandomBall(){
        Balls randomBalls = BallUtils.getRandomBalls();
        System.out.println(randomBalls.first+" "+randomBalls.second+" "+randomBalls.third);
        assertThat(randomBalls.isRandom()).isTrue();
    }

    @Test
    void hasStrike(){
        Balls computer = new Balls(1,2,3);
        Balls player = new Balls(1,4,5);
        assertThat(BallUtils.getStrikeCount(computer,player)).isEqualTo(1);
    }
    @Test
    void hasBall(){
        Balls computer = new Balls(4,2,3);
        Balls player = new Balls(1,4,5);
        assertThat(BallUtils.getBallCount(computer,player)).isEqualTo(1);

    }
}
