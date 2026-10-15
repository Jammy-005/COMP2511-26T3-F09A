package calculator;

public class MultiplicationExpression implements Expression {
    Expression left;
    Expression right;

    MultiplicationExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double compute() {
        return left.compute() * right.compute();
    }

}
