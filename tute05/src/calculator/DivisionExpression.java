package calculator;

public class DivisionExpression implements Expression {
    Expression left;
    Expression right;

    DivisionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double compute() {
        return left.compute() / right.compute();
    }

}
