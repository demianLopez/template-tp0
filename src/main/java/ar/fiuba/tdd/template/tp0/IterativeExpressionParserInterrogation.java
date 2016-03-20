package ar.fiuba.tdd.template.tp0;

public class IterativeExpressionParserInterrogation extends SymbolExpressionParser {

    int maxIterations = 1;
    int minIterations = 0;

    public IterativeExpressionParserInterrogation(ChainExpressionParser nextExpression) {
        super(nextExpression);
    }

    public IterativeExpressionParserInterrogation() {
        super(null);
    }

    @Override
    protected String getParseableSymbol() {
        return "?";
    }

    @Override
    protected Expression parse(ParseableExpression expression, Expression lastExpression) {
        expression.getNextChar();
        lastExpression.setDisabled(true);
        return new IterativeExpression(lastExpression, minIterations, maxIterations);
    }
}

