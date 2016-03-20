package ar.fiuba.tdd.template.tp0;

public class IterativeExpressionParserPlus extends SymbolExpressionParser {

    int maxIterations = 20;
    int minIterations = 1;

    public IterativeExpressionParserPlus(ChainExpressionParser nextExpression) {
        super(nextExpression);
    }

    @Override
    protected String getParseableSymbol() {
        return "+";
    }

    public IterativeExpressionParserPlus() {
        super(null);
    }


    @Override
    protected Expression parse(ParseableExpression expression, Expression lastExpression) {
        expression.getNextChar();
        lastExpression.setDisabled(true);
        return new IterativeExpression(lastExpression, minIterations, maxIterations);
    }
}
