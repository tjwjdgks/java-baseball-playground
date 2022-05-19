package baseball;

public class Balls {
    int first, second, third;
    public Balls(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
    public boolean isRandom(){
        if(first != second && second != third && first != third) return true;
        return false;
    }
}
