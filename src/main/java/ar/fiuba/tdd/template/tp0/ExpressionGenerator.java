package ar.fiuba.tdd.template.tp0;

public abstract class ExpressionGenerator {

    ChainExpressionParser chainExpressionParser;

    public ExpressionGenerator() {
        chainExpressionParser = buildExpressionParserChain();
    }

    public Expression generateExpression(String regularExpression) {
        ParseableExpression parseableExpression = new ParseableExpression(regularExpression);

        ArrayExpression arrayExpression = new ArrayExpression();

        Expression lastExpression = null;

        while (parseableExpression.hasNext()) {
            Expression currentExpression = chainExpressionParser.parseExpression(parseableExpression, lastExpression);
            lastExpression = currentExpression;
            arrayExpression.addExpression(currentExpression);
        }

        return arrayExpression;
    }

    protected abstract ChainExpressionParser buildExpressionParserChain();
}
