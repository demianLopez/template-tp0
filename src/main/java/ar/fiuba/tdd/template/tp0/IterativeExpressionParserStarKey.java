package ar.fiuba.tdd.template.tp0;

public class IterativeExpressionParserStarKey extends ChainExpressionParser {
    String parseableSymbol = "*";
    int maxIterations = 20;
    int minIterations = 0;

    public IterativeExpressionParserStarKey(ChainExpressionParser nextExpression) {
        super(nextExpression);
    }

    public IterativeExpressionParserStarKey() {
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
            return new IterativeExpression(lastExpression, minIterations, maxIterations);
        }

        return null;
    }
}

