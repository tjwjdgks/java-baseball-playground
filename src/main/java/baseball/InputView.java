package baseball;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;

public class InputView {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static Balls BallInput() throws IOException {
        System.out.print("숫자를 입력해 주세요 : ");
        String s_balls = br.readLine();
        String[] ballArr = s_balls.split("");
        int first = Integer.parseInt(ballArr[0]);
        int second = Integer.parseInt(ballArr[1]);
        int third = Integer.parseInt(ballArr[2]);
        return new Balls(first,second,third);
    }
    public static int flagInput() throws IOException {
        int flag = Integer.parseInt(br.readLine());
        return flag;
    }
}
