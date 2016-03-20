package ar.fiuba.tdd.template.tp0;

public interface ExpressionParser {
    Expression parseExpression(ParseableExpression expression, Expression lastExpression);

    boolean isParseable(ParseableExpression expression);
}
