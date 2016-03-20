package ar.fiuba.tdd.template.tp0;

public abstract class ChainExpressionParser implements ExpressionParser {

    ChainExpressionParser nextExpression;

    public ChainExpressionParser(ChainExpressionParser nextExpression) {
        this.nextExpression = nextExpression;
    }

    @Override
    public Expression parseExpression(ParseableExpression expression, Expression lastExpression) {
        if (!canIParse(expression)) {
            return nextExpression.parseExpression(expression, lastExpression);
        } else {
            return parse(expression, lastExpression);
        }
    }

    @Override
    public boolean isParseable(ParseableExpression expression) {
        return nextExpression.isParseable(expression) || canIParse(expression);
    }

    protected abstract boolean canIParse(ParseableExpression expression);

    protected abstract Expression parse(ParseableExpression expression, Expression lastExpression);
}
