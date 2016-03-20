package ar.fiuba.tdd.template.tp0;

public class LiteralExpressionParser extends SymbolExpressionParser {

    public LiteralExpressionParser(ChainExpressionParser nextExpression) {
        super(nextExpression);
    }

    public LiteralExpressionParser() {
        super(null);
    }

    @Override
    protected String getParseableSymbol() {
        return "\\";
    }

    @Override
    protected Expression parse(ParseableExpression expression, Expression lastExpression) {
        expression.getNextChar();
        return new SimpleExpression(expression.getNextChar());
    }
}
