package baseball;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int flag = 1;
        while(flag !=1){
            flag = Game.start();
        }
    }
}
