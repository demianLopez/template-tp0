package ar.fiuba.tdd.template.tp0;

import java.util.ArrayList;

public class GroupExpression extends Expression {

    ArrayList<Expression> expressionArray;

    public GroupExpression() {
        expressionArray = new ArrayList<>();
    }

    public void addExpression(Expression expression) {
        this.expressionArray.add(expression);
    }

    @Override
    public String buildExpression() {
        int randomExpression = (int) (Math.random() * (expressionArray.size()));
        return expressionArray.get(randomExpression).generateExpression();
    }
}
