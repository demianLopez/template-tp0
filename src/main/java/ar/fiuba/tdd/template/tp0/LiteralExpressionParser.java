package ar.fiuba.tdd.template.tp0;

public class LiteralExpressionParser extends ChainExpressionParser {

    String parseableSymbol = "\\";

    public LiteralExpressionParser(ChainExpressionParser nextExpression) {
        super(nextExpression);
    }

    public LiteralExpressionParser() {
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
            return new SimpleExpression(expression.getNextChar());
        }

        return null;
    }
}
