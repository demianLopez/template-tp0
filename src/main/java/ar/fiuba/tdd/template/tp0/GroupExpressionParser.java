package ar.fiuba.tdd.template.tp0;

public class GroupExpressionParser extends ChainExpressionParser {

    String parseableSymbol = "[";
    String endParseSymbol = "]";

    public GroupExpressionParser(ChainExpressionParser nextExpression) {
        super(nextExpression);
    }
    public GroupExpressionParser() {
        super(null);
    }

    @Override
    protected boolean canIParse(ParseableExpression expression) {
        return (parseableSymbol.compareTo(expression.getCurrentChar()) == 0);
    }

    @Override
    protected Expression parse(ParseableExpression expression, Expression lastExpression) {
        if (canIParse(expression)) {
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

        return null;
    }
}
