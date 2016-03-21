package ar.fiuba.tdd.template.tp0;

public abstract class SymbolExpressionParser extends ChainExpressionParser {

    protected String parseableSymbol;

    public SymbolExpressionParser(ChainExpressionParser nextExpression) {
        super(nextExpression);
        parseableSymbol = this.getParseableSymbol();
    }

    @Override
    protected boolean canIParse(ParseableExpression expression) {
        return (parseableSymbol.compareTo(expression.getCurrentChar()) == 0);

    }

    protected abstract String getParseableSymbol();
}
