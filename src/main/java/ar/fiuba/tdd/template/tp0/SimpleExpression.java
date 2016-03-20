package ar.fiuba.tdd.template.tp0;

public class SimpleExpression implements Expression {
    String expression;

    public SimpleExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public String generateExpression() {
        return expression;
    }
}
