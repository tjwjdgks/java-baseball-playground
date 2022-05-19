package baseball;

public class OutputView {
    public static void output(int strike, int ball){
        if(strike == 3){
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료 " +
                    "\n 게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            return;
        }

        if(strike == 0 && ball ==0){
            System.out.println("낫싱");
        }

        String text = "";

        if(strike !=0){
            text += strike + "스트라이크 ";
        }

        if(ball != 0){
            text += ball + "볼 ";
        }

        System.out.println(text);
    }
}
