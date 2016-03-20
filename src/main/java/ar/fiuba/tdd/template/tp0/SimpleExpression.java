package ar.fiuba.tdd.template.tp0;

public class SimpleExpression extends Expression {
    String expression;

    public SimpleExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public String buildExpression() {
        return expression;
    }
}
