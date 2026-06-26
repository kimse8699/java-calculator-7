package calculator.domain;

public class Num {
    private final int num;

    public Num(int num) {
        this.num = num;
    }

    public int sum(int sum) {
        return sum += num;
    }
}
