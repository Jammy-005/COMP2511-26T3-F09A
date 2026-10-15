package calculator;

public class Number implements Expression {
    double value;

    Number(double value) {
        this.value = value;
    }

    @Override
    public double compute() {
        return value;
    }
}
