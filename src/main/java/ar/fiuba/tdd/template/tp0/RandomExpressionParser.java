package ar.fiuba.tdd.template.tp0;

public class RandomExpressionParser extends SymbolExpressionParser {

    public RandomExpressionParser(ChainExpressionParser nextExpression) {
        super(nextExpression);
    }

    public RandomExpressionParser() {
        super(null);
    }

    @Override
    protected String getParseableSymbol() {
        return ".";
    }

    @Override
    protected Expression parse(ParseableExpression expression, Expression lastExpression) {
        expression.getNextChar();
        return new RandomExpression();
    }
}
