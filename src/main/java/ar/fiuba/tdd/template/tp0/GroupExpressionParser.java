package ar.fiuba.tdd.template.tp0;

public class GroupExpressionParser extends SymbolExpressionParser {

    String endParseSymbol = "]";

    public GroupExpressionParser(ChainExpressionParser nextExpression) {
        super(nextExpression);
    }

    public GroupExpressionParser() {
        super(null);
    }

    @Override
    protected String getParseableSymbol() {
        return "[";
    }

    @Override
    protected Expression parse(ParseableExpression expression, Expression lastExpression) {

        RegularExpressionGenerator regularExpressionGenerator = new RegularExpressionGenerator();

        expression.getNextChar();
        String currentChar = expression.getNextChar();

        GroupExpression groupExpression = new GroupExpression();

        while (currentChar.compareTo(endParseSymbol) != 0) {
            groupExpression.addExpression(regularExpressionGenerator.generateExpression(currentChar));
            currentChar = expression.getNextChar();
        }

        return groupExpression;

    }
}
