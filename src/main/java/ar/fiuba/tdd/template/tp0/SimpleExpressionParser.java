package ar.fiuba.tdd.template.tp0;

public class SimpleExpressionParser extends ChainExpressionParser {

    public SimpleExpressionParser(ChainExpressionParser nextExpression) {
        super(nextExpression);
    }

    public SimpleExpressionParser() {
        super(null);
    }

    @Override
    protected boolean canIParse(ParseableExpression expression) {
        return true;
    }

    @Override
    protected Expression parse(ParseableExpression expression, Expression lastExpression) {
        return new SimpleExpression(expression.getNextChar());
    }
}
