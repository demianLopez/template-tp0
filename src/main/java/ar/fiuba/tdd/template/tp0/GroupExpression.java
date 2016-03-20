package ar.fiuba.tdd.template.tp0;

import java.util.ArrayList;

public class GroupExpression implements Expression {

    ArrayList<Expression> expressionArray;

    public GroupExpression() {
        expressionArray = new ArrayList<>();
    }

    public void addExpression(Expression expression) {
        this.expressionArray.add(expression);
    }

    @Override
    public String generateExpression() {
        int randomExpression = (int) (Math.random() * (expressionArray.size()));
        return expressionArray.get(randomExpression).generateExpression();
    }
}
