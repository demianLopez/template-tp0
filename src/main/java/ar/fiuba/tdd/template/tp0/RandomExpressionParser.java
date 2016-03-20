package ar.fiuba.tdd.template.tp0;

public class RandomExpressionParser extends ChainExpressionParser {
    String parseableSymbol = ".";

    public RandomExpressionParser(ChainExpressionParser nextExpression) {
        super(nextExpression);
    }

    public RandomExpressionParser() {
        super(null);
    }

    @Override
    protected boolean canIParse(ParseableExpression expression) {
        return (parseableSymbol.compareTo(expression.getCurrentChar()) == 0);
    }

    @Override
    protected Expression parse(ParseableExpression expression, Expression lastExpression) {
        if (canIParse(expression)) {
            expression.getNextChar();
            return new RandomExpression();
        }

        return null;
    }
}
