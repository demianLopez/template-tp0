package ar.fiuba.tdd.template.tp0;

public class IterativeExpressionParserPlus extends ChainExpressionParser {
    String parseableSymbol = "+";
    int maxIterations = 20;
    int minIterations = 1;

    public IterativeExpressionParserPlus(ChainExpressionParser nextExpression) {
        super(nextExpression);
    }

    public IterativeExpressionParserPlus() {
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
