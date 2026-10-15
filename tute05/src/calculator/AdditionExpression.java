package calculator;

public class AdditionExpression implements Expression {
    Expression left;
    Expression right;

    AdditionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double compute() {
        return left.compute() + right.compute();
    }
}
