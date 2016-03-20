package ar.fiuba.tdd.template.tp0;

public class IterativeExpressionParserStarKey extends SymbolExpressionParser {

    int maxIterations = 20;
    int minIterations = 0;

    public IterativeExpressionParserStarKey(ChainExpressionParser nextExpression) {
        super(nextExpression);
    }

    public IterativeExpressionParserStarKey() {
        super(null);
    }

    @Override
    protected String getParseableSymbol() {
        return "*";
    }

    @Override
    protected Expression parse(ParseableExpression expression, Expression lastExpression) {
        expression.getNextChar();
        lastExpression.setDisabled(true);
        return new IterativeExpression(lastExpression, minIterations, maxIterations);
    }
}

