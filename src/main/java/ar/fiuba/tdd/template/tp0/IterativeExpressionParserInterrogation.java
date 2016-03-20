package ar.fiuba.tdd.template.tp0;

public class IterativeExpressionParserInterrogation extends ChainExpressionParser {
    String parseableSymbol = "?";
    int maxIterations = 1;
    int minIterations = 0;

    public IterativeExpressionParserInterrogation(ChainExpressionParser nextExpression) {
        super(nextExpression);
    }

    public IterativeExpressionParserInterrogation() {
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

