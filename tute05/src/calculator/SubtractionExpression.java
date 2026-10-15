package calculator;

public class SubtractionExpression implements Expression {
    Expression left;
    Expression right;

    SubtractionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double compute() {
        return left.compute() - right.compute();
    }

}
